package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP12 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP12() {}
public TP12(HashMap<String,Integer> a,Connection c) {
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
public int TP12method0(int var0, int var1, int var2, int var3){
 if( ((var1%(int)(2))==(var2*(int)(28)))){
if( ((var1/(int)(7))==(var2*(int)(30)))){
if( ((var2/(int)(48))!=(var0*(int)(5)))){
var1 = TP12method4(var0,var1,var0,var2);
}
}
}
return (int)var3;

}

public static int TP12method1(int var0, int var1, int var2, int var3){
 if( (((var0-(int)(6))-(var0+var3))!=(var0/(int)(28)))){
if( ((var1*var0)<=(var2/(int)(21)))){
if( ((var3+var2)>(var3-var1))){
var0 = (int)((var2*(int)(11))*(var2+(int)(33)));
}
}
}
return (int)var2;

}

public static int TP12method2(int var0, int var1, int var2, int var3){
 if( ((var3*var0)<=(var1-var2))){
if( ((var2*var1)!=(var3*var0))){
if( ((var3/(int)(45))<=(var3-var0))){
System.out.println("TP12 - TP12method2- LineInMethod: 6");
}
}
}
return (int)var1;

}

public int TP12method3(int var0, int var1, int var2, int var3){
 if( ((var2-(int)(16))<(var3*(int)(31)))){
if( (((var0/(int)(12))+(var1*var0))<=(var0/(int)(8)))){
if( ((var0*var1)<(var1-var0))){
var0 = (int)((var2-(int)(20))+(var1*(int)(20)));
}
}
}
return (int)var3;

}

public int TP12method4(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 1; i++){
 if( (((var2-var0)*((var0/(int)(36))%(int)(14)))!=(var1*(int)(29)))){
if( (((var2/(int)(47))+((var0%(int)(35))+(var0*var3)))==(var2*(int)(40)))){
var1 = (int)((var1*(int)(20))-(var1+var3));
}
}
}
return (int)var2;

}

public int TP12method5(int var0, int var1, int var2, int var3, int var4, int var5){
 if( ((var1*var0)<(var5%(int)(18)))){
var4 = (int)((var1-var2)*(var5*var3));
}
if((((var1-var4)+(var2*var0))>(((var2*var1)*(var4-var1))-(var4*var2)))){
var5 = (int)(((var5%(int)(37))*(var2*var4))*((var2+(int)(25))*((var0*(int)(28))+(var2-var4))));
}
else{
 var0 = (int)(var3+var2);
}
return (int)var5;

}

public int TP12method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 2; i++){
 System.out.println("TP12 - TP12method6- LineInMethod: 2");
}
for(int i = 0; i < 1; i++){
 System.out.println("TP12 - TP12method6- LineInMethod: 7");
}
return (int)var3;

}

public int TP12method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 for(int i = 0; i < 3; i++){
 if( ((var6+var4)!=(var8/(int)(19)))){
var0 = (int)(((var5*var7)+(var9%(int)(33)))*(var7-var2));
}
}
if( ((var0-var7)<=(var0%(int)(46)))){
if( ((var4/(int)(28))==(var0-var5))){
var10 = (int)((var5*var2)+(var9-var10));
}
}
return (int)var1;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP12 obj = new TP12(h,connect1);
h.put("TP12method0",4);
obj.TP12method0((int)(25),(int)(45),(int)(27),(int)(38));
h.put("TP12method1",4);
TP12method1((int)(29),(int)(47),(int)(13),(int)(5));
h.put("TP12method2",4);
TP12method2((int)(19),(int)(29),(int)(34),(int)(18));
h.put("TP12method3",4);
obj.TP12method3((int)(20),(int)(27),(int)(1),(int)(5));
h.put("TP12method4",4);
obj.TP12method4((int)(47),(int)(3),(int)(21),(int)(13));
h.put("TP12method5",6);
obj.TP12method5((int)(45),(int)(45),(int)(9),(int)(6),(int)(25),(int)(33));
h.put("TP12method6",7);
obj.TP12method6((int)(20),(int)(2),(int)(29),(int)(33),(int)(49),(int)(19),(int)(32));
h.put("TP12method7",11);
obj.TP12method7((int)(27),(int)(4),(int)(5),(int)(8),(int)(1),(int)(17),(int)(22),(int)(24),(int)(41),(int)(16),(int)(47));
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
TP12 obj = new TP12();
obj.TP12method0(i3,i6,i13,i9);
TP12method1(i14,i2,i7,i6);
TP12method2(i10,i9,i3,i12);
obj.TP12method3(i13,i11,i4,i0);
obj.TP12method4(i9,i13,i0,i4);
obj.TP12method5(i2,i4,i12,i13,i1,i5);
obj.TP12method6(i9,i2,i3,i10,i11,i14,i7);
obj.TP12method7(i14,i8,i12,i9,i5,i13,i3,i7,i2,i0,i4);
}

}