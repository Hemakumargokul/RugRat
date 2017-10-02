package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP14 implements TPInterface1 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP14() {}
public TP14(HashMap<String,Integer> a,Connection c) {
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
public int TPInterface1Method0(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 4; i++){
 System.out.println("TP14 - TPInterface1Method0- LineInMethod: 2");
}
if( (((var3-(int)(9))<=(var1+var2))||(((var3+(int)(36))/(int)(40))>=(var3*var2)))){
if( (((var2%(int)(45))*(var3+var1))>(var3+var1))){
var2 = (int)((var2+var0)%(int)(11));
}
}
return (int)var2;

}

public int TP14method0(int var0, int var1, int var2, int var3){
 switch((var1*var3)){
case 0:
var3 = (int)(var1*var0);
 break;
case 1:
System.out.println("TP14 - TP14method0- LineInMethod: 5");
 break;
case 2:
var0 = (int)((var0-(int)(3))*(var3*var0));
 break;
case 3:
var3 = (int)((var1*var2)%(int)(26));
 break;
case 4:
var3 = (int)((var0+var2)+((var0%(int)(20))*(var3-var2)));
 break;
case 5:
var1 = TP14method5(var2,var2,var1,var1,var1,var1,var1,var2,var0);
 break;
case 6:
System.out.println("TP14 - TP14method0- LineInMethod: 23");
 break;
case 7:
var0 = (int)((var1-var3)*(var3+var2));
 break;
case 8:
TP14method2(var1,var1,var3,var0); break;
default :
var0 = (int)((var3*var0)+(var2+var1));
}
return (int)var2;

}

public static int TP14method1(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 2; i++){
 if( ((var3+var0)>=(var0+var1))){
if( (((var3+var2)!=(var1-var3))||((var3*var2)>=(var3%(int)(1))))){
TP14method3(var0,var2,var2,var1,var0,var2,var3);}
}
}
return (int)var2;

}

public int TP14method2(int var0, int var1, int var2, int var3){
 if( ((var3/(int)(26))<=((var2+(int)(21))+((var2/(int)(2))-(var1/(int)(28)))))){
if( ((var2/(int)(31))<=((var0+(int)(14))-(var0*var1)))){
if( (((var0%(int)(1))%(int)(27))<=(var1*var0))){
var1 = (int)(var1/(int)(35));
}
}
}
return (int)var2;

}

public static int TP14method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if(((var5*var6)>=((var5*var1)*(var5/(int)(22))))){
TP14method7(var2,var0,var4,var2);}
else{
 System.out.println("TP14 - TP14method3- LineInMethod: 5");
}
return (int)var1;

}

public int TP14method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var6*var7)!=(var5-var6))){
var3 = (int)(((var6%(int)(12))*(var9/(int)(36)))*(var6/(int)(27)));
}
else{
 System.out.println("TP14 - TP14method4- LineInMethod: 5");
}
return (int)var7;

}

public static int TP14method5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if((((var2+(int)(29))<(var2+var4))||((((var1+var4)<=((var3*var7)/(int)(45)))&&((var5+var3)>=((var2-var5)/(int)(34))))&&((var3+var8)==(var3-var2))))){
var1 = (int)((var2*var1)*(var6+var7));
}
else{
 var6 = (int)(0);
}
return (int)var3;

}

public int TP14method6(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 3; i++){
 if( ((var3-var1)==(((var1+var2)+(var2/(int)(34)))%(int)(37)))){
System.out.println("TP14 - TP14method6- LineInMethod: 4");
}
}
return (int)var0;

}

public static int TP14method7(int var0, int var1, int var2, int var3){
 if(((var2/(int)(31))<(var0*(int)(18)))){
var3 = (int)(((((var1+(int)(24))-((var1%(int)(25))*((var1-var0)*(var2%(int)(46)))))-(var3-(int)(49)))-((var3+var1)+(var0/(int)(36))))*(var2*var3));
}
else{
 System.out.println("TP14 - TP14method7- LineInMethod: 5");
}
return (int)var2;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP14 obj = new TP14(h,connect1);
h.put("TPInterface1Method0",4);
obj.TPInterface1Method0((int)(1),(int)(1),(int)(23),(int)(39));
h.put("TP14method0",4);
obj.TP14method0((int)(16),(int)(5),(int)(32),(int)(18));
h.put("TP14method1",4);
TP14method1((int)(20),(int)(36),(int)(27),(int)(29));
h.put("TP14method2",4);
obj.TP14method2((int)(3),(int)(10),(int)(12),(int)(46));
h.put("TP14method3",7);
TP14method3((int)(14),(int)(43),(int)(44),(int)(41),(int)(41),(int)(45),(int)(47));
h.put("TP14method4",10);
obj.TP14method4((int)(13),(int)(13),(int)(33),(int)(1),(int)(5),(int)(30),(int)(18),(int)(35),(int)(21),(int)(4));
h.put("TP14method5",9);
TP14method5((int)(49),(int)(19),(int)(24),(int)(0),(int)(8),(int)(25),(int)(3),(int)(43),(int)(7));
h.put("TP14method6",4);
obj.TP14method6((int)(10),(int)(13),(int)(11),(int)(10));
h.put("TP14method7",4);
TP14method7((int)(32),(int)(44),(int)(19),(int)(29));
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
TP14 obj = new TP14();
obj.TPInterface1Method0(i2,i13,i0,i12);
obj.TP14method0(i9,i12,i14,i2);
TP14method1(i1,i10,i5,i6);
obj.TP14method2(i14,i1,i13,i8);
TP14method3(i6,i2,i12,i13,i1,i10,i4);
obj.TP14method4(i6,i2,i12,i1,i13,i4,i0,i5,i8,i11);
TP14method5(i13,i9,i12,i8,i7,i10,i5,i1,i2);
obj.TP14method6(i11,i8,i6,i2);
TP14method7(i2,i0,i7,i10);
}

}