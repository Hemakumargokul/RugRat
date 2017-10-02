package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP16 extends TP8 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP16() {}
public TP16(HashMap<String,Integer> a,Connection c) {
 this.tableNames=a;this.connect=c;
} 


public void createSQL() throws Exception {

try{
for (Map.Entry<String, Integer> entry : tableNames.entrySet()){
String s2="";
for(int i=0;i<entry.getValue();i++)
{
if(i!=entry.getValue()-1)
s2+="column"+i+" varchar(10),";
else
s2+="column"+i+" varchar(10)";
}
String s1= entry.getKey()+" ("+
s2 +  ")";  
statement = connect.prepareStatement("CREATE TABLE "+s1);
statement.executeUpdate();
}
}


catch(Exception e){
 throw e;}
}

public void insertSQL() throws Exception {

try{
for (Map.Entry<String, Integer> entry : tableNames.entrySet()){
String s2="";
for(int i=0;i<entry.getValue();i++)
{
if(i!=entry.getValue()-1)
s2+="'100',";
else
s2+="'100'";
}
String s1= " ("+
s2 +  ")";  
statement = connect.prepareStatement("INSERT INTO "+entry.getKey()+ " VALUES"+s1);
statement.executeUpdate();
}
}


catch(Exception e){
 throw e;}
}

public void selectSQL() throws Exception {

try{
for (Map.Entry<String, Integer> entry : tableNames.entrySet()){
statement = connect.prepareStatement("SELECT * FROM "+entry.getKey()+ " WHERE COLUMN0='100'");
statement.executeQuery();
}
}


catch(Exception e){
 throw e;}
}

public void updateSQL() throws Exception {

try{
for (Map.Entry<String, Integer> entry : tableNames.entrySet()){
statement = connect.prepareStatement("UPDATE "+entry.getKey()+ "  SET COLUMN0='10' where COLUMN0='100'");
statement.executeUpdate();
}
}


catch(Exception e){
 throw e;}
}

public void deleteSQL() throws Exception {

try{
for (Map.Entry<String, Integer> entry : tableNames.entrySet()){
statement = connect.prepareStatement("DELETE FROM "+entry.getKey()+ " WHERE COLUMN0='100'");
statement.executeUpdate();
}
}


catch(Exception e){
 throw e;}
}
public void dropSQL() throws Exception {

try{for (Map.Entry<String, Integer> entry : tableNames.entrySet()){
statement = connect.prepareStatement("DROP TABLE "+entry.getKey());statement.executeUpdate();
}
}

catch(Exception e){
 throw e;}
}
public int TP16method0(int var0, int var1, int var2, int var3, int var4){
 switch(((var3-(int)(37))/(int)(23))){
case 0:
var3 = (int)((var0+var1)*(var2-(int)(20)));
 break;
case 1:
var0 = (int)((((var1+var3)-(var1-var3))/(int)(7))+((var1*var2)*(var3-(int)(9))));
 break;
case 2:
var1 = TP8method2(var3,var2,var0,var1);
 break;
case 3:
var1 = TP16method2(var1,var1,var2,var4);
 break;
case 4:
var2 = (int)(((var2%(int)(20))/(int)(36))/(int)(24));
 break;
case 5:
var2 = (int)(var0-var4);
 break;
case 6:
System.out.println("TP16 - TP16method0- LineInMethod: 20");
 break;
case 7:
var1 = (int)(((var0%(int)(20))*(var3*var4))%(int)(2));
 break;
case 8:
System.out.println("TP16 - TP16method0- LineInMethod: 27");
 break;
default :
var1 = (int)((var1-var0)*(var3+var2));
}
return (int)var1;

}

public int TP8method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var10*var6)){
case 0:
var6 = (int)(5);
 break;
case 1:
System.out.println("TP16 - TP8method4- LineInMethod: 4");
 break;
case 2:
System.out.println("TP16 - TP8method4- LineInMethod: 10");
 break;
case 3:
System.out.println("TP16 - TP8method4- LineInMethod: 14");
 break;
case 4:
System.out.println("TP16 - TP8method4- LineInMethod: 17");
 break;
default :
var12 = (int)(((var8/(int)(24))*((var6/(int)(35))+(((var5*(int)(28))-(var9+var4))+(var9-var5))))+((var2*var7)*(var2-var4)));
}
return (int)var5;

}

public int TP16method2(int var0, int var1, int var2, int var3){
 switch((var3+(int)(9))){
case 0:
var0 = (int)((var3%(int)(41))-(var0-var1));
 break;
case 1:
var1 = TP8method4(var3,var0,var3,var1,var0,var2,var2,var1,var0,var0,var1,var3,var0);
 break;
case 2:
var2 = (int)(var3-(int)(34));
 break;
case 3:
System.out.println("TP16 - TP16method2- LineInMethod: 11");
 break;
default :
System.out.println("TP16 - TP16method2- LineInMethod: 15");
}
return (int)var3;

}

