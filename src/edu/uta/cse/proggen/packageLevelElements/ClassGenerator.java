package edu.uta.cse.proggen.packageLevelElements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import edu.uta.cse.proggen.classLevelElements.Field;
import edu.uta.cse.proggen.classLevelElements.Method;
import edu.uta.cse.proggen.classLevelElements.MethodSignature;
import edu.uta.cse.proggen.classLevelElements.Type;
import edu.uta.cse.proggen.classLevelElements.Variable;
import edu.uta.cse.proggen.classLevelElements.Type.Primitives;
import edu.uta.cse.proggen.configurationParser.ConfigurationXMLParser;
import edu.uta.cse.proggen.expressions.Literal;
import edu.uta.cse.proggen.util.ProgGenUtil;

/**
 * Represents a class in the generated application.
 * 
 * @author balamurugan
 *
 */
public class ClassGenerator 
{
	private String 	fileName;
	private int 	numOfVars;
	private int 	percent;
	private int 	loc;
	private int 	nestedIfCounter = 0;
	private int 	maxNestedIfs = 30;
	private int 	maxAllowedMethodCalls = ProgGenUtil.maxNoOfMethodCalls;
	private int 	methCounter = 0;
	private int 	methCalledCounter = 0;
	private int 	locPerMethod = 0;
	private boolean	preGenerate = false;
	
	/** Holds actual class body*/
	private String 	program = "";
	private int 	numberOfMethods = 1;
	
	private Random 							rand = new Random(System.currentTimeMillis());
	
	private Set<Field> 						usedFields	= new HashSet<Field>();
	private ArrayList<Field> 				fields = new ArrayList<Field>();
	
	private ClassGenerator 					superClass = null;
	private HashSet<ClassGenerator> 		subClasses = new  HashSet<ClassGenerator>();
	
	private ArrayList<Method> 				methodList = new ArrayList<Method>();
	private ArrayList<MethodSignature> 		overriddenMethods = new ArrayList<MethodSignature>();
	private ArrayList<MethodSignature>		methodSignatures = new ArrayList<MethodSignature>();
	
	private ArrayList<InterfaceGenerator> 	interfaceList = new ArrayList<InterfaceGenerator>();
	private Set<Primitives>					returnTypeSet = new HashSet<Primitives>();
	
	
	/**
	 * @param fileName
	 * @param loc
	 * @param superClass
	 */
	public ClassGenerator(String fileName, 
			int loc, 
			ClassGenerator superClass) 
	{
		super();
		this.fileName = fileName;
		//Atleast one variable per class. Added in response to Ishtiaque's comment.
		int maxNoOfVars = ConfigurationXMLParser.getPropertyAsInt("maxNoOfClassFields");
		int minNoOfFields = ConfigurationXMLParser.getPropertyAsInt("minNoOfClassFields");
		
		// to avoid Illegal argument exception
		if(maxNoOfVars != 0)
			this.numOfVars = new Random().nextInt(maxNoOfVars);
		else
			this.numOfVars = 0;
		
		if(numOfVars < minNoOfFields)
		{
			numOfVars = minNoOfFields;
		}
		this.numberOfMethods = 0;
		this.loc = loc;
		this.percent = ConfigurationXMLParser.getPropertyAsInt("probability");
		this.maxNestedIfs = ConfigurationXMLParser.getPropertyAsInt("maxNestedIfs");
		this.maxAllowedMethodCalls = ConfigurationXMLParser.getPropertyAsInt("maxAllowedMethodCalls");
		this.superClass = superClass;
	}

	/**
	 * pre-generation determines the class members, variables and method signatures
	 * @param classList
	 * @param preGeneratedClasses
	 */
	public void preGenerateForMethodSignature(ArrayList<ClassGenerator> classList,
			HashSet<String> preGeneratedClasses) 
	{
		if(preGenerate)
		{
			//pre generation should happen only once.
			return;
		}
		// superclass should have its methods signature ready first
		if(this.getSuperClass() != null &&
				(!preGeneratedClasses.contains(this.getSuperClass().getFileName())))
		{
			this.getSuperClass().preGenerateForMethodSignature(classList, preGeneratedClasses);
		}
		
		// add class fields
		//classList is used all the way down to "new Type()"
		generateClassFields(classList);
		
		System.out.println("calculating number of methods...");
		//calculate number of methods
		calculateNumberOfMethods();
		
		System.out.println("overriding interface methods...");
		//first override methods of implemented interfaces
		overrideInterfaceMethods(classList);
		
		System.out.println("generating member method signatures...");
		generateMethodSignatures(classList);
		
		preGeneratedClasses.add(fileName);
		preGenerate = true;
	}
	
