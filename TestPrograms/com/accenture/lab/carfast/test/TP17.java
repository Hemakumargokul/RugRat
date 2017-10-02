package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP17 extends TP15 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP17() {}
public TP17(HashMap<String,Integer> a,Connection c) {
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
public static int TP17method0(int var0, int var1, int var2, int var3){
 if( ((var0/(int)(3))>(var0-var2))){
if( ((var0/(int)(30))!=(var0/(int)(14)))){
if( (((var0-(int)(38))-(var2+var3))==(var1%(int)(5)))){
System.out.println("TP17 - TP17method0- LineInMethod: 6");
}
}
}
return (int)var0;

}

public static int TP15method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 4; i++){
 System.out.println("TP17 - TP15method2- LineInMethod: 4");
}
return (int)var7;

}

public int TP17method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var6/(int)(22))){
case 0:
var5 = (int)((var3-var6)*(var4-var1));
 break;
case 1:
System.out.println("TP17 - TP17method2- LineInMethod: 5");
 break;
case 2:
TP17method7(var2,var6,var4,var2,var2,var1,var3,var5,var6,var5,var6,var0,var1,var4); break;
case 3:
System.out.println("TP17 - TP17method2- LineInMethod: 14");
 break;
default :
System.out.println("TP17 - TP17method2- LineInMethod: 20");
}
return (int)var2;

}

public static int TP15method3(int var0, int var1, int var2, int var3){
 if(((var2+var0)>((var3+var2)%(int)(33)))){
System.out.println("TP17 - TP15method3- LineInMethod: 4");
}
else{
 var0 = TP15method7(var0,var3,var0,var2);
}
return (int)var0;

}

public int TP17method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var3*(int)(44))){
case 0:
var0 = (int)((var4*var2)*(var0*var5));
 break;
case 1:
System.out.println("TP17 - TP17method4- LineInMethod: 5");
 break;
default :
var3 = (int)((var2-(int)(17))*(var2+(int)(8)));
}
return (int)var2;

}

public int TPInterface1Method0(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 4; i++){
 var3 = (int)(3);
}
if( ((var3*var2)<(var0%(int)(15)))){
if( ((var1+var2)!=(var0/(int)(42)))){
if( ((var0*var3)>=(var1*(int)(41)))){
TP15method7(var2,var2,var0,var1);}
}
}
return (int)var2;

}

public static int TP15method7(int var0, int var1, int var2, int var3){
 if(((var0+var2)<=(var3*var0))){
var2 = (int)((var0%(int)(36))%(int)(6));
}
else{
 var3 = (int)(6);
}
switch((var0*var3)){
case 0:
var3 = (int)((var3+var1)/(int)(18));
 break;
case 1:
var3 = (int)((var1-(int)(15))/(int)(31));
 break;
case 2:
System.out.println("TP17 - TP15method7- LineInMethod: 13");
 break;
case 3:
var3 = (int)((var2+var3)/(int)(29));
 break;
case 4:
var1 = (int)(4);
 break;
case 5:
System.out.println("TP17 - TP15method7- LineInMethod: 25");
 break;
default :
System.out.println("TP17 - TP15method7- LineInMethod: 31");
}
return (int)var3;

}

public static int TP17method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 if( ((var2-var0)==(var13+var4))){
var12 = (int)(((var3%(int)(14))/(int)(26))*(var6-var5));
}
switch((var7*var13)){
case 0:
var6 = (int)(((var8%(int)(38))+(var13+var3))+(var5/(int)(33)));
 break;
case 1:
System.out.println("TP17 - TP17method7- LineInMethod: 8");
 break;
case 2:
var1 = (int)(var6%(int)(29));
 break;
case 3:
System.out.println("TP17 - TP17method7- LineInMethod: 18");
 break;
case 4:
var5 = (int)((var3+var2)-(var5+var4));
 break;
case 5:
System.out.println("TP17 - TP17method7- LineInMethod: 27");
 break;
case 6:
var11 = (int)(((var10-var13)*(var1+var12))*(var1%(int)(9)));
 break;
case 7:
System.out.println("TP17 - TP17method7- LineInMethod: 35");
 break;
case 8:
System.out.println("TP17 - TP17method7- LineInMethod: 39");
 break;
default :
System.out.println("TP17 - TP17method7- LineInMethod: 46");
}
return (int)var3;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP17 obj = new TP17(h,connect1);
h.put("TP17method0",4);
TP17method0((int)(6),(int)(41),(int)(49),(int)(31));
h.put("TP15method2",8);
TP15method2((int)(47),(int)(13),(int)(35),(int)(17),(int)(26),(int)(41),(int)(49),(int)(24));
h.put("TP17method2",7);
obj.TP17method2((int)(35),(int)(30),(int)(41),(int)(46),(int)(48),(int)(34),(int)(9));
h.put("TP15method3",4);
TP15method3((int)(30),(int)(17),(int)(10),(int)(22));
h.put("TP17method4",7);
obj.TP17method4((int)(14),(int)(42),(int)(13),(int)(1),(int)(16),(int)(49),(int)(22));
h.put("TPInterface1Method0",4);
obj.TPInterface1Method0((int)(18),(int)(42),(int)(25),(int)(37));
h.put("TP15method7",4);
TP15method7((int)(4),(int)(44),(int)(27),(int)(41));
h.put("TP17method7",14);
TP17method7((int)(35),(int)(33),(int)(10),(int)(8),(int)(19),(int)(46),(int)(24),(int)(3),(int)(25),(int)(6),(int)(32),(int)(28),(int)(37),(int)(15));
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
TP17 obj = new TP17();
TP17method0(i5,i12,i9,i1);
TP15method2(i13,i3,i10,i2,i8,i0,i1,i9);
obj.TP17method2(i7,i8,i2,i10,i6,i11,i13);
TP15method3(i0,i2,i14,i8);
obj.TP17method4(i12,i9,i13,i4,i14,i5,i10);
obj.TPInterface1Method0(i1,i4,i5,i11);
TP15method7(i14,i7,i9,i2);
TP17method7(i10,i1,i4,i3,i8,i7,i9,i0,i13,i2,i5,i6,i12,i11);
}

}