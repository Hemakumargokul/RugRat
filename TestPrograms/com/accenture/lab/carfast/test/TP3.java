package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP3 implements TPInterface0 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP3() {}
public TP3(HashMap<String,Integer> a,Connection c) {
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
 for(int i = 0; i < 4; i++){
 var4 = (int)((var5*var1)*(var0+(int)(16)));
}
for(int i = 0; i < 4; i++){
 if( ((var4+var2)>=(var2-var5))){
var2 = TP3method1(var7,var5,var3,var2,var3,var3,var7,var2);
}
}
return (int)var1;

}

public static int TP3method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 for(int i = 0; i < 3; i++){
 if( ((var5+var3)<(var7*var2))){
if( ((var3/(int)(6))>(var0+(int)(35)))){
if( ((var0/(int)(5))>=(((var6+(int)(5))/(int)(9))*(var4-var1)))){
var7 = (int)((var2-var0)%(int)(31));
}
}
}
}
return (int)var8;

}

public static int TP3method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if(((var6%(int)(31))==(var4/(int)(40)))){
var0 = (int)(((var1*var6)/(int)(44))*(var5-var4));
}
else{
 var3 = (int)((var4*var6)+(var2*var4));
}
return (int)var7;

}

public int TP3method2(int var0, int var1, int var2, int var3, int var4, int var5){
 if( (((var0+var3)<(var4*var0))&&(((var1+(int)(26))+(var3-var0))>=(var3%(int)(30))))){
if( (((var4%(int)(33))*(var2-var3))==(var3+var0))){
if( ((var0+var4)>=((var3-var2)*(var5+var2)))){
System.out.println("TP3 - TP3method2- LineInMethod: 6");
}
}
}
return (int)var4;

}

public static int TP3method3(int var0, int var1, int var2, int var3){
 switch((var0+var1)){
case 0:
System.out.println("TP3 - TP3method3- LineInMethod: 2");
 break;
case 1:
var0 = (int)((var1-var3)+(var1+var3));
 break;
case 2:
var1 = (int)((var1-var2)*((var2+var0)/(int)(5)));
 break;
default :
TP3method5(var1,var2,var1,var3,var1,var1,var0,var1,var2);}
return (int)var0;

}

public static int TP3method4(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 if( ((var0%(int)(34))>(var3*(int)(26)))){
if( ((var4-var1)==(var4+var2))){
if( (((var1+(int)(34))!=((var1%(int)(36))%(int)(49)))&&((var2*var3)==(var3%(int)(2))))){
var1 = (int)(29);
}
}
}
}
return (int)var4;

}

public static int TP3method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 switch(((var1*var8)-(var7*var8))){
case 0:
System.out.println("TP3 - TP3method5- LineInMethod: 2");
 break;
case 1:
System.out.println("TP3 - TP3method5- LineInMethod: 6");
 break;
default :
System.out.println("TP3 - TP3method5- LineInMethod: 12");
}
return (int)var0;

}

public int TP3method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( ((var6/(int)(37))<=(var9*var6))){
if( ((var3-var4)>=(var9*(int)(17)))){
var3 = (int)(8);
}
}
for(int i = 0; i < 4; i++){
 var1 = (int)(10);
}
return (int)var7;

}

public static int TP3method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if((((((((var0*var7)/(int)(36))*(var2+var3))>(var5*(int)(26)))||(((var8-var11)>=((var9+var7)*((var11-var2)*((var7-var11)%(int)(29)))))&&((var4*var9)!=((var9%(int)(46))*(var1+var4)))))&&(((var3-(int)(44))-(((var0*var2)*(var0%(int)(26)))*((var11-var8)+(var4*var5))))>((var8%(int)(30))/(int)(40))))&&((var6+var0)<(var8-var7)))){
System.out.println("TP3 - TP3method7- LineInMethod: 4");
}
else{
 var8 = (int)(((var9*(int)(25))-(((var3-(int)(7))%(int)(39))-(var10*var3)))/(int)(36));
}
return (int)var6;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP3 obj = new TP3(h,connect1);
h.put("TPInterface0Method0",8);
obj.TPInterface0Method0((int)(33),(int)(42),(int)(4),(int)(34),(int)(9),(int)(49),(int)(5),(int)(8));
h.put("TP3method0",10);
TP3method0((int)(40),(int)(3),(int)(8),(int)(0),(int)(30),(int)(37),(int)(42),(int)(18),(int)(31),(int)(35));
h.put("TP3method1",8);
TP3method1((int)(41),(int)(35),(int)(29),(int)(23),(int)(37),(int)(26),(int)(27),(int)(4));
h.put("TP3method2",6);
obj.TP3method2((int)(32),(int)(30),(int)(3),(int)(28),(int)(20),(int)(8));
h.put("TP3method3",4);
TP3method3((int)(44),(int)(2),(int)(20),(int)(27));
h.put("TP3method4",5);
TP3method4((int)(20),(int)(6),(int)(44),(int)(17),(int)(49));
h.put("TP3method5",9);
TP3method5((int)(19),(int)(1),(int)(37),(int)(12),(int)(38),(int)(24),(int)(8),(int)(37),(int)(37));
h.put("TP3method6",11);
obj.TP3method6((int)(30),(int)(40),(int)(44),(int)(42),(int)(35),(int)(37),(int)(47),(int)(1),(int)(48),(int)(0),(int)(46));
h.put("TP3method7",12);
TP3method7((int)(23),(int)(6),(int)(3),(int)(5),(int)(34),(int)(31),(int)(33),(int)(33),(int)(45),(int)(36),(int)(39),(int)(46));
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
TP3 obj = new TP3();
obj.TPInterface0Method0(i0,i14,i12,i7,i6,i10,i1,i8);
TP3method0(i10,i12,i7,i4,i9,i6,i8,i1,i14,i2);
TP3method1(i0,i11,i8,i13,i14,i7,i5,i4);
obj.TP3method2(i6,i11,i3,i9,i12,i1);
TP3method3(i2,i5,i0,i14);
TP3method4(i2,i0,i9,i7,i5);
TP3method5(i4,i10,i3,i6,i8,i0,i13,i5,i7);
obj.TP3method6(i1,i5,i8,i7,i3,i11,i13,i0,i10,i6,i9);
TP3method7(i2,i13,i3,i12,i14,i6,i9,i8,i5,i11,i10,i7);
}

}