	/**
	 * Generates the actual body or content of the class 
	 * and updates the set  'generatedClasses' Set of 
	 * @param classList List of created class objects
	 * @param generatedClasses Set of already generated class names
	 */	
	public void generate(ArrayList<ClassGenerator> classList, 
			HashSet<String> generatedClasses, 
			HashSet<String> preGeneratedClasses)
	{
		program = "";
		
		if(this.getSuperClass() != null &&
				(!generatedClasses.contains(this.getSuperClass().getFileName())))
		{
			this.getSuperClass().generate(classList, generatedClasses, preGeneratedClasses);
		}
		
		if(!preGenerate)
		{
			preGenerateForMethodSignature(classList, preGeneratedClasses);
		}
		
		// append package name
		appendPackageName();
		appendImportStatements();
		//append import statements
		if(ProgGenUtil.useQueries)
		{
			appendImportStatements();
		}
		
		System.out.println("appending classname...");
		// append class name
		appendClassName();
		
		System.out.println("Injecting contents...");
		//append injected contents from external file
		appendInjectedContents();

		System.out.println("appending field names...");
		// append field names
		appendFieldNames();
		
		// append constructor  
		appendConstructor();
		System.out.println("generating class methods...");
		
		
		
		//append Create method to the class to create database tables 
		appendCreateSQL();
		
		//append Insert method to the class to insert data into created tables
		appendInsertSQL();
		
		//append Select method to the class to query the created tables
		appendSelectSQL();
		
		//append Update method to the class to update a tuple from the created tables
		appendUpdateSQL();
		
		//append Delete method to the class to delete a tuple from the created tables
		appendDeleteSQL();
		
		//append Drop method to the class to remove the created tables
		appendDropSQL();
		
		
		//generate methods
		generateMethods(classList);
		
		System.out.println("writing main...");
		generateMain();
		
		//generate SingleEntry for CarFast
		System.out.println("writing singleEntry.....");
		generateSingleEntry();
		
		System.out.println("writing end of class...");
		//write end of class
		generateEndOfClass();
		
		generateDBConfig();
		
		generatedClasses.add(this.getFileName());
	}
	
	private void appendImportStatements()
	{
		program += "import java.sql.*;\n";
		program += "import java.util.*;\n";
		program += "import java.util.Random;\n\n\n";
	}
	/*
	 * This method defines the parameterized constructor which will be initialize the connection config and tables Names
	 */
	private void appendConstructor()
	{
		 program += "public " + fileName + "() {"
		 		+ "}\n";
		 //get the HashMap of the list of method names and parameters count and the connection config for database		 
		 program += "public " + fileName + "(HashMap<String,Integer> a,Connection c) {"
		 		+ "\n this.tableNames=a;" // assign method names as table names
		 		+ "this.connect=c;"
		 		+ "\n} \n\n";
	
	}
	private void appendInjectedContents() 
	{
		program += ProgGenUtil.getInjectContents();
	}

