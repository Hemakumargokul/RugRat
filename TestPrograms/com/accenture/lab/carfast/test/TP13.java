package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP13 extends TP9 implements TPInterface2 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP13() {}
public TP13(HashMap<String,Integer> a,Connection c) {
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
 for(int i = 0; i < 0; i++){
 if( (((var4+var5)==(var10-(int)(27)))||((var11*var0)>(var0+var8)))){
var5 = (int)((var4-var2)/(int)(25));
}
}
return (int)var11;

}

public int TP13method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 1; i++){
 if( ((var8+var5)!=(var6%(int)(7)))){
System.out.println("TP13 - TP13method0- LineInMethod: 4");
}
}
return (int)var6;

}

public static int TP13method1(int var0, int var1, int var2, int var3, int var4){
 if(((((var2+var3)/(int)(48))/(int)(37))==(var2+var1))){
System.out.println("TP13 - TP13method1- LineInMethod: 4");
}
else{
 System.out.println("TP13 - TP13method1- LineInMethod: 9");
}
return (int)var0;

}

public int TP13method2(int var0, int var1, int var2, int var3){
 if(((var2+var1)<=(var3-(int)(8)))){
var1 = (int)(0);
}
else{
 var2 = (int)(var2*(int)(28));
}
return (int)var0;

}

public static int TP9method4(int var0, int var1, int var2, int var3){
 if( ((var3*var0)!=(var2/(int)(47)))){
TP9method5(var3,var1,var1,var0,var2,var0,var2,var2,var1,var1,var0,var2,var0,var1);}
if( ((var1%(int)(3))>=(var2+var0))){
System.out.println("TP13 - TP9method4- LineInMethod: 5");
}
return (int)var1;

}

public static int TP9method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 for(int i = 0; i < 2; i++){
 System.out.println("TP13 - TP9method5- LineInMethod: 2");
}
return (int)var4;

}

public static int TP9method1(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 1; i++){
 if( (((var5-var0)>(var4-var3))&&((var5*(int)(39))>(var5/(int)(26))))){
System.out.println("TP13 - TP9method1- LineInMethod: 4");
}
}
return (int)var4;

}

public static int TP13method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if((((var3+var8)-(var6-var9))>=(var1-var5))){
System.out.println("TP13 - TP13method6- LineInMethod: 4");
}
else{
 var3 = (int)(var0%(int)(43));
}
return (int)var0;

}

public int TP13method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((((((var1+var0)-(var10*var3))*(var1-var7))*(var5+var2))+(var9*var7))>=(var11-var5))){
var10 = (int)(16);
}
for(int i = 0; i < 3; i++){
 System.out.println("TP13 - TP13method7- LineInMethod: 4");
}
return (int)var7;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP13 obj = new TP13(h,connect1);
h.put("TPInterface2Method0",12);
obj.TPInterface2Method0((int)(5),(int)(15),(int)(48),(int)(46),(int)(34),(int)(24),(int)(22),(int)(34),(int)(15),(int)(40),(int)(22),(int)(28));
h.put("TP13method0",9);
obj.TP13method0((int)(4),(int)(14),(int)(26),(int)(39),(int)(20),(int)(3),(int)(23),(int)(14),(int)(11));
h.put("TP13method1",5);
TP13method1((int)(43),(int)(8),(int)(23),(int)(32),(int)(2));
h.put("TP13method2",4);
obj.TP13method2((int)(27),(int)(40),(int)(24),(int)(35));
h.put("TP9method4",4);
TP9method4((int)(31),(int)(24),(int)(14),(int)(24));
h.put("TP9method5",14);
TP9method5((int)(40),(int)(42),(int)(40),(int)(23),(int)(40),(int)(3),(int)(33),(int)(46),(int)(41),(int)(0),(int)(32),(int)(5),(int)(39),(int)(12));
h.put("TP9method1",6);
TP9method1((int)(39),(int)(5),(int)(18),(int)(19),(int)(25),(int)(10));
h.put("TP13method6",10);
TP13method6((int)(26),(int)(20),(int)(7),(int)(11),(int)(11),(int)(18),(int)(26),(int)(22),(int)(31),(int)(35));
h.put("TP13method7",13);
obj.TP13method7((int)(37),(int)(49),(int)(4),(int)(32),(int)(27),(int)(10),(int)(18),(int)(16),(int)(35),(int)(29),(int)(36),(int)(29),(int)(36));
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
TP13 obj = new TP13();
obj.TPInterface2Method0(i11,i14,i13,i3,i5,i4,i7,i6,i9,i1,i0,i2);
obj.TP13method0(i9,i14,i1,i3,i13,i7,i12,i2,i10);
TP13method1(i6,i8,i1,i13,i2);
obj.TP13method2(i4,i5,i2,i6);
TP9method4(i1,i13,i7,i9);
TP9method5(i9,i7,i14,i8,i11,i4,i1,i3,i10,i13,i12,i0,i5,i6);
TP9method1(i3,i6,i12,i13,i1,i8);
TP13method6(i0,i10,i4,i1,i11,i12,i14,i9,i8,i6);
obj.TP13method7(i10,i11,i13,i7,i4,i12,i9,i6,i0,i14,i5,i3,i2);
}

}