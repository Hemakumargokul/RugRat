package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP4 extends TP16 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP4() {}
public TP4(HashMap<String,Integer> a,Connection c) {
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
public static int TP4method0(int var0, int var1, int var2, int var3){
 if((((var0*(int)(18))==(((var1*var2)*(((var1-var3)-(var2-var0))*(var2/(int)(1))))-(var2+var3)))&&((var2+var1)!=(((var0-(int)(35))*(var2/(int)(42)))-(var1%(int)(47)))))){
var1 = (int)((var2-var0)+(var2%(int)(9)));
}
else{
 TP4method1(var0,var0,var1,var3,var1,var3,var2,var3);}
return (int)var3;

}

public static int TP4method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( ((var2+var6)>=(var7*var0))){
if( ((var3/(int)(40))>(var3+var4))){
System.out.println("TP4 - TP4method1- LineInMethod: 4");
}
}
switch((var3+var6)){
case 0:
System.out.println("TP4 - TP4method1- LineInMethod: 7");
 break;
case 1:
TP8method2(var7,var2,var3,var4); break;
default :
var1 = (int)((var3-var1)*((var6-var2)*(var1-var3)));
}
return (int)var4;

}

public int TP4method2(int var0, int var1, int var2, int var3){
 if(((var3/(int)(14))==(var2-var1))){
System.out.println("TP4 - TP4method2- LineInMethod: 4");
}
else{
 System.out.println("TP4 - TP4method2- LineInMethod: 6");
}
return (int)var2;

}

public static int TP8method2(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 4; i++){
 System.out.println("TP4 - TP8method2- LineInMethod: 2");
}
return (int)var0;

}

public int TP8method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var12*(int)(39))){
case 0:
System.out.println("TP4 - TP8method4- LineInMethod: 2");
 break;
case 1:
System.out.println("TP4 - TP8method4- LineInMethod: 5");
 break;
case 2:
var3 = (int)((var12-var5)*(var11*var8));
 break;
default :
var1 = (int)(3);
}
return (int)var0;

}

public int TP16method0(int var0, int var1, int var2, int var3, int var4){
 switch((var4-var2)){
case 0:
var3 = (int)((var4-var2)*(var1+(int)(45)));
 break;
case 1:
System.out.println("TP4 - TP16method0- LineInMethod: 5");
 break;
case 2:
System.out.println("TP4 - TP16method0- LineInMethod: 9");
 break;
case 3:
TP4method6(var3,var4,var1,var1,var0,var1,var2,var2,var1,var4,var3); break;
case 4:
var4 = (int)((var1*var4)*(var0*var1));
 break;
case 5:
var0 = (int)(((var2*var1)+(var0+var3))-(var0/(int)(48)));
 break;
case 6:
System.out.println("TP4 - TP16method0- LineInMethod: 23");
 break;
case 7:
var2 = TP8method2(var3,var0,var2,var0);
 break;
case 8:
System.out.println("TP4 - TP16method0- LineInMethod: 33");
 break;
default :
var1 = (int)((var4*var0)-(var2+var3));
}
return (int)var3;

}

public static int TP4method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if((((var0/(int)(20))*(var0-var3))<(var8*var5))){
TP4method7(var1,var10,var3,var9,var8,var2,var5,var8,var8,var6,var7,var5,var3,var1);}
else{
 var4 = (int)((var5*var1)*(var6+var9));
}
return (int)var1;

}

public static int TP4method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 for(int i = 0; i < 4; i++){
 if( ((var8*(int)(25))!=(var2*var0))){
var7 = (int)(((var10*var12)+((var2%(int)(21))/(int)(21)))%(int)(18));
}
}
switch((var11*(int)(4))){
case 0:
var6 = (int)((var12+var2)*(var8-var7));
 break;
case 1:
var10 = (int)(var8%(int)(41));
 break;
case 2:
var4 = (int)((var9/(int)(29))-(var12-var11));
 break;
case 3:
System.out.println("TP4 - TP4method7- LineInMethod: 16");
 break;
default :
System.out.println("TP4 - TP4method7- LineInMethod: 21");
}
return (int)var7;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP4 obj = new TP4(h,connect1);
h.put("TP4method0",4);
TP4method0((int)(39),(int)(18),(int)(40),(int)(30));
h.put("TP4method1",8);
TP4method1((int)(5),(int)(27),(int)(45),(int)(6),(int)(8),(int)(5),(int)(48),(int)(0));
h.put("TP4method2",4);
obj.TP4method2((int)(19),(int)(40),(int)(41),(int)(27));
h.put("TP8method2",4);
TP8method2((int)(15),(int)(40),(int)(7),(int)(7));
h.put("TP8method4",13);
obj.TP8method4((int)(45),(int)(0),(int)(20),(int)(38),(int)(32),(int)(15),(int)(6),(int)(22),(int)(14),(int)(19),(int)(41),(int)(45),(int)(28));
h.put("TP16method0",5);
obj.TP16method0((int)(3),(int)(48),(int)(16),(int)(36),(int)(3));
h.put("TP4method6",11);
TP4method6((int)(37),(int)(39),(int)(16),(int)(30),(int)(22),(int)(23),(int)(42),(int)(35),(int)(26),(int)(25),(int)(8));
h.put("TP4method7",14);
TP4method7((int)(7),(int)(48),(int)(32),(int)(49),(int)(40),(int)(3),(int)(19),(int)(10),(int)(19),(int)(11),(int)(34),(int)(11),(int)(5),(int)(2));
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
TP4 obj = new TP4();
TP4method0(i13,i10,i4,i14);
TP4method1(i10,i12,i9,i2,i4,i8,i5,i6);
obj.TP4method2(i7,i6,i5,i12);
TP8method2(i10,i12,i3,i9);
obj.TP8method4(i7,i8,i4,i2,i1,i6,i3,i0,i12,i10,i11,i5,i9);
obj.TP16method0(i6,i11,i4,i2,i7);
TP4method6(i2,i12,i9,i4,i11,i6,i13,i3,i5,i7,i0);
TP4method7(i6,i13,i2,i4,i5,i14,i3,i10,i12,i0,i7,i11,i8,i1);
}

}