	private void overrideInterfaceMethods(ArrayList<ClassGenerator> classList) 
	{
		for(InterfaceGenerator interfaceGen : interfaceList)
		{
			for(MethodSignature signature : interfaceGen.getMethodSignatures())
			{
				Primitives returnType = signature.getReturnType();
				if( returnType != Primitives.OBJECT )
				{
					returnTypeSet.add(returnType);
				}
			}
			methodSignatures.addAll(interfaceGen.getMethodSignatures());
		}
	}
	/*
	 * This method appends dropSQL method to the class 
	 * which drops all the created tables.  
	 */
	public void appendDropSQL()
	{
		program+="public void dropSQL() throws Exception {\n";
		// Add Try block to the Create method
		appendTryBlock();
		program+="for (Map.Entry<String, Integer> entry : tableNames.entrySet()){\n" // Iterates the list of table names
		 		+ "statement = connect.prepareStatement(\"DROP TABLE \"+entry.getKey());"
		 		+ "statement.executeUpdate();\n}"
		 		+ "\n}";
         	
		// Add Catch block to catch SQL Exception   	
		appendCatchBlock();
		//appendFinallyBlock();
		program+="}\n";
		
	}
	// Add Try block to the Create method
	public void appendTryBlock()
	{
		program+="\ntry{";
	}
	// Add Catch block to catch SQL Exception
	public void appendCatchBlock()
	{
		program+="\n\ncatch(Exception e)"
				+ "{\n throw e;"
				+ "}\n";
	}
	// Add Finally block to close connection
	public void appendFinallyBlock(){
				program+= "finally{\n"
				+ "statement.close();\n"
				+ "connect.close();\n"
				+ "}\n";
				
	}
	/*
	 * This method appends the CreateSQL method to the class
	 * which create tables and use list of method names as table names and method parameters as attributes. 
	 */
	public void appendCreateSQL()
	{
		program+="\npublic void createSQL() throws Exception {\n";
		// Add Try block to the Create method
		appendTryBlock();
		program+=""
				+ "\n"
				+ "for (Map.Entry<String, Integer> entry : tableNames.entrySet()){\n" // Iterates the list of table names
				+ "String s2=\"\";\n"
				+ "for(int i=0;i<entry.getValue();i++)\n"
				+ "{\n"
				+ "if(i!=entry.getValue()-1)\n"
				+ "s2+=\"column\"+i+\" varchar(10),\";\n"
						+ "else\n"
						+ "s2+=\"column\"+i+\" varchar(10)\";\n"
								+ "}\n"
								+ "String s1= entry.getKey()+\" (\"+\n"
										+ "s2 +  \")\";  \n"
												+ "statement = connect.prepareStatement(\"CREATE TABLE \"+s1);\n"
														+ "statement.executeUpdate();\n"
														+ "}\n"
														+ "}\n";
								 
		// Add Catch block to catch SQL Exception     		 
		appendCatchBlock();
		
		program+="}\n";
	}
	/*
	 * This method inserts data into created tables and as of now data is hardcoded, later data will be loaded from the data file. 
	 */
	public void appendInsertSQL()
	{
		program+="\npublic void insertSQL() throws Exception {\n";
		// Add Try block to the Insert method
		appendTryBlock();
		program+=""
				+ "\n"
				+ "for (Map.Entry<String, Integer> entry : tableNames.entrySet()){\n" // Iterates the list of table names
				+ "String s2=\"\";\n"
				+ "for(int i=0;i<entry.getValue();i++)\n"
				+ "{\n"
				+ "if(i!=entry.getValue()-1)\n"
				+ "s2+=\"'100',\";\n"
						+ "else\n"
						+ "s2+=\"'100'\";\n"
								+ "}\n"
								+ "String s1= \" (\"+\n"
										+ "s2 +  \")\";  \n"
												+ "statement = connect.prepareStatement(\"INSERT INTO \"+entry.getKey()+ \" VALUES\"+s1);\n"
														+ "statement.executeUpdate();\n"
														+ "}\n"
														+ "}\n";
								 
		// Add Try block to catch SQL Exception    		 
		appendCatchBlock();
		
		program+="}\n";
	}
	/*
	 * This method queries data from created tables and as of now data is queried using one attribute 
	 * later joins and nested queries will be added. 
	 */
	public void appendSelectSQL()
	{
		program+="\npublic void selectSQL() throws Exception {\n";
		// Add Try block to the Select method
		appendTryBlock();
		//DELETE
		program+="\nfor (Map.Entry<String, Integer> entry : tableNames.entrySet()){\n" // Iterates the list of table names
				+ "statement = connect.prepareStatement(\"SELECT * FROM \"+entry.getKey()+ \" WHERE COLUMN0='100'\");\n"
						+ "statement.executeQuery();\n"
						+ "}\n"
						+ "}\n";
		// Add Catch block to catch SQL Exception      
        appendCatchBlock();
        program+="}\n";
	}
	/*
	 * This method update a tuple for a single attribute. 
	 * . 
	 */
	public void appendUpdateSQL()
	{

		program+="\npublic void updateSQL() throws Exception {\n";
		// Add Try block to the Update method
		appendTryBlock();
		//DELETE
		program+="\nfor (Map.Entry<String, Integer> entry : tableNames.entrySet()){\n" // Iterates the list of table names
				+ "statement = connect.prepareStatement(\"UPDATE \"+entry.getKey()+ \"  SET COLUMN0='10' where COLUMN0='100'\");\n"
						+ "statement.executeUpdate();\n"
						+ "}\n"
						+ "}\n";
		// Add Catch block to catch SQL Exception       
        appendCatchBlock();
        program+="}\n";
	}
	/*
	 * This method delete a tuple from the created tables for a single attribute. 
	 * . 
	 */
	public void appendDeleteSQL()
	{
		program+="\npublic void deleteSQL() throws Exception {\n";
		// Add Try block to the Delete method
		appendTryBlock();
		//DELETE
		program+="\nfor (Map.Entry<String, Integer> entry : tableNames.entrySet()){\n" // Iterates the list of table names
				+ "statement = connect.prepareStatement(\"DELETE FROM \"+entry.getKey()+ \" WHERE COLUMN0='100'\");\n"
						+ "statement.executeUpdate();\n"
						+ "}\n"
						+ "}\n";
		// Add Catch block to catch SQL Exception       
        appendCatchBlock();
        program+="}\n";
	}
	private void generateMethods(ArrayList<ClassGenerator> classList)
	{
		for(MethodSignature signature : methodSignatures)
		{
			Method method = Method.getMethod(signature, 
								this, 
								classList,
								locPerMethod,
								this.maxNestedIfs,
								this.maxAllowedMethodCalls);
			program += method;
			methodList.add(method);
		}
	}

