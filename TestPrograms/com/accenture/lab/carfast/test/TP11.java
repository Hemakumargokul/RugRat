package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP11 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP11() {}
public TP11(HashMap<String,Integer> a,Connection c) {
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
public int TP11method0(int var0, int var1, int var2, int var3){
 if( (((var0/(int)(23))/(int)(1))>(var3+(int)(26)))){
if( ((var3-var2)==(var3*var0))){
var1 = (int)((var0+var1)+(var2+(int)(6)));
}
}
switch(((var1*var3)*(var3%(int)(33)))){
case 0:
System.out.println("TP11 - TP11method0- LineInMethod: 7");
 break;
case 1:
TP11method1(var2,var0,var3,var2,var2,var0,var3); break;
case 2:
System.out.println("TP11 - TP11method0- LineInMethod: 17");
 break;
case 3:
var3 = (int)(var0+(int)(8));
 break;
default :
var2 = (int)((var2*var3)*(var0%(int)(31)));
}
return (int)var1;

}

public static int TP11method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 3; i++){
 if( (((var3-var0)==(var1+(int)(47)))&&((var5*var4)!=((var1-var6)*(var1-var0))))){
if( ((var4-var3)<(var5%(int)(46)))){
if( ((var6/(int)(22))!=(var3-var4))){
TP11method6(var0,var6,var0,var4,var4,var4,var5,var0,var1,var3,var2,var5,var6,var5);}
}
}
}
return (int)var0;

}

public int TP11method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if((((var10+var9)%(int)(17))<(var6+(int)(12)))){
System.out.println("TP11 - TP11method2- LineInMethod: 4");
}
else{
 var7 = (int)(((var10*var11)/(int)(11))/(int)(31));
}
return (int)var11;

}

public static int TP11method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( (((((var3-var4)*(var1-var2))<=((var10-var8)%(int)(37)))&&((var3-var6)>=(var9*var3)))&&((var1-var4)!=(var6+var1)))){
if( ((((var3/(int)(3))*(var3%(int)(21)))!=((var3/(int)(6))/(int)(5)))&&((var0-var1)<=(var3+var4)))){
System.out.println("TP11 - TP11method3- LineInMethod: 4");
}
}
return (int)var6;

}

public int TP11method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var1+var6)){
case 0:
var0 = (int)((var3%(int)(6))-(var6+var3));
 break;
case 1:
TP11method5(var6,var4,var5,var5,var2,var3,var2,var3,var6,var4,var6,var0,var2); break;
case 2:
var4 = (int)(2);
 break;
case 3:
System.out.println("TP11 - TP11method4- LineInMethod: 10");
 break;
case 4:
System.out.println("TP11 - TP11method4- LineInMethod: 14");
 break;
case 5:
System.out.println("TP11 - TP11method4- LineInMethod: 21");
 break;
case 6:
System.out.println("TP11 - TP11method4- LineInMethod: 25");
 break;
case 7:
System.out.println("TP11 - TP11method4- LineInMethod: 29");
 break;
default :
var2 = (int)((var3*var4)/(int)(39));
}
return (int)var6;

}

public int TP11method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if((((var3-var11)-((var2*var3)%(int)(31)))>(var4+var7))){
System.out.println("TP11 - TP11method5- LineInMethod: 4");
}
else{
 var0 = TP11method7(var0,var1,var1,var9,var2,var11,var10,var1,var12,var12,var9);
}
return (int)var9;

}

public static int TP11method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 switch((var1-(int)(49))){
case 0:
var4 = (int)((var7/(int)(15))+(var12+var1));
 break;
case 1:
var11 = (int)(8);
 break;
case 2:
var3 = (int)(((var8/(int)(47))+(var11*var5))*(var4%(int)(43)));
 break;
case 3:
TP11method7(var9,var3,var12,var7,var10,var7,var12,var9,var13,var5,var0); break;
case 4:
var6 = (int)((var13/(int)(23))*((var1%(int)(40))/(int)(22)));
 break;
case 5:
var1 = (int)(var9*var6);
 break;
case 6:
System.out.println("TP11 - TP11method6- LineInMethod: 19");
 break;
default :
System.out.println("TP11 - TP11method6- LineInMethod: 26");
}
return (int)var5;

}

public static int TP11method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( ((var4-var0)!=(var9*var5))){
if( ((var7%(int)(20))==((var3*var7)+(var4%(int)(45))))){
if( ((var8*var10)<((var4+var9)+(var3-var2)))){
System.out.println("TP11 - TP11method7- LineInMethod: 6");
}
}
}
return (int)var0;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP11 obj = new TP11(h,connect1);
h.put("TP11method0",4);
obj.TP11method0((int)(8),(int)(12),(int)(20),(int)(45));
h.put("TP11method1",7);
TP11method1((int)(46),(int)(38),(int)(1),(int)(45),(int)(10),(int)(14),(int)(14));
h.put("TP11method2",12);
obj.TP11method2((int)(15),(int)(48),(int)(31),(int)(4),(int)(39),(int)(49),(int)(45),(int)(25),(int)(20),(int)(16),(int)(18),(int)(28));
h.put("TP11method3",11);
TP11method3((int)(0),(int)(15),(int)(4),(int)(3),(int)(42),(int)(30),(int)(23),(int)(11),(int)(30),(int)(34),(int)(47));
h.put("TP11method4",7);
obj.TP11method4((int)(13),(int)(7),(int)(39),(int)(40),(int)(43),(int)(42),(int)(27));
h.put("TP11method5",13);
obj.TP11method5((int)(8),(int)(14),(int)(49),(int)(3),(int)(9),(int)(8),(int)(38),(int)(23),(int)(3),(int)(3),(int)(13),(int)(33),(int)(32));
h.put("TP11method6",14);
TP11method6((int)(4),(int)(38),(int)(23),(int)(2),(int)(13),(int)(29),(int)(49),(int)(23),(int)(31),(int)(1),(int)(45),(int)(22),(int)(44),(int)(19));
h.put("TP11method7",11);
TP11method7((int)(37),(int)(18),(int)(9),(int)(24),(int)(20),(int)(7),(int)(31),(int)(2),(int)(8),(int)(28),(int)(27));
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
TP11 obj = new TP11();
obj.TP11method0(i7,i11,i9,i14);
TP11method1(i5,i2,i13,i11,i6,i1,i9);
obj.TP11method2(i10,i12,i14,i8,i6,i7,i11,i1,i2,i13,i9,i0);
TP11method3(i5,i14,i0,i2,i4,i9,i13,i10,i3,i1,i6);
obj.TP11method4(i1,i13,i0,i5,i11,i9,i3);
obj.TP11method5(i1,i2,i11,i7,i0,i14,i5,i4,i8,i13,i6,i9,i12);
TP11method6(i3,i4,i12,i11,i8,i1,i6,i7,i9,i2,i10,i0,i13,i14);
TP11method7(i12,i7,i13,i10,i2,i14,i9,i11,i6,i4,i0);
}

}