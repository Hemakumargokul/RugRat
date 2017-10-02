package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP9 implements TPInterface2 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP9() {}
public TP9(HashMap<String,Integer> a,Connection c) {
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
 if( ((var4-var0)!=(var0%(int)(1)))){
if( ((var9/(int)(22))!=(var10-var2))){
System.out.println("TP9 - TPInterface2Method0- LineInMethod: 4");
}
}
return (int)var11;

}

public int TP9method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 for(int i = 0; i < 3; i++){
 var6 = (int)((var11-var4)-(var12+var5));
}
if( ((((var5/(int)(1))-(var1-var7))-(var3+var7))>(var6%(int)(22)))){
System.out.println("TP9 - TP9method0- LineInMethod: 6");
}
return (int)var6;

}

public static int TP9method1(int var0, int var1, int var2, int var3, int var4, int var5){
 if( (((((var4+var1)-(var1*var4))-(var2/(int)(21)))%(int)(23))>(var5-var1))){
if( (((var3+var0)%(int)(15))<=(var3-var5))){
var1 = TP9method4(var0,var4,var2,var3);
}
}
return (int)var5;

}

public int TP9method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var1-var6)>(var0+var1))){
var9 = (int)((var6*var8)/(int)(7));
}
else{
 var3 = (int)((var0*var6)*(var6/(int)(19)));
}
return (int)var9;

}

public int TP9method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var6+(int)(10))){
case 0:
System.out.println("TP9 - TP9method3- LineInMethod: 2");
 break;
case 1:
var10 = (int)(var8+(int)(4));
 break;
case 2:
var0 = (int)((var1*var9)%(int)(7));
 break;
case 3:
var7 = (int)((var3*var5)-(var2%(int)(34)));
 break;
case 4:
var9 = (int)(6);
 break;
case 5:
System.out.println("TP9 - TP9method3- LineInMethod: 18");
 break;
case 6:
var10 = (int)(47);
 break;
default :
var8 = (int)(var5+var10);
}
return (int)var0;

}

public static int TP9method4(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 1; i++){
 System.out.println("TP9 - TP9method4- LineInMethod: 2");
}
if(((var3+var0)<=(var1-var2))){
System.out.println("TP9 - TP9method4- LineInMethod: 7");
}
else{
 TP9method5(var0,var2,var0,var3,var1,var2,var3,var1,var0,var2,var0,var3,var2,var2);}
return (int)var2;

}

public static int TP9method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 for(int i = 0; i < 2; i++){
 if( (((var0*var6)/(int)(4))>=(var11/(int)(45)))){
if( ((var2*var11)<(var4%(int)(45)))){
if( ((var5-var10)>(var7*var9))){
var3 = (int)((var13*var12)%(int)(48));
}
}
}
}
return (int)var9;

}

public int TP9method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if(((var4-var7)!=(var2*var7))){
var6 = (int)((var1/(int)(18))/(int)(29));
}
else{
 System.out.println("TP9 - TP9method6- LineInMethod: 5");
}
return (int)var5;

}

public int TP9method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( ((var1+var9)<=((var0-var9)-(var1+var3)))){
if( ((var5-var4)>=(var9*(int)(4)))){
var6 = (int)(28);
}
}
if(((var4/(int)(16))==(var7%(int)(25)))){
var3 = (int)((var1*var0)-(var4-var2));
}
else{
 var1 = (int)(((var4+var1)+((var10+var0)-(var1+var10)))/(int)(29));
}
return (int)var9;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP9 obj = new TP9(h,connect1);
h.put("TPInterface2Method0",12);
obj.TPInterface2Method0((int)(41),(int)(19),(int)(29),(int)(47),(int)(41),(int)(29),(int)(8),(int)(12),(int)(39),(int)(36),(int)(46),(int)(47));
h.put("TP9method0",13);
obj.TP9method0((int)(21),(int)(30),(int)(26),(int)(27),(int)(15),(int)(12),(int)(42),(int)(35),(int)(11),(int)(30),(int)(1),(int)(5),(int)(36));
h.put("TP9method1",6);
TP9method1((int)(36),(int)(21),(int)(15),(int)(32),(int)(48),(int)(7));
h.put("TP9method2",10);
obj.TP9method2((int)(47),(int)(4),(int)(35),(int)(25),(int)(18),(int)(8),(int)(26),(int)(21),(int)(12),(int)(1));
h.put("TP9method3",12);
obj.TP9method3((int)(28),(int)(19),(int)(19),(int)(36),(int)(14),(int)(7),(int)(1),(int)(27),(int)(17),(int)(29),(int)(6),(int)(30));
h.put("TP9method4",4);
TP9method4((int)(13),(int)(21),(int)(3),(int)(35));
h.put("TP9method5",14);
TP9method5((int)(38),(int)(42),(int)(34),(int)(18),(int)(0),(int)(30),(int)(26),(int)(37),(int)(21),(int)(26),(int)(19),(int)(0),(int)(46),(int)(35));
h.put("TP9method6",8);
obj.TP9method6((int)(20),(int)(36),(int)(39),(int)(48),(int)(8),(int)(25),(int)(14),(int)(17));
h.put("TP9method7",11);
obj.TP9method7((int)(3),(int)(41),(int)(23),(int)(11),(int)(42),(int)(6),(int)(8),(int)(23),(int)(46),(int)(23),(int)(1));
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
TP9 obj = new TP9();
obj.TPInterface2Method0(i9,i3,i12,i2,i1,i6,i8,i5,i10,i14,i0,i11);
obj.TP9method0(i10,i6,i4,i11,i13,i7,i9,i1,i14,i12,i5,i2,i0);
TP9method1(i2,i6,i11,i14,i5,i8);
obj.TP9method2(i12,i4,i11,i8,i14,i1,i0,i3,i10,i2);
obj.TP9method3(i7,i5,i4,i9,i2,i6,i11,i3,i14,i8,i10,i1);
TP9method4(i4,i3,i11,i8);
TP9method5(i5,i4,i11,i14,i2,i6,i8,i7,i9,i0,i13,i12,i1,i3);
obj.TP9method6(i9,i14,i2,i6,i0,i11,i12,i10);
obj.TP9method7(i11,i7,i6,i10,i12,i0,i14,i9,i3,i2,i5);
}

}