package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP0 implements TPInterface2 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP0() {}
public TP0(HashMap<String,Integer> a,Connection c) {
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
 if( ((var2*var7)<(var5*var10))){
var6 = (int)((var6*var5)-(var10+var0));
}
for(int i = 0; i < 0; i++){
 if( ((var1-var4)!=(var3*var6))){
if( (((var5/(int)(23))*(var2%(int)(47)))>(var11+(int)(33)))){
if( ((var9+var0)>=(var6%(int)(15)))){
System.out.println("TP0 - TPInterface2Method0- LineInMethod: 11");
}
}
}
}
return (int)var7;

}

public int TP0method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch(((var9%(int)(44))/(int)(15))){
case 0:
var4 = TP0method4(var5,var0,var1,var7,var7);
 break;
case 1:
System.out.println("TP0 - TP0method0- LineInMethod: 5");
 break;
default :
System.out.println("TP0 - TP0method0- LineInMethod: 12");
}
return (int)var3;

}

public int TP0method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var2*var1)){
case 0:
var7 = TP0method4(var7,var1,var7,var3,var4);
 break;
case 1:
var6 = (int)(5);
 break;
case 2:
System.out.println("TP0 - TP0method1- LineInMethod: 7");
 break;
default :
System.out.println("TP0 - TP0method1- LineInMethod: 11");
}
return (int)var0;

}

public int TP0method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 for(int i = 0; i < 2; i++){
 var0 = (int)((var2+var0)-(var0*var6));
}
if(((((var0*var5)>=(var6-var4))&&(((var2+var5)<=(var6-var5))&&((var5/(int)(26))<(var1-var4))))&&((((var5+var6)-((var5*var2)*(var3*var0)))*((var0*var3)+(var5*var3)))==(var0/(int)(17))))){
var2 = TP0method3(var2,var3,var2,var5,var2,var4,var0,var5,var5,var6);
}
else{
 var2 = (int)((var2+var0)*((var4/(int)(10))*(var1/(int)(38))));
}
return (int)var6;

}

public int TP0method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 switch(((var2-var1)+(var6*var2))){
case 0:
var5 = (int)((var3*var7)*(((var1-var8)%(int)(11))/(int)(28)));
 break;
case 1:
System.out.println("TP0 - TP0method3- LineInMethod: 5");
 break;
case 2:
System.out.println("TP0 - TP0method3- LineInMethod: 10");
 break;
case 3:
var4 = (int)(43);
 break;
case 4:
var6 = (int)((var5+(int)(12))-(var1/(int)(22)));
 break;
case 5:
var6 = (int)((var6*var3)+((var2+var8)*(var1+var3)));
 break;
case 6:
var6 = (int)(33);
 break;
case 7:
var7 = (int)(var6-var9);
 break;
default :
var7 = (int)((var2-(int)(40))-(var8-var6));
}
return (int)var1;

}

public int TP0method4(int var0, int var1, int var2, int var3, int var4){
 switch((var2-(int)(49))){
case 0:
System.out.println("TP0 - TP0method4- LineInMethod: 2");
 break;
case 1:
System.out.println("TP0 - TP0method4- LineInMethod: 6");
 break;
case 2:
var0 = (int)((var2-(int)(10))%(int)(34));
 break;
case 3:
System.out.println("TP0 - TP0method4- LineInMethod: 16");
 break;
case 4:
var0 = (int)((var3+var0)*(var2-var0));
 break;
case 5:
System.out.println("TP0 - TP0method4- LineInMethod: 26");
 break;
case 6:
var1 = (int)(10);
 break;
case 7:
System.out.println("TP0 - TP0method4- LineInMethod: 34");
 break;
case 8:
System.out.println("TP0 - TP0method4- LineInMethod: 41");
 break;
default :
var0 = (int)((var2%(int)(1))%(int)(36));
}
return (int)var0;

}

