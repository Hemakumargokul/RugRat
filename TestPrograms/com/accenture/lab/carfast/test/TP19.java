package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP19 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP19() {}
public TP19(HashMap<String,Integer> a,Connection c) {
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
public int TP19method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var5*var9)){
case 0:
var4 = (int)(((var8*var5)+(var1%(int)(37)))%(int)(25));
 break;
case 1:
TP19method7(var8,var11,var3,var7,var11,var0,var3,var7,var6,var4); break;
case 2:
System.out.println("TP19 - TP19method0- LineInMethod: 8");
 break;
case 3:
var7 = (int)((var11*var5)*(var7*var3));
 break;
case 4:
var4 = TP19method5(var7,var10,var12,var1,var3,var9,var2,var12);
 break;
case 5:
var1 = (int)(((var1-var5)*(((var0*var3)+(var2/(int)(12)))-(var11*var9)))-((var5%(int)(39))+(var1*var8)));
 break;
case 6:
System.out.println("TP19 - TP19method0- LineInMethod: 21");
 break;
case 7:
System.out.println("TP19 - TP19method0- LineInMethod: 24");
 break;
case 8:
var2 = (int)((var5*var11)-(var6/(int)(16)));
 break;
default :
System.out.println("TP19 - TP19method0- LineInMethod: 32");
}
return (int)var8;

}

public static int TP19method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((var4-var1)!=(var9-var5))){
if( (((var6-var2)*(var1-var7))<(var5%(int)(32)))){
System.out.println("TP19 - TP19method1- LineInMethod: 4");
}
}
return (int)var8;

}

public int TP19method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if( ((var10%(int)(49))<=(var0/(int)(22)))){
if( ((((var7+var10)-(var8-var6))==(var5-var3))||((var8%(int)(43))==(var9+(int)(26))))){
if( ((var1*var11)>=(var2*var3))){
System.out.println("TP19 - TP19method2- LineInMethod: 6");
}
}
}
return (int)var1;

}

public int TP19method3(int var0, int var1, int var2, int var3, int var4){
 switch((var1+(int)(24))){
case 0:
var1 = (int)((var4*var2)*((var2/(int)(20))%(int)(32)));
 break;
case 1:
var1 = (int)((var1-var0)+(var3*var1));
 break;
case 2:
System.out.println("TP19 - TP19method3- LineInMethod: 8");
 break;
case 3:
System.out.println("TP19 - TP19method3- LineInMethod: 12");
 break;
case 4:
var0 = (int)(10);
 break;
case 5:
System.out.println("TP19 - TP19method3- LineInMethod: 20");
 break;
default :
var2 = (int)((var0/(int)(6))-(var4+var3));
}
return (int)var3;

}

public static int TP19method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 3; i++){
 var2 = (int)(21);
}
switch((var0%(int)(38))){
case 0:
System.out.println("TP19 - TP19method4- LineInMethod: 4");
 break;
case 1:
System.out.println("TP19 - TP19method4- LineInMethod: 9");
 break;
case 2:
System.out.println("TP19 - TP19method4- LineInMethod: 14");
 break;
case 3:
var3 = (int)(var1+var4);
 break;
case 4:
System.out.println("TP19 - TP19method4- LineInMethod: 20");
 break;
case 5:
System.out.println("TP19 - TP19method4- LineInMethod: 27");
 break;
case 6:
System.out.println("TP19 - TP19method4- LineInMethod: 30");
 break;
case 7:
System.out.println("TP19 - TP19method4- LineInMethod: 37");
 break;
case 8:
var3 = (int)((var3/(int)(15))-(var6-(int)(37)));
 break;
default :
TP19method7(var0,var2,var1,var1,var4,var6,var6,var5,var0,var6);}
return (int)var3;

}

public int TP19method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( ((var0*var6)!=(var3+var0))){
System.out.println("TP19 - TP19method5- LineInMethod: 2");
}
return (int)var0;

}

public int TP19method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch(((var4*(int)(41))/(int)(19))){
case 0:
var0 = (int)(var2*var5);
 break;
case 1:
var3 = (int)(var0+var7);
 break;
case 2:
var1 = (int)((var5*var2)*(var6+var0));
 break;
default :
var5 = TP19method7(var2,var4,var7,var5,var7,var7,var5,var4,var2,var0);
}
return (int)var3;

}

public static int TP19method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var2*var7)<((var7-var6)/(int)(15)))){
System.out.println("TP19 - TP19method7- LineInMethod: 4");
}
else{
 var0 = (int)(40);
}
return (int)var0;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP19 obj = new TP19(h,connect1);
h.put("TP19method0",13);
obj.TP19method0((int)(33),(int)(9),(int)(40),(int)(7),(int)(31),(int)(3),(int)(49),(int)(35),(int)(18),(int)(37),(int)(49),(int)(25),(int)(46));
h.put("TP19method1",13);
TP19method1((int)(10),(int)(2),(int)(22),(int)(47),(int)(47),(int)(34),(int)(36),(int)(49),(int)(35),(int)(12),(int)(43),(int)(35),(int)(45));
h.put("TP19method2",12);
obj.TP19method2((int)(42),(int)(6),(int)(24),(int)(29),(int)(39),(int)(16),(int)(20),(int)(45),(int)(39),(int)(35),(int)(14),(int)(1));
h.put("TP19method3",5);
obj.TP19method3((int)(49),(int)(18),(int)(28),(int)(45),(int)(42));
h.put("TP19method4",7);
TP19method4((int)(22),(int)(23),(int)(1),(int)(12),(int)(38),(int)(6),(int)(16));
h.put("TP19method5",8);
obj.TP19method5((int)(10),(int)(0),(int)(48),(int)(49),(int)(17),(int)(40),(int)(8),(int)(40));
h.put("TP19method6",8);
obj.TP19method6((int)(41),(int)(27),(int)(30),(int)(29),(int)(26),(int)(1),(int)(3),(int)(45));
h.put("TP19method7",10);
TP19method7((int)(3),(int)(13),(int)(30),(int)(12),(int)(26),(int)(48),(int)(5),(int)(48),(int)(43),(int)(0));
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
TP19 obj = new TP19();
obj.TP19method0(i5,i3,i8,i4,i12,i6,i13,i9,i14,i7,i10,i2,i1);
TP19method1(i5,i4,i6,i8,i9,i14,i1,i10,i3,i0,i11,i2,i12);
obj.TP19method2(i13,i14,i0,i9,i11,i10,i2,i3,i7,i6,i12,i5);
obj.TP19method3(i9,i3,i13,i8,i6);
TP19method4(i13,i0,i12,i10,i2,i3,i6);
obj.TP19method5(i3,i1,i10,i9,i7,i11,i5,i8);
obj.TP19method6(i8,i0,i1,i12,i13,i6,i10,i2);
TP19method7(i6,i14,i11,i1,i12,i13,i10,i8,i2,i3);
}

}