	private void calculateNumberOfMethods() 
	{
		int totalNumberOfMethods = 0;
		numberOfMethods = 0;
		
		//atleast two methods
		if(ProgGenUtil.maxNoOfMethodsPerClass < 2)
		{
			System.out.println("Setting number of methods per class as 2.");
			numberOfMethods = 2;
		}
		else if(ProgGenUtil.maxNoOfMethodsPerClass == 2)
		{
			numberOfMethods = 2;
		}
		else
		{
			numberOfMethods = rand.nextInt(ProgGenUtil.maxNoOfMethodsPerClass - 2) + 2;
		}
		
		totalNumberOfMethods += numberOfMethods;
		//add the number of methods from the implemented interfaces.
		for(InterfaceGenerator interfaceGen : interfaceList)
		{
			totalNumberOfMethods += interfaceGen.getNumOfMethods();
		}

		locPerMethod = this.loc/totalNumberOfMethods;
	}

	public int getMaxNestedIfs() {
		return maxNestedIfs;
	}

	public void setMaxNestedIfs(int maxNestedIfs) {
		this.maxNestedIfs = maxNestedIfs;
	}

	public ArrayList<MethodSignature> getMethodSignatures() {
		return methodSignatures;
	}

	public Set<Primitives> getReturnTypeSet() {
		return returnTypeSet;
	}

	public int getMaxAllowedMethodCalls() {
		return maxAllowedMethodCalls;
	}

	public void setMaxAllowedMethodCalls(int maxAllowedMethodCalls) {
		this.maxAllowedMethodCalls = maxAllowedMethodCalls;
	}

	public int getMethCounter() {
		return methCounter;
	}

	public void setMethCounter(int methCounter) {
		this.methCounter = methCounter;
	}

	public ClassGenerator getSuperClass() {
		return superClass;
	}

	public void setSuperClass(ClassGenerator superClass) {
		this.superClass = superClass;
	}

	public ArrayList<InterfaceGenerator> getInterfaceList() {
		return interfaceList;
	}

	public void setInterfaceList(ArrayList<InterfaceGenerator> interfaceList) {
		this.interfaceList = interfaceList;
	}

	public int getPercent() 
	{
		return percent;
	}
	
	public ArrayList<Method> getMethodList() {
		return this.methodList;
	}

	public void setMethodList(ArrayList<Method> methodList) {
		this.methodList = methodList;
	}

	public HashSet<ClassGenerator> getSubClasses() {
		return subClasses;
	}

	public int getMethCalledCounter() {
		return methCalledCounter;
	}

	public void setMethCalledCounter(int methCalledCounter) {
		this.methCalledCounter = methCalledCounter;
	}

	public Set<Field> getUsedFields() {
		return usedFields;
	}

	public void setUsedFields(Set<Field> usedFields) {
		this.usedFields = usedFields;
	}

