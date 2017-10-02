package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP15 implements TPInterface1 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP15() {}
public TP15(HashMap<String,Integer> a,Connection c) {
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
public int TPInterface1Method0(int var0, int var1, int var2, int var3){
 if( ((((var1/(int)(12))*(var2*var0))*(var1-var0))>=(var2/(int)(2)))){
if( (((var1+var2)<=(var1*var0))&&((var0/(int)(13))<(var0+var1)))){
var1 = (int)((var3+(int)(11))*(var1/(int)(12)));
}
}
return (int)var2;

}

public static int TP15method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 4; i++){
 if( (((var4+var1)*(var7+var4))>(var2+var0))){
if( ((var6+var3)>=(var8/(int)(4)))){
if( (((var1%(int)(19))*((var2+var6)%(int)(44)))<=(var0%(int)(13)))){
System.out.println("TP15 - TP15method0- LineInMethod: 8");
}
}
}
}
return (int)var6;

}

public int TP15method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 1; i++){
 if( ((var3-var1)==(var7/(int)(16)))){
System.out.println("TP15 - TP15method1- LineInMethod: 4");
}
}
return (int)var3;

}

public static int TP15method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 0; i++){
 System.out.println("TP15 - TP15method2- LineInMethod: 2");
}
for(int i = 0; i < 3; i++){
 System.out.println("TP15 - TP15method2- LineInMethod: 5");
}
return (int)var7;

}

public static int TP15method3(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 2; i++){
 if( ((var3/(int)(43))>((var3*var1)-(var3-var1)))){
if( ((var3%(int)(2))!=((var0+var1)+(var2*var3)))){
if( ((var3+var1)>(var2-var1))){
var2 = (int)(var1*var0);
}
}
}
}
return (int)var0;

}

public static int TP15method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 1; i++){
 var8 = (int)(2);
}
for(int i = 0; i < 0; i++){
 if( ((var5%(int)(10))!=(var5-var8))){
var5 = (int)((var8/(int)(14))-(var6-var0));
}
}
return (int)var7;

}

public int TP15method5(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 1; i++){
 if( ((var0-(int)(45))>((var1-var3)+(var3+var1)))){
if( ((var1%(int)(46))<=(var0-(int)(7)))){
if( ((var3%(int)(1))==(var3/(int)(30)))){
var0 = (int)(46);
}
}
}
}
return (int)var0;

}

public int TP15method6(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 2; i++){
 if( ((var5%(int)(42))<=(var4-var1))){
if( ((var3+var1)>(var5+var1))){
System.out.println("TP15 - TP15method6- LineInMethod: 6");
}
}
}
return (int)var0;

}

public static int TP15method7(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 3; i++){
 var3 = (int)(var0/(int)(13));
}
switch((var1/(int)(44))){
case 0:
System.out.println("TP15 - TP15method7- LineInMethod: 5");
 break;
case 1:
System.out.println("TP15 - TP15method7- LineInMethod: 9");
 break;
case 2:
System.out.println("TP15 - TP15method7- LineInMethod: 16");
 break;
case 3:
var0 = (int)((var3+var2)-(var1/(int)(9)));
 break;
case 4:
var2 = (int)(((var1+var3)+((var3+var2)*((var2/(int)(7))%(int)(48))))-(var2%(int)(25)));
 break;
case 5:
System.out.println("TP15 - TP15method7- LineInMethod: 29");
 break;
case 6:
System.out.println("TP15 - TP15method7- LineInMethod: 33");
 break;
default :
var0 = (int)((var1+var3)-(var3*var1));
}
return (int)var0;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP15 obj = new TP15(h,connect1);
h.put("TPInterface1Method0",4);
obj.TPInterface1Method0((int)(6),(int)(45),(int)(46),(int)(35));
h.put("TP15method0",9);
TP15method0((int)(33),(int)(29),(int)(6),(int)(48),(int)(10),(int)(46),(int)(27),(int)(33),(int)(33));
h.put("TP15method1",8);
obj.TP15method1((int)(2),(int)(26),(int)(28),(int)(30),(int)(1),(int)(27),(int)(5),(int)(20));
h.put("TP15method2",8);
TP15method2((int)(14),(int)(1),(int)(22),(int)(28),(int)(10),(int)(14),(int)(25),(int)(4));
h.put("TP15method3",4);
TP15method3((int)(6),(int)(11),(int)(23),(int)(11));
h.put("TP15method4",9);
TP15method4((int)(44),(int)(29),(int)(43),(int)(33),(int)(38),(int)(39),(int)(22),(int)(43),(int)(15));
h.put("TP15method5",4);
obj.TP15method5((int)(21),(int)(8),(int)(8),(int)(48));
h.put("TP15method6",6);
obj.TP15method6((int)(28),(int)(33),(int)(41),(int)(5),(int)(5),(int)(19));
h.put("TP15method7",4);
TP15method7((int)(26),(int)(10),(int)(20),(int)(12));
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
TP15 obj = new TP15();
obj.TPInterface1Method0(i11,i10,i14,i0);
TP15method0(i1,i4,i0,i9,i3,i11,i6,i13,i2);
obj.TP15method1(i11,i4,i3,i6,i5,i8,i2,i1);
TP15method2(i3,i14,i11,i2,i8,i1,i0,i7);
TP15method3(i13,i7,i0,i9);
TP15method4(i7,i1,i2,i0,i6,i14,i11,i12,i4);
obj.TP15method5(i9,i14,i5,i6);
obj.TP15method6(i9,i11,i4,i6,i1,i13);
TP15method7(i4,i11,i12,i0);
}

}