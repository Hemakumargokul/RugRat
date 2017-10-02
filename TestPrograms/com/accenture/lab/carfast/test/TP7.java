package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP7 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP7() {}
public TP7(HashMap<String,Integer> a,Connection c) {
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
public static int TP7method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch(((var9-var8)*(var3+var2))){
case 0:
System.out.println("TP7 - TP7method0- LineInMethod: 2");
 break;
case 1:
System.out.println("TP7 - TP7method0- LineInMethod: 5");
 break;
case 2:
System.out.println("TP7 - TP7method0- LineInMethod: 11");
 break;
default :
System.out.println("TP7 - TP7method0- LineInMethod: 14");
}
return (int)var9;

}

public int TP7method1(int var0, int var1, int var2, int var3){
 switch((var3*var2)){
case 0:
var3 = (int)((var3/(int)(44))/(int)(49));
 break;
case 1:
System.out.println("TP7 - TP7method1- LineInMethod: 5");
 break;
case 2:
var2 = TP7method3(var0,var2,var1,var2,var0,var2,var0,var2,var2,var2,var0);
 break;
case 3:
System.out.println("TP7 - TP7method1- LineInMethod: 14");
 break;
default :
System.out.println("TP7 - TP7method1- LineInMethod: 21");
}
return (int)var2;

}

public static int TP7method2(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 4; i++){
 var1 = (int)((var3*var2)-(var3/(int)(43)));
}
for(int i = 0; i < 2; i++){
 if( (((var1+var3)<=(var1*(int)(49)))&&((var3+(int)(11))>(var0%(int)(47))))){
if( ((((var2-var1)/(int)(34))/(int)(15))<(var0*var2))){
if( (((var1-var2)<=(var0-var1))&&((var0*(int)(24))>=(var1*var3)))){
System.out.println("TP7 - TP7method2- LineInMethod: 11");
}
}
}
}
return (int)var1;

}

public int TP7method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 for(int i = 0; i < 3; i++){
 if( (((var4*(int)(47))/(int)(20))!=((var7+var3)%(int)(23)))){
if( ((var9-var10)!=(var8*var7))){
System.out.println("TP7 - TP7method3- LineInMethod: 6");
}
}
}
return (int)var5;

}

public static int TP7method4(int var0, int var1, int var2, int var3){
 if(((((var2%(int)(49))+((var0-var1)/(int)(30)))-((var3+var2)-((var0+var2)+(var3+var2))))<=((var3-var1)+((var0*var3)+(var3*var1))))){
System.out.println("TP7 - TP7method4- LineInMethod: 4");
}
else{
 var1 = (int)((var1%(int)(4))+(var0-var1));
}
return (int)var0;

}

public int TP7method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 for(int i = 0; i < 2; i++){
 if( ((var3*var1)>(var0*var10))){
var0 = (int)(41);
}
}
if((((var6+var10)-(var5+var3))<((var8*var3)/(int)(29)))){
System.out.println("TP7 - TP7method5- LineInMethod: 8");
}
else{
 System.out.println("TP7 - TP7method5- LineInMethod: 10");
}
return (int)var7;

}

public int TP7method6(int var0, int var1, int var2, int var3){
 switch((var1*(int)(3))){
case 0:
System.out.println("TP7 - TP7method6- LineInMethod: 2");
 break;
case 1:
System.out.println("TP7 - TP7method6- LineInMethod: 9");
 break;
case 2:
var2 = (int)(((var1*var2)%(int)(10))*((var2*var1)-(var0%(int)(2))));
 break;
case 3:
var1 = (int)((var2-var3)+(var2*var3));
 break;
default :
var0 = (int)((var0%(int)(21))-(var2+(int)(46)));
}
return (int)var3;

}

public static int TP7method7(int var0, int var1, int var2, int var3, int var4){
 if( ((((var3+(int)(37))<=(var1+var0))&&(((var4*var2)>(var1*var4))||((var4-var1)<=(var3+var1))))&&((var0/(int)(34))>=(var2-var4)))){
if( ((var3-var4)>=(var3%(int)(19)))){
if( ((var2%(int)(32))<(var2-(int)(43)))){
var4 = (int)(6);
}
}
}
return (int)var2;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP7 obj = new TP7(h,connect1);
h.put("TP7method0",13);
TP7method0((int)(21),(int)(37),(int)(10),(int)(31),(int)(44),(int)(0),(int)(18),(int)(23),(int)(34),(int)(20),(int)(35),(int)(36),(int)(19));
h.put("TP7method1",4);
obj.TP7method1((int)(21),(int)(44),(int)(10),(int)(24));
h.put("TP7method2",4);
TP7method2((int)(41),(int)(13),(int)(26),(int)(29));
h.put("TP7method3",11);
obj.TP7method3((int)(25),(int)(6),(int)(23),(int)(23),(int)(5),(int)(43),(int)(30),(int)(42),(int)(13),(int)(25),(int)(5));
h.put("TP7method4",4);
TP7method4((int)(10),(int)(28),(int)(19),(int)(20));
h.put("TP7method5",11);
obj.TP7method5((int)(2),(int)(42),(int)(2),(int)(36),(int)(47),(int)(26),(int)(26),(int)(4),(int)(32),(int)(31),(int)(49));
h.put("TP7method6",4);
obj.TP7method6((int)(48),(int)(25),(int)(5),(int)(22));
h.put("TP7method7",5);
TP7method7((int)(2),(int)(27),(int)(3),(int)(1),(int)(33));
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
TP7 obj = new TP7();
TP7method0(i7,i8,i2,i9,i14,i5,i3,i6,i0,i10,i12,i13,i11);
obj.TP7method1(i0,i9,i11,i8);
TP7method2(i0,i4,i10,i5);
obj.TP7method3(i6,i3,i10,i8,i0,i9,i14,i12,i13,i5,i4);
TP7method4(i13,i11,i4,i0);
obj.TP7method5(i14,i12,i8,i4,i5,i1,i0,i10,i6,i9,i7);
obj.TP7method6(i0,i3,i14,i6);
TP7method7(i6,i9,i0,i5,i12);
}

}