public static int TP8method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if((((var5-var1)-(var12*var7))==((var4+var1)/(int)(19)))){
System.out.println("TP16 - TP8method1- LineInMethod: 4");
}
else{
 TP8method3(var3,var5,var5,var10,var11,var12,var9);}
return (int)var8;

}

public int TP16method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var3*(int)(24))){
case 0:
System.out.println("TP16 - TP16method4- LineInMethod: 2");
 break;
case 1:
var0 = (int)(17);
 break;
case 2:
var1 = (int)(40);
 break;
case 3:
var8 = (int)((var2+(int)(34))+(var6*var10));
 break;
case 4:
var3 = (int)(var4-var0);
 break;
case 5:
System.out.println("TP16 - TP16method4- LineInMethod: 16");
 break;
case 6:
System.out.println("TP16 - TP16method4- LineInMethod: 19");
 break;
default :
System.out.println("TP16 - TP16method4- LineInMethod: 26");
}
return (int)var11;

}

public static int TP8method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if(((var0+var1)>=(var0/(int)(26)))){
var6 = (int)(var6*var5);
}
else{
 System.out.println("TP16 - TP8method3- LineInMethod: 5");
}
return (int)var4;

}

public static int TP8method2(int var0, int var1, int var2, int var3){
 switch(((var3/(int)(29))+(var2+(int)(34)))){
case 0:
var3 = (int)(27);
 break;
case 1:
var0 = (int)((var1*(int)(23))-(var2-(int)(41)));
 break;
case 2:
var0 = (int)((var3-var0)-(var2-var1));
 break;
case 3:
System.out.println("TP16 - TP8method2- LineInMethod: 10");
 break;
case 4:
var0 = (int)((var0*var2)%(int)(31));
 break;
case 5:
System.out.println("TP16 - TP8method2- LineInMethod: 16");
 break;
case 6:
var2 = (int)((var0-var3)*(var2%(int)(32)));
 break;
default :
var1 = (int)((var1+var0)+(var0+var1));
}
return (int)var1;

}

public int TP16method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var4*var1)){
case 0:
System.out.println("TP16 - TP16method7- LineInMethod: 2");
 break;
case 1:
var7 = (int)((var1*var3)+((var5-(int)(17))/(int)(40)));
 break;
default :
System.out.println("TP16 - TP16method7- LineInMethod: 11");
}
return (int)var0;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP16 obj = new TP16(h,connect1);
h.put("TP16method0",5);
obj.TP16method0((int)(20),(int)(27),(int)(30),(int)(27),(int)(30));
h.put("TP8method4",13);
obj.TP8method4((int)(21),(int)(17),(int)(36),(int)(43),(int)(46),(int)(25),(int)(41),(int)(17),(int)(20),(int)(7),(int)(10),(int)(43),(int)(8));
h.put("TP16method2",4);
obj.TP16method2((int)(8),(int)(49),(int)(36),(int)(31));
h.put("TP8method1",13);
TP8method1((int)(0),(int)(11),(int)(8),(int)(34),(int)(22),(int)(4),(int)(49),(int)(3),(int)(49),(int)(22),(int)(13),(int)(27),(int)(1));
h.put("TP16method4",12);
obj.TP16method4((int)(6),(int)(11),(int)(39),(int)(41),(int)(43),(int)(27),(int)(4),(int)(19),(int)(5),(int)(7),(int)(47),(int)(19));
h.put("TP8method3",7);
TP8method3((int)(46),(int)(48),(int)(5),(int)(26),(int)(42),(int)(26),(int)(45));
h.put("TP8method2",4);
TP8method2((int)(49),(int)(1),(int)(19),(int)(49));
h.put("TP16method7",8);
obj.TP16method7((int)(36),(int)(17),(int)(38),(int)(2),(int)(38),(int)(7),(int)(8),(int)(0));
obj.createSQL();
obj.insertSQL();
obj.selectSQL();
obj.updateSQL();
obj.dropSQL();
}


catch(Exception e){
 throw e;}
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP16 obj = new TP16();
obj.TP16method0(i2,i0,i11,i5,i7);
obj.TP8method4(i13,i2,i10,i6,i8,i7,i9,i14,i3,i11,i0,i1,i12);
obj.TP16method2(i8,i14,i11,i10);
TP8method1(i0,i13,i6,i11,i2,i5,i4,i8,i10,i14,i12,i1,i3);
obj.TP16method4(i3,i10,i8,i5,i6,i1,i4,i2,i11,i14,i7,i13);
TP8method3(i4,i6,i14,i8,i10,i12,i9);
TP8method2(i7,i8,i4,i11);
obj.TP16method7(i12,i14,i7,i9,i6,i13,i1,i2);
}

}