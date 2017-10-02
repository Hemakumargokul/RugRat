package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP8 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP8() {}
public TP8(HashMap<String,Integer> a,Connection c) {
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
public static int TP8method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 1; i++){
 var2 = (int)((var2-var7)+(var0-var8));
}
for(int i = 0; i < 2; i++){
 if( (((var9%(int)(37))==(var3*var9))&&((var5/(int)(3))<=((var7+var2)-((var3*var0)%(int)(14)))))){
var10 = TP8method1(var8,var0,var0,var2,var11,var2,var10,var5,var10,var7,var10,var10,var2);
}
}
return (int)var10;

}

public static int TP8method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if(((var6*var9)>(var10-var4))){
var4 = (int)((var10-var12)*((var0-var9)*(var5/(int)(4))));
}
else{
 var10 = (int)(var8*var3);
}
return (int)var3;

}

public static int TP8method2(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 3; i++){
 var0 = (int)(44);
}
switch((var1/(int)(5))){
case 0:
System.out.println("TP8 - TP8method2- LineInMethod: 4");
 break;
case 1:
System.out.println("TP8 - TP8method2- LineInMethod: 11");
 break;
case 2:
var2 = (int)(18);
 break;
case 3:
System.out.println("TP8 - TP8method2- LineInMethod: 17");
 break;
default :
System.out.println("TP8 - TP8method2- LineInMethod: 20");
}
return (int)var2;

}

public static int TP8method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var5*(int)(2))!=(var5+var0))){
if( ((var5%(int)(41))<((var4-var2)-((var0%(int)(43))+((var1-(int)(27))/(int)(1)))))){
if( ((var5/(int)(32))>(var0+var5))){
System.out.println("TP8 - TP8method3- LineInMethod: 6");
}
}
}
return (int)var4;

}

public int TP8method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((var6%(int)(43))>=(var10%(int)(32)))){
System.out.println("TP8 - TP8method4- LineInMethod: 2");
}
return (int)var0;

}

public int TP8method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 0; i++){
 System.out.println("TP8 - TP8method5- LineInMethod: 2");
}
return (int)var3;

}

public int TP8method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 switch((var3%(int)(33))){
case 0:
System.out.println("TP8 - TP8method6- LineInMethod: 2");
 break;
case 1:
var0 = (int)((var7/(int)(24))-(var8*var3));
 break;
case 2:
var6 = (int)((var3-var6)/(int)(18));
 break;
case 3:
System.out.println("TP8 - TP8method6- LineInMethod: 12");
 break;
case 4:
System.out.println("TP8 - TP8method6- LineInMethod: 16");
 break;
default :
System.out.println("TP8 - TP8method6- LineInMethod: 19");
}
return (int)var8;

}

public static int TP8method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if(((var8-var0)>=((var9-var5)/(int)(49)))){
var9 = (int)(((var9+var1)-(var8%(int)(48)))%(int)(6));
}
else{
 System.out.println("TP8 - TP8method7- LineInMethod: 5");
}
return (int)var4;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP8 obj = new TP8(h,connect1);
h.put("TP8method0",12);
TP8method0((int)(49),(int)(48),(int)(21),(int)(1),(int)(38),(int)(41),(int)(47),(int)(6),(int)(46),(int)(26),(int)(11),(int)(39));
h.put("TP8method1",13);
TP8method1((int)(28),(int)(41),(int)(8),(int)(22),(int)(9),(int)(3),(int)(32),(int)(22),(int)(8),(int)(4),(int)(38),(int)(14),(int)(19));
h.put("TP8method2",4);
TP8method2((int)(18),(int)(46),(int)(14),(int)(17));
h.put("TP8method3",7);
TP8method3((int)(34),(int)(28),(int)(4),(int)(43),(int)(25),(int)(28),(int)(16));
h.put("TP8method4",13);
obj.TP8method4((int)(14),(int)(28),(int)(40),(int)(23),(int)(24),(int)(48),(int)(11),(int)(35),(int)(21),(int)(16),(int)(20),(int)(18),(int)(48));
h.put("TP8method5",9);
obj.TP8method5((int)(28),(int)(12),(int)(20),(int)(19),(int)(28),(int)(13),(int)(26),(int)(9),(int)(30));
h.put("TP8method6",9);
obj.TP8method6((int)(41),(int)(35),(int)(30),(int)(14),(int)(8),(int)(8),(int)(45),(int)(23),(int)(7));
h.put("TP8method7",11);
TP8method7((int)(4),(int)(45),(int)(14),(int)(3),(int)(13),(int)(45),(int)(36),(int)(26),(int)(29),(int)(22),(int)(25));
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
TP8 obj = new TP8();
TP8method0(i10,i0,i12,i13,i6,i14,i4,i11,i7,i9,i3,i2);
TP8method1(i8,i7,i13,i5,i11,i1,i4,i14,i0,i6,i10,i3,i2);
TP8method2(i10,i5,i1,i4);
TP8method3(i6,i4,i5,i11,i2,i13,i9);
obj.TP8method4(i12,i9,i13,i3,i8,i6,i5,i4,i0,i1,i7,i10,i11);
obj.TP8method5(i1,i8,i0,i12,i10,i4,i5,i6,i13);
obj.TP8method6(i7,i0,i10,i6,i5,i2,i3,i12,i13);
TP8method7(i12,i1,i5,i8,i3,i0,i6,i7,i10,i13,i9);
}

}