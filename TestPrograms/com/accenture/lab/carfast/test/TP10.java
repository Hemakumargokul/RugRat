package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP10 extends TP17 implements TPInterface0 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP10() {}
public TP10(HashMap<String,Integer> a,Connection c) {
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
 switch((var3-(int)(22))){
case 0:
System.out.println("TP10 - TPInterface0Method0- LineInMethod: 2");
 break;
case 1:
var2 = TP10method7(var1,var4,var0,var3,var6,var2,var7,var6);
 break;
case 2:
var3 = (int)((var6-var0)%(int)(12));
 break;
default :
var6 = (int)(((var6-var7)-(var5/(int)(19)))+(var1-var5));
}
return (int)var7;

}

public int TP10method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 switch(((var6/(int)(15))*(var3-(int)(29)))){
case 0:
var4 = TP10method2(var0,var8,var4,var10);
 break;
case 1:
System.out.println("TP10 - TP10method0- LineInMethod: 5");
 break;
default :
var4 = (int)(((var11*var7)%(int)(34))*(var4%(int)(30)));
}
return (int)var5;

}

public static int TP10method1(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 2; i++){
 if( ((var3/(int)(42))<=(var1*var3))){
if( ((var1%(int)(22))<(var2+var3))){
var1 = (int)(38);
}
}
}
return (int)var3;

}

public static int TP10method2(int var0, int var1, int var2, int var3){
 if( ((var1/(int)(46))==(var0-var2))){
if( (((var2-(int)(14))<(var1-(int)(14)))&&((var0-(int)(11))<=(var3+var2)))){
var2 = (int)((var1%(int)(38))+(var0-var2));
}
}
return (int)var2;

}

public static int TP15method7(int var0, int var1, int var2, int var3){
 switch((var1+(int)(44))){
case 0:
System.out.println("TP10 - TP15method7- LineInMethod: 2");
 break;
case 1:
var2 = (int)(33);
 break;
case 2:
var3 = (int)((var2+var1)-(var3+(int)(33)));
 break;
default :
System.out.println("TP10 - TP15method7- LineInMethod: 10");
}
return (int)var1;

}

public static int TP15method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if((((var4-var7)>=(var5+var7))&&((var5+var0)==(var0-var1)))){
var1 = (int)((var3*var5)/(int)(21));
}
else{
 var3 = TP10method7(var1,var4,var6,var7,var2,var7,var1,var5);
}
return (int)var7;

}

public static int TP17method0(int var0, int var1, int var2, int var3){
 if( ((var2*(int)(41))>=(var1/(int)(4)))){
if( (((var1+var0)+(var2+var1))==((var0%(int)(33))-(var3-(int)(0))))){
if( ((var2+var0)!=(var3-var2))){
var2 = TP10method6(var3,var1,var0,var2,var1,var3);
}
}
}
return (int)var0;

}

public static int TP10method6(int var0, int var1, int var2, int var3, int var4, int var5){
 switch((var4*(int)(16))){
case 0:
System.out.println("TP10 - TP10method6- LineInMethod: 2");
 break;
case 1:
TP15method7(var1,var2,var0,var1); break;
case 2:
System.out.println("TP10 - TP10method6- LineInMethod: 10");
 break;
case 3:
System.out.println("TP10 - TP10method6- LineInMethod: 14");
 break;
case 4:
System.out.println("TP10 - TP10method6- LineInMethod: 21");
 break;
case 5:
System.out.println("TP10 - TP10method6- LineInMethod: 25");
 break;
case 6:
System.out.println("TP10 - TP10method6- LineInMethod: 31");
 break;
case 7:
var4 = (int)((var2-var4)-((var2+var0)+(var4-(int)(18))));
 break;
default :
var4 = (int)((var4*var2)/(int)(28));
}
return (int)var1;

}

public static int TP10method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if((((((var1*(int)(44))+(var3-var4))+(var6/(int)(7)))/(int)(1))<=((var2+var3)*((var0/(int)(37))/(int)(20))))){
var7 = (int)(var5-(int)(44));
}
else{
 var4 = (int)(43);
}
return (int)var7;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP10 obj = new TP10(h,connect1);
h.put("TPInterface0Method0",8);
obj.TPInterface0Method0((int)(47),(int)(3),(int)(0),(int)(38),(int)(9),(int)(21),(int)(35),(int)(47));
h.put("TP10method0",14);
obj.TP10method0((int)(17),(int)(8),(int)(32),(int)(4),(int)(33),(int)(26),(int)(15),(int)(0),(int)(10),(int)(29),(int)(38),(int)(20),(int)(35),(int)(7));
h.put("TP10method1",4);
TP10method1((int)(20),(int)(30),(int)(45),(int)(6));
h.put("TP10method2",4);
TP10method2((int)(33),(int)(15),(int)(20),(int)(34));
h.put("TP15method7",4);
TP15method7((int)(7),(int)(33),(int)(37),(int)(31));
h.put("TP15method2",8);
TP15method2((int)(33),(int)(23),(int)(6),(int)(5),(int)(12),(int)(40),(int)(21),(int)(16));
h.put("TP17method0",4);
TP17method0((int)(10),(int)(14),(int)(39),(int)(7));
h.put("TP10method6",6);
TP10method6((int)(37),(int)(26),(int)(27),(int)(6),(int)(2),(int)(9));
h.put("TP10method7",8);
TP10method7((int)(16),(int)(12),(int)(19),(int)(46),(int)(35),(int)(19),(int)(11),(int)(0));
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
TP10 obj = new TP10();
obj.TPInterface0Method0(i14,i2,i1,i11,i8,i6,i3,i13);
obj.TP10method0(i2,i10,i3,i0,i13,i12,i6,i1,i5,i8,i14,i7,i9,i11);
TP10method1(i14,i9,i2,i4);
TP10method2(i0,i12,i10,i4);
TP15method7(i12,i5,i14,i6);
TP15method2(i0,i9,i7,i8,i3,i6,i2,i11);
TP17method0(i10,i3,i4,i9);
TP10method6(i1,i14,i10,i0,i8,i9);
TP10method7(i9,i2,i11,i7,i13,i8,i12,i10);
}

}