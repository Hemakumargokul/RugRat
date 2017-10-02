package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP2 implements TPInterface2 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP2() {}
public TP2(HashMap<String,Integer> a,Connection c) {
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
public int TPInterface2Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var10+var2)){
case 0:
var1 = (int)(43);
 break;
case 1:
TP2method5(var0,var5,var1,var9); break;
case 2:
System.out.println("TP2 - TPInterface2Method0- LineInMethod: 7");
 break;
case 3:
var10 = (int)(((var2-var11)/(int)(2))-(var0*var6));
 break;
case 4:
var1 = (int)(var9/(int)(39));
 break;
case 5:
var6 = (int)((var7+var10)%(int)(8));
 break;
case 6:
System.out.println("TP2 - TPInterface2Method0- LineInMethod: 21");
 break;
case 7:
System.out.println("TP2 - TPInterface2Method0- LineInMethod: 27");
 break;
case 8:
System.out.println("TP2 - TPInterface2Method0- LineInMethod: 34");
 break;
default :
var11 = (int)(var0+var11);
}
return (int)var8;

}

public int TP2method0(int var0, int var1, int var2, int var3){
 switch((var1-(int)(24))){
case 0:
var3 = (int)(var1-var2);
 break;
case 1:
TP2method2(var2,var0,var2,var2,var1); break;
default :
System.out.println("TP2 - TP2method0- LineInMethod: 8");
}
return (int)var0;

}

public int TP2method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var3+(int)(10))){
case 0:
TP2method2(var9,var0,var7,var10,var1); break;
case 1:
System.out.println("TP2 - TP2method1- LineInMethod: 5");
 break;
case 2:
var1 = (int)((var11*var6)*(var1*var11));
 break;
default :
var0 = (int)((var11-(int)(47))+(var1+(int)(20)));
}
return (int)var4;

}

public int TP2method2(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 1; i++){
 if( ((var3+var0)<((var4*(int)(45))/(int)(24)))){
if( ((var2*var1)>=(var1-(int)(28)))){
if( ((var2-var3)>=(var0+(int)(22)))){
System.out.println("TP2 - TP2method2- LineInMethod: 8");
}
}
}
}
return (int)var3;

}

public int TP2method3(int var0, int var1, int var2, int var3){
 if( ((var0*var2)==(var3*(int)(27)))){
if( ((var3+var1)>=((((var3/(int)(39))*(var0+var2))+(var0%(int)(27)))+(var3*var1)))){
var2 = (int)(34);
}
}
if(((var1*var2)<=(var1+var0))){
var2 = TP2method6(var1,var1,var0,var0);
}
else{
 var3 = (int)((var1-var3)+((var3-var1)+((var1-var0)%(int)(15))));
}
return (int)var3;

}

public int TP2method4(int var0, int var1, int var2, int var3, int var4){
 switch((var2+var0)){
case 0:
System.out.println("TP2 - TP2method4- LineInMethod: 2");
 break;
case 1:
var1 = TP2method6(var2,var1,var4,var0);
 break;
case 2:
var0 = (int)((var1-var4)-(var2%(int)(32)));
 break;
default :
System.out.println("TP2 - TP2method4- LineInMethod: 11");
}
return (int)var2;

}

public static int TP2method5(int var0, int var1, int var2, int var3){
 if(((((var3+(int)(26))+(var2+(int)(30)))%(int)(22))<(var3/(int)(13)))){
System.out.println("TP2 - TP2method5- LineInMethod: 4");
}
else{
 System.out.println("TP2 - TP2method5- LineInMethod: 9");
}
return (int)var0;

}

public int TP2method6(int var0, int var1, int var2, int var3){
 if(((var2/(int)(43))==(var3+(int)(13)))){
System.out.println("TP2 - TP2method6- LineInMethod: 4");
}
else{
 var3 = (int)(((var2+var1)+((var0%(int)(32))/(int)(21)))*((var3*var1)*(var3-var2)));
}
return (int)var2;

}

public int TP2method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 0; i++){
 if( ((((var0%(int)(28))*(var2+var7))-(var1-var2))==(var8-var4))){
if( ((((var5+var0)<(var5-var7))&&((((var8+var3)-(var8-var5))-(var5-var7))>(var6/(int)(21))))&&((var2-var3)<=(var5-var2)))){
if( ((var5%(int)(25))<(var7/(int)(1)))){
System.out.println("TP2 - TP2method7- LineInMethod: 8");
}
}
}
}
return (int)var3;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP2 obj = new TP2(h,connect1);
h.put("TPInterface2Method0",12);
obj.TPInterface2Method0((int)(38),(int)(4),(int)(10),(int)(14),(int)(32),(int)(39),(int)(43),(int)(26),(int)(21),(int)(26),(int)(9),(int)(9));
h.put("TP2method0",4);
obj.TP2method0((int)(46),(int)(8),(int)(7),(int)(38));
h.put("TP2method1",12);
obj.TP2method1((int)(33),(int)(16),(int)(25),(int)(16),(int)(0),(int)(40),(int)(20),(int)(39),(int)(14),(int)(40),(int)(18),(int)(9));
h.put("TP2method2",5);
obj.TP2method2((int)(37),(int)(27),(int)(17),(int)(0),(int)(47));
h.put("TP2method3",4);
obj.TP2method3((int)(13),(int)(14),(int)(15),(int)(11));
h.put("TP2method4",5);
obj.TP2method4((int)(39),(int)(42),(int)(17),(int)(23),(int)(34));
h.put("TP2method5",4);
TP2method5((int)(0),(int)(31),(int)(40),(int)(24));
h.put("TP2method6",4);
obj.TP2method6((int)(7),(int)(35),(int)(34),(int)(47));
h.put("TP2method7",9);
obj.TP2method7((int)(1),(int)(19),(int)(5),(int)(6),(int)(7),(int)(32),(int)(38),(int)(8),(int)(14));
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
TP2 obj = new TP2();
obj.TPInterface2Method0(i11,i2,i8,i9,i14,i13,i5,i0,i6,i12,i1,i4);
obj.TP2method0(i12,i3,i8,i13);
obj.TP2method1(i8,i7,i9,i1,i4,i0,i10,i11,i13,i3,i5,i6);
obj.TP2method2(i11,i14,i8,i12,i5);
obj.TP2method3(i13,i11,i1,i3);
obj.TP2method4(i0,i12,i11,i13,i4);
TP2method5(i14,i3,i9,i6);
obj.TP2method6(i3,i13,i0,i5);
obj.TP2method7(i9,i4,i0,i6,i2,i3,i13,i5,i11);
}

}