public static int TP0method5(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 2; i++){
 if( (((var1*(int)(12))*(var3+(int)(15)))==((var1*var0)+(var0+var3)))){
if( (((var2/(int)(15))<(var1*(int)(3)))&&((var2-var3)<=(var3/(int)(1))))){
if( ((var3-(int)(17))==(var1-var2))){
var3 = (int)(6);
}
}
}
}
return (int)var3;

}

public int TP0method6(int var0, int var1, int var2, int var3){
 switch((var2+(int)(5))){
case 0:
var3 = (int)((var2-var0)-((var2*(int)(46))+((var3*var0)+(((var2*(int)(39))+((var0*(int)(15))*(var0*var2)))-(var1%(int)(29))))));
 break;
case 1:
System.out.println("TP0 - TP0method6- LineInMethod: 5");
 break;
case 2:
System.out.println("TP0 - TP0method6- LineInMethod: 10");
 break;
case 3:
System.out.println("TP0 - TP0method6- LineInMethod: 15");
 break;
case 4:
System.out.println("TP0 - TP0method6- LineInMethod: 21");
 break;
case 5:
System.out.println("TP0 - TP0method6- LineInMethod: 27");
 break;
case 6:
var3 = (int)(var2/(int)(49));
 break;
default :
System.out.println("TP0 - TP0method6- LineInMethod: 37");
}
return (int)var1;

}

public int TP0method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((var9/(int)(23))>(((var12+var4)+(var4+var2))*(var2+var0)))){
System.out.println("TP0 - TP0method7- LineInMethod: 2");
}
return (int)var2;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP0 obj = new TP0(h,connect1);
h.put("TPInterface2Method0",12);
obj.TPInterface2Method0((int)(11),(int)(14),(int)(11),(int)(22),(int)(24),(int)(10),(int)(37),(int)(38),(int)(41),(int)(13),(int)(22),(int)(12));
h.put("TP0method0",13);
obj.TP0method0((int)(45),(int)(22),(int)(7),(int)(30),(int)(46),(int)(48),(int)(28),(int)(15),(int)(25),(int)(44),(int)(48),(int)(23),(int)(16));
h.put("TP0method1",8);
obj.TP0method1((int)(27),(int)(13),(int)(42),(int)(29),(int)(49),(int)(20),(int)(47),(int)(28));
h.put("TP0method2",7);
obj.TP0method2((int)(23),(int)(41),(int)(45),(int)(34),(int)(40),(int)(6),(int)(30));
h.put("TP0method3",10);
obj.TP0method3((int)(41),(int)(3),(int)(20),(int)(11),(int)(3),(int)(43),(int)(17),(int)(2),(int)(42),(int)(4));
h.put("TP0method4",5);
obj.TP0method4((int)(4),(int)(13),(int)(0),(int)(33),(int)(30));
h.put("TP0method5",4);
TP0method5((int)(43),(int)(3),(int)(31),(int)(39));
h.put("TP0method6",4);
obj.TP0method6((int)(1),(int)(29),(int)(28),(int)(0));
h.put("TP0method7",13);
obj.TP0method7((int)(47),(int)(26),(int)(48),(int)(16),(int)(14),(int)(33),(int)(21),(int)(34),(int)(39),(int)(29),(int)(26),(int)(30),(int)(25));
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
TP0 obj = new TP0();
obj.TPInterface2Method0(i6,i10,i4,i12,i13,i0,i9,i1,i14,i11,i5,i3);
obj.TP0method0(i0,i4,i11,i6,i2,i1,i14,i12,i7,i3,i9,i10,i8);
obj.TP0method1(i4,i5,i12,i8,i13,i1,i6,i10);
obj.TP0method2(i0,i11,i3,i13,i2,i6,i10);
obj.TP0method3(i14,i13,i6,i7,i3,i1,i11,i9,i2,i12);
obj.TP0method4(i12,i5,i1,i7,i4);
TP0method5(i3,i0,i11,i13);
obj.TP0method6(i8,i1,i13,i14);
obj.TP0method7(i3,i11,i6,i10,i7,i4,i13,i0,i14,i8,i9,i1,i12);
}

}