	public ArrayList<Field> getFields() {
		return fields;
	}

	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}

	@Override
	public String toString() 
	{
		return program;
	}
	
	private void generateDBConfig()
	{
	      /*program+=" try { "
	      		+ "Class.forName(\"org.apache.derby.jdbc.ClientDriver\").newInstance();"
	            		+ "	            connect = DriverManager"
	            		+ ".getConnection(\"jdbc:derby://localhost:1527/sample;create=true\",\"user\",\"user\");";*/
	            
	                    
	}
	/*
	 * This function generates the main method of the class- added config parameters to connect to the database and also 
	 * collects the methods names and parameters into hashMap.
	 * Further it calls the createSQL,insertSQL, updateSQL,seleteSQL deleteSQL,DropSQl methods
	 */
	private void generateMain()
	{
		program += "\npublic static void main(String args[]) throws Exception{\n";
		appendTryBlock();
		program += "HashMap<String,Integer> h=new HashMap<String,Integer>();\n"
				+ "Connection connect1=null;\n"
				+ "connect1 = DriverManager.getConnection(\"jdbc:derby://localhost:1527/sample;create=true\",\"user\",\"user\");\n";
		
		program += this.fileName + " obj = new " + this.fileName +"(h,connect1);\n";
		
		for(Method method : this.methodList)
		{
			StringBuilder builder = new StringBuilder();
			
			MethodSignature signature = method.getMethodSignature();
			if(!signature.isStatic())
			{
				builder.append("obj."); 
			}
			
			builder.append(signature.getName() + "(");
			
			for(Variable variable : signature.getParameterList())
			{
				Type type = variable.getType();
				if( type.getType() == Primitives.OBJECT)
				{
					builder.append("new " + type.toString() + "()");
					builder.append(",");
				}
				else
				{
					if(variable.getName().equals("recursionCounter"))
					{
						builder.append(new Random().nextInt(ProgGenUtil.maxRecursionDepth));
					}
					else
					{
						builder.append(new Literal(type.getType()));
					}
					builder.append(",");
				}
			}
			String str = builder.toString();
			str = str.substring(0, str.length() - 1);
			str += ");\n";
			program+="h.put(\""+signature.getName()+"\","+signature.getParameterList().size()+");\n";
			program += str;
		}
		program += "obj.createSQL();\n";
		program += "obj.insertSQL();\n";
		program += "obj.selectSQL();\n";
		program += "obj.updateSQL();\n";
		program += "obj.dropSQL();\n";
		program += "}\n";
		appendCatchBlock();
		program += "}\n";
	}
	
	
	//Single Entry point for CarFast
	//TODO: support other parameter types
	private void generateSingleEntry()
	{
		program += "\npublic static void singleEntry(";
		
		StringBuilder param = new StringBuilder();
		
		for(int i =0; i< ProgGenUtil.maxNoOfParameters; i++)
			param.append("int i"+i+",");
		
		String st = param.toString();
		st = st.substring(0, st.length()-1);
		st += "){\n";
		
		program += st;
		
		
		program += this.fileName + " obj = new " + this.fileName +"();\n";
		for(Method method : this.methodList)
		{
			HashSet<Integer> set = new HashSet<Integer>(); 
			StringBuilder builder = new StringBuilder();
			
			MethodSignature signature = method.getMethodSignature();
			if(!signature.isStatic())
			{
				builder.append("obj."); 
			}
			
			builder.append(signature.getName() + "(");
			
			for(Variable variable : signature.getParameterList())
			{
				Type type = variable.getType();
				if( type.getType() == Primitives.OBJECT)
				{
					builder.append("new " + type.toString() + "()");
					builder.append(",");
				}
				else
				{
					if(variable.getName().equals("recursionCounter"))
					{
						builder.append(new Random().nextInt(ProgGenUtil.maxRecursionDepth));
					}
					else
					{
						if(type.getType() != Primitives.INT )
							builder.append(new Literal(type.getType()));
						else{
							boolean addedToSet = false;
							do{
								int var = new Random().nextInt(ProgGenUtil.maxNoOfParameters);
								addedToSet = set.add(var);
								if(addedToSet){
									builder.append("i"+var);
								}
							}while(!addedToSet);
							
						}
					}
					builder.append(",");
				}
			}
			String str = builder.toString();
			str = str.substring(0, str.length() - 1);
			str += ");\n";
			
			program += str;
		}
		program += "}\n";
	}
	
	private void generateEndOfClass() 
	{
		// closing brace of the class
		program += "\n}"; 
	}

	private MethodSignature overRiddenMethod(ArrayList<ClassGenerator> classList,
			int loc)
	{
		ArrayList<MethodSignature> superClassMethodSignatures = this.superClass.methodSignatures;
		MethodSignature methodToOverride = superClassMethodSignatures.get(rand.nextInt(superClassMethodSignatures.size()));
		int counter = this.superClass.numberOfMethods;
		
		while( ( overriddenMethods.contains(methodToOverride) 
				|| methodSignatures.contains(methodToOverride) )
				&& counter > 0 )
		{
			methodToOverride = superClassMethodSignatures.get(rand.nextInt(superClassMethodSignatures.size()));
			counter--;
		}
		
		if(counter == 0)
		{
			System.out.println("overriddenMethod()::returning null due to lack of methods in super class.");
			return null;
		}
		
		overriddenMethods.add(methodToOverride);
		Primitives returnType = methodToOverride.getReturnType();
		if(returnType != Primitives.OBJECT)
		{
			returnTypeSet.add(returnType);
		}
		return methodToOverride;
	}


	private void generateMethodSignatures(ArrayList<ClassGenerator> classList) 
	{
		for (int i = 0; i<numberOfMethods; i++) 
		{
			if(this.superClass != null)
			{
				//flip a coin(1 out of 3) to decide for method override
				int choiceOverride = rand.nextInt(3);
				if(choiceOverride == 0)
				{
					MethodSignature overridenMethod = overRiddenMethod(classList, locPerMethod);
					if(overridenMethod != null)
					{
						methodSignatures.add(overridenMethod);
						continue;
					}
					//else fallthrough and generate normal class method
				}
			}
			
			//Basically creating MethodSignature
			Method method =  Method.generateMethod(
						this,
						ProgGenUtil.maxNoOfParameters, 
						classList, 
						this.fileName + "method" + i,
						locPerMethod,
						this.maxNestedIfs,
						this.maxAllowedMethodCalls,
						false);
				
			methodSignatures.add(method.getMethodSignature());
			Primitives returnType = method.getReturnType();
			if(returnType != Primitives.OBJECT)
			{
				returnTypeSet.add(returnType);
			}
		}
	}
	
	/**
	 * Gives the corresponding class name
	 * @return Name of the Class
	 */
	public String getFileName() 
	{
		return fileName;
	}

	private void appendFieldNames() 
	{
		for (int i = 0; i < fields.size(); i++) 
		{
			program += fields.get(i).getFieldDeclaration() + ";\n";
		}
		program +="HashMap<String,Integer> tableNames;"
		+ "private Connection connect = null;\n"
 		+ "private PreparedStatement statement = null;\n"
 		+ "private ResultSet resultSet = null;\n";
		program += "\n\n";
	}

	private void appendClassName() 
	{
		program += "public class " + fileName;
		
		if(this.superClass != null)
		{
			program += " extends " + superClass.getFileName();
			superClass.addSubClass(this);
		}
		
		if(this.interfaceList.size()>0)
		{
			program += " implements ";
			for(InterfaceGenerator interfaceGen : interfaceList)
			{
				System.out.println("implementing interface : " + interfaceGen.getName());
				program += interfaceGen.getName() + ", ";
			}
			
			program = program.substring(0, program.length()-2);
		}
		
		program += " {\n";
	}

	private void addSubClass(ClassGenerator classGenerator) 
	{
		this.subClasses.add(classGenerator);
	}

	private void appendPackageName() 
	{
		program += "package com.accenture.lab.carfast.test;\n\n\n";
	}

	private void generateClassFields(ArrayList<ClassGenerator> classList) 
	{
		for (int i = 0; i < numOfVars; i++) 
		{
			fields.add( Field.generateField("f" + i, classList) );
		}
	}

	public void setNestedIfCounter(int nestedIfCounter) 
	{
		this.nestedIfCounter = nestedIfCounter;
	}

	public int getNestedIfCounter() 
	{
		return nestedIfCounter;
	}

	public ArrayList<MethodSignature> getMethodSignatures(Type returnType) 
	{
		ArrayList<MethodSignature> list = new ArrayList<MethodSignature>();
		for(MethodSignature signature : methodSignatures)
		{
			if(signature.getReturnType().equals(returnType.getType()))
			{
				list.add(signature);
			}
		}
		return list;
	}
}
