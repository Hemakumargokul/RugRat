package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP5 extends TP13 implements TPInterface0 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP5() {}
public TP5(HashMap<String,Integer> a,Connection c) {
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
public int TPInterface0Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var4%(int)(26))){
case 0:
System.out.println("TP5 - TPInterface0Method0- LineInMethod: 2");
 break;
case 1:
System.out.println("TP5 - TPInterface0Method0- LineInMethod: 8");
 break;
case 2:
TP9method1(var2,var0,var1,var6,var1,var0); break;
default :
TP13method1(var5,var1,var2,var4,var1);}
return (int)var5;

}

public int TP5method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if(((((var4*var6)==(var1/(int)(12)))&&(((var3%(int)(35))%(int)(5))<(var4+var2)))&&((var6%(int)(11))<=(var0+var5)))){
var0 = TP13method1(var5,var6,var4,var1,var3);
}
else{
 var6 = (int)((var6/(int)(32))*(var3/(int)(49)));
}
return (int)var1;

}

public int TP5method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 0; i++){
 System.out.println("TP5 - TP5method1- LineInMethod: 3");
}
return (int)var0;

}

public int TP5method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 0; i++){
 if( ((((var1+var5)<=(var4-var6))&&(((var3*var8)-(var0/(int)(10)))<=(var3%(int)(23))))&&((var5/(int)(1))==(var5*var0)))){
if( ((var5/(int)(44))!=(var3%(int)(24)))){
var0 = (int)((var5/(int)(19))+(var3*var6));
}
}
}
return (int)var7;

}

public static int TP9method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 for(int i = 0; i < 4; i++){
 System.out.println("TP5 - TP9method5- LineInMethod: 2");
}
return (int)var10;

}

public static int TP9method1(int var0, int var1, int var2, int var3, int var4, int var5){
 if((((var1-var0)+((var5-var2)*(var1/(int)(41))))!=(var2*var5))){
System.out.println("TP5 - TP9method1- LineInMethod: 4");
}
else{
 TP5method6(var5,var4,var3,var5,var2,var1,var0);}
return (int)var3;

}

public static int TP13method1(int var0, int var1, int var2, int var3, int var4){
 if(((var1+var2)<(var3%(int)(26)))){
var4 = (int)((var1-var3)-(var0+var3));
}
else{
 var0 = (int)((var1*var3)/(int)(31));
}
return (int)var2;

}

public static int TP5method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var1*var6)){
case 0:
var0 = (int)((var0-var4)*(var1/(int)(29)));
 break;
case 1:
var6 = (int)((var6%(int)(13))/(int)(18));
 break;
case 2:
var3 = (int)((var3-var0)-(var0-var6));
 break;
case 3:
System.out.println("TP5 - TP5method6- LineInMethod: 11");
 break;
case 4:
System.out.println("TP5 - TP5method6- LineInMethod: 16");
 break;
case 5:
System.out.println("TP5 - TP5method6- LineInMethod: 20");
 break;
default :
var0 = TP5method7(var0,var2,var1,var6,var0,var4,var5,var1,var5,var6,var4,var1,var3,var1);
}
return (int)var3;

}

public static int TP5method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 if((((var13/(int)(38))-(var11-var13))==(var11-var12))){
System.out.println("TP5 - TP5method7- LineInMethod: 4");
}
else{
 System.out.println("TP5 - TP5method7- LineInMethod: 6");
}
return (int)var9;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP5 obj = new TP5(h,connect1);
h.put("TPInterface0Method0",8);
obj.TPInterface0Method0((int)(29),(int)(48),(int)(19),(int)(40),(int)(26),(int)(21),(int)(42),(int)(35));
h.put("TP5method0",7);
obj.TP5method0((int)(29),(int)(49),(int)(9),(int)(3),(int)(42),(int)(23),(int)(14));
h.put("TP5method1",7);
obj.TP5method1((int)(14),(int)(35),(int)(5),(int)(16),(int)(37),(int)(35),(int)(37));
h.put("TP5method2",9);
obj.TP5method2((int)(18),(int)(12),(int)(44),(int)(35),(int)(2),(int)(17),(int)(28),(int)(16),(int)(35));
h.put("TP9method5",14);
TP9method5((int)(13),(int)(17),(int)(14),(int)(31),(int)(12),(int)(49),(int)(37),(int)(49),(int)(47),(int)(37),(int)(48),(int)(47),(int)(25),(int)(5));
h.put("TP9method1",6);
TP9method1((int)(18),(int)(27),(int)(14),(int)(12),(int)(17),(int)(18));
h.put("TP13method1",5);
TP13method1((int)(49),(int)(5),(int)(10),(int)(16),(int)(15));
h.put("TP5method6",7);
TP5method6((int)(21),(int)(17),(int)(5),(int)(4),(int)(19),(int)(42),(int)(26));
h.put("TP5method7",14);
TP5method7((int)(40),(int)(30),(int)(15),(int)(30),(int)(10),(int)(16),(int)(26),(int)(24),(int)(36),(int)(6),(int)(6),(int)(17),(int)(29),(int)(36));
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
TP5 obj = new TP5();
obj.TPInterface0Method0(i0,i4,i13,i1,i3,i2,i10,i6);
obj.TP5method0(i13,i10,i8,i4,i3,i1,i5);
obj.TP5method1(i1,i14,i5,i12,i6,i13,i3);
obj.TP5method2(i9,i1,i2,i12,i7,i11,i4,i10,i6);
TP9method5(i10,i2,i14,i5,i1,i4,i7,i13,i12,i3,i8,i0,i11,i6);
TP9method1(i3,i4,i13,i6,i7,i2);
TP13method1(i8,i10,i0,i4,i7);
TP5method6(i13,i14,i10,i0,i2,i12,i7);
TP5method7(i14,i1,i4,i8,i3,i6,i7,i10,i9,i13,i11,i2,i5,i12);
}

}