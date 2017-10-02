package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP6 extends TP18 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP6() {}
public TP6(HashMap<String,Integer> a,Connection c) {
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
public int TP6method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( (((var2-(int)(10))>(var3+var4))&&((var2-var1)==(var4-var0)))){
if( ((var1+var6)<=(var2*var0))){
if( (((var4+var6)<=(var7%(int)(6)))||((((var0+var4)<=(var5+var3))&&((var3-var6)>=(var0-var6)))||((var1*var3)<=(var3*(int)(2)))))){
System.out.println("TP6 - TP6method0- LineInMethod: 6");
}
}
}
return (int)var4;

}

public static int TP6method1(int var0, int var1, int var2, int var3){
 if((((var0-var2)<=(var0*var3))||((var3*(int)(4))==(var1+var3)))){
System.out.println("TP6 - TP6method1- LineInMethod: 4");
}
else{
 var2 = (int)((var0+var3)*(var3-var1));
}
return (int)var3;

}

public static int TP6method2(int var0, int var1, int var2, int var3){
 if( ((var0*var3)>(var2/(int)(4)))){
if( ((var2-var0)>=(var0+var3))){
if( (((var1+var0)==(var0/(int)(44)))&&((var0+var1)!=(var0%(int)(2))))){
var0 = (int)((var0+var2)-((var1-var2)/(int)(1)));
}
}
}
return (int)var2;

}

public int TP0method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var6+var10)){
case 0:
System.out.println("TP6 - TP0method7- LineInMethod: 2");
 break;
case 1:
var12 = (int)(15);
 break;
case 2:
System.out.println("TP6 - TP0method7- LineInMethod: 11");
 break;
case 3:
var8 = (int)((var10*var12)*(((var3*var11)*(var10*var11))+(var0*var2)));
 break;
case 4:
var8 = (int)((var7%(int)(36))*(var6-var9));
 break;
case 5:
System.out.println("TP6 - TP0method7- LineInMethod: 21");
 break;
case 6:
var8 = (int)((var8%(int)(8))+(var1-var12));
 break;
case 7:
System.out.println("TP6 - TP0method7- LineInMethod: 28");
 break;
case 8:
System.out.println("TP6 - TP0method7- LineInMethod: 33");
 break;
default :
var6 = (int)((var4-var0)/(int)(42));
}
return (int)var4;

}

public int TP0method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var4+(int)(18))>(var5-var3))){
if( (((var6-var4)+(var2*var4))==(var3*var5))){
if( ((var0+var3)<=(var2/(int)(7)))){
System.out.println("TP6 - TP0method2- LineInMethod: 6");
}
}
}
return (int)var0;

}

public int TP18method0(int var0, int var1, int var2, int var3, int var4, int var5){
 switch((var3+(int)(46))){
case 0:
System.out.println("TP6 - TP18method0- LineInMethod: 2");
 break;
case 1:
var1 = (int)((var5-var2)*(var0/(int)(22)));
 break;
case 2:
System.out.println("TP6 - TP18method0- LineInMethod: 12");
 break;
default :
var2 = TP6method7(var0,var3,var1,var2);
}
return (int)var2;

}

public int TP6method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var7*(int)(38))){
case 0:
System.out.println("TP6 - TP6method6- LineInMethod: 2");
 break;
case 1:
var10 = TP0method7(var2,var12,var12,var1,var4,var5,var5,var5,var4,var11,var5,var7,var8);
 break;
case 2:
System.out.println("TP6 - TP6method6- LineInMethod: 11");
 break;
case 3:
System.out.println("TP6 - TP6method6- LineInMethod: 18");
 break;
case 4:
var2 = (int)(((var9*var7)*(var11*var0))/(int)(14));
 break;
case 5:
System.out.println("TP6 - TP6method6- LineInMethod: 25");
 break;
case 6:
System.out.println("TP6 - TP6method6- LineInMethod: 28");
 break;
default :
System.out.println("TP6 - TP6method6- LineInMethod: 35");
}
return (int)var12;

}

public int TP6method7(int var0, int var1, int var2, int var3){
 switch((var2+(int)(26))){
case 0:
System.out.println("TP6 - TP6method7- LineInMethod: 2");
 break;
case 1:
var2 = (int)(((var1-var3)*(var3+(int)(19)))+((var1%(int)(11))*((var0*var3)+((var3-var1)-(var0*var3)))));
 break;
case 2:
var2 = (int)((var2+var1)+(var0+(int)(15)));
 break;
case 3:
System.out.println("TP6 - TP6method7- LineInMethod: 14");
 break;
case 4:
var2 = (int)(11);
 break;
default :
System.out.println("TP6 - TP6method7- LineInMethod: 21");
}
return (int)var0;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP6 obj = new TP6(h,connect1);
h.put("TP6method0",8);
obj.TP6method0((int)(5),(int)(10),(int)(2),(int)(28),(int)(27),(int)(2),(int)(48),(int)(27));
h.put("TP6method1",4);
TP6method1((int)(47),(int)(13),(int)(32),(int)(34));
h.put("TP6method2",4);
TP6method2((int)(25),(int)(27),(int)(1),(int)(42));
h.put("TP0method7",13);
obj.TP0method7((int)(6),(int)(10),(int)(16),(int)(8),(int)(49),(int)(23),(int)(4),(int)(42),(int)(44),(int)(35),(int)(42),(int)(36),(int)(40));
h.put("TP0method2",7);
obj.TP0method2((int)(2),(int)(30),(int)(33),(int)(46),(int)(25),(int)(48),(int)(7));
h.put("TP18method0",6);
obj.TP18method0((int)(24),(int)(44),(int)(5),(int)(48),(int)(28),(int)(34));
h.put("TP6method6",13);
obj.TP6method6((int)(26),(int)(18),(int)(45),(int)(7),(int)(36),(int)(6),(int)(14),(int)(36),(int)(13),(int)(49),(int)(11),(int)(41),(int)(40));
h.put("TP6method7",4);
obj.TP6method7((int)(35),(int)(37),(int)(47),(int)(5));
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
TP6 obj = new TP6();
obj.TP6method0(i9,i11,i3,i13,i8,i4,i14,i10);
TP6method1(i6,i4,i12,i7);
TP6method2(i11,i5,i12,i14);
obj.TP0method7(i12,i14,i10,i9,i0,i8,i3,i1,i5,i4,i2,i11,i6);
obj.TP0method2(i10,i13,i14,i8,i2,i9,i0);
obj.TP18method0(i11,i8,i3,i13,i1,i9);
obj.TP6method6(i11,i9,i7,i13,i5,i14,i10,i2,i12,i1,i0,i6,i8);
obj.TP6method7(i11,i4,i2,i10);
}

}