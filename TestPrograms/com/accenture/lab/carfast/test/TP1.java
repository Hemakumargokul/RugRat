package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP1 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP1() {}
public TP1(HashMap<String,Integer> a,Connection c) {
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
public int TP1method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 4; i++){
 if( (((var4-var7)+(var6%(int)(6)))<(var5/(int)(43)))){
if( ((var7%(int)(13))>=(((var5*(int)(47))/(int)(5))/(int)(41)))){
if( ((((var2*var1)*(var3+var1))+(var4*(int)(15)))>(var1-var2))){
var0 = (int)((var3/(int)(48))*(var6+var7));
}
}
}
}
return (int)var6;

}

public static int TP1method1(int var0, int var1, int var2, int var3){
 if(((var3+var0)==(var0*(int)(44)))){
TP1method7(var3,var0,var2,var3);}
else{
 System.out.println("TP1 - TP1method1- LineInMethod: 5");
}
return (int)var1;

}

public static int TP1method2(int var0, int var1, int var2, int var3){
 if( (((var3+var0)-(var2*(int)(22)))<=(var2%(int)(49)))){
if( ((var1+(int)(7))>(var2*(int)(3)))){
TP1method7(var1,var2,var0,var1);}
}
for(int i = 0; i < 4; i++){
 var3 = (int)((var1-var0)+(var2%(int)(29)));
}
return (int)var0;

}

public static int TP1method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if(((((var4+var5)/(int)(29))*(var0-var3))<=(var3/(int)(48)))){
var1 = (int)(48);
}
else{
 System.out.println("TP1 - TP1method3- LineInMethod: 4");
}
return (int)var0;

}

public int TP1method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 if((((var6+var1)*(var7%(int)(16)))<(var1%(int)(6)))){
var0 = (int)(21);
}
else{
 System.out.println("TP1 - TP1method4- LineInMethod: 4");
}
return (int)var13;

}

public int TP1method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if(((var5/(int)(24))!=(var2+var7))){
System.out.println("TP1 - TP1method5- LineInMethod: 4");
}
else{
 System.out.println("TP1 - TP1method5- LineInMethod: 6");
}
return (int)var3;

}

public int TP1method6(int var0, int var1, int var2, int var3){
 if((((var0%(int)(43))>=(var1%(int)(34)))&&((var0%(int)(8))>(var2%(int)(19))))){
var2 = (int)(22);
}
else{
 System.out.println("TP1 - TP1method6- LineInMethod: 4");
}
return (int)var0;

}

public static int TP1method7(int var0, int var1, int var2, int var3){
 if((((var1+var2)<((var3-var2)*(var1*var3)))&&((var2*var1)>((var3*var0)-(var3*var1))))){
var0 = (int)(20);
}
else{
 System.out.println("TP1 - TP1method7- LineInMethod: 4");
}
return (int)var3;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP1 obj = new TP1(h,connect1);
h.put("TP1method0",8);
obj.TP1method0((int)(29),(int)(44),(int)(7),(int)(13),(int)(19),(int)(0),(int)(29),(int)(28));
h.put("TP1method1",4);
TP1method1((int)(15),(int)(36),(int)(3),(int)(2));
h.put("TP1method2",4);
TP1method2((int)(22),(int)(13),(int)(24),(int)(16));
h.put("TP1method3",8);
TP1method3((int)(22),(int)(40),(int)(33),(int)(6),(int)(29),(int)(48),(int)(3),(int)(3));
h.put("TP1method4",14);
obj.TP1method4((int)(44),(int)(46),(int)(31),(int)(35),(int)(1),(int)(13),(int)(34),(int)(7),(int)(47),(int)(31),(int)(22),(int)(12),(int)(22),(int)(16));
h.put("TP1method5",9);
obj.TP1method5((int)(44),(int)(11),(int)(6),(int)(7),(int)(20),(int)(14),(int)(33),(int)(16),(int)(49));
h.put("TP1method6",4);
obj.TP1method6((int)(38),(int)(12),(int)(26),(int)(28));
h.put("TP1method7",4);
TP1method7((int)(35),(int)(48),(int)(35),(int)(29));
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
TP1 obj = new TP1();
obj.TP1method0(i9,i13,i6,i14,i4,i1,i8,i3);
TP1method1(i5,i10,i14,i9);
TP1method2(i8,i2,i0,i12);
TP1method3(i5,i2,i14,i8,i12,i13,i0,i9);
obj.TP1method4(i13,i3,i11,i12,i2,i0,i4,i1,i7,i5,i10,i9,i8,i14);
obj.TP1method5(i6,i14,i9,i1,i5,i10,i0,i8,i2);
obj.TP1method6(i12,i5,i13,i2);
TP1method7(i8,i1,i11,i12);
}

}