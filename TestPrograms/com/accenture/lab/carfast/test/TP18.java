package com.accenture.lab.carfast.test;


import java.sql.*;
import java.util.*;
import java.util.Random;


public class TP18 extends TP0 {
HashMap<String,Integer> tableNames;private Connection connect = null;
private PreparedStatement statement = null;
private ResultSet resultSet = null;


public TP18() {}
public TP18(HashMap<String,Integer> a,Connection c) {
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
public int TP18method0(int var0, int var1, int var2, int var3, int var4, int var5){
 if(((((var5*var3)-(var4-var1))>=((var4*var2)+((var5-var1)+(var4%(int)(3)))))||((((var3*var5)>(var1%(int)(49)))&&((var5*var0)==(var2*(int)(1))))&&(((var1-var5)<=(var2*var0))&&((((var5*var3)+(var2+var1))>=(((var3-var0)*(var3%(int)(15)))+(var3+var5)))&&((var2%(int)(4))<=(var5*var4))))))){
System.out.println("TP18 - TP18method0- LineInMethod: 4");
}
else{
 var2 = (int)(22);
}
return (int)var0;

}

public int TP0method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var6*(int)(23))){
case 0:
var1 = (int)((var3%(int)(12))*(var0*var5));
 break;
case 1:
System.out.println("TP18 - TP0method2- LineInMethod: 5");
 break;
case 2:
var1 = (int)((var3+var4)/(int)(15));
 break;
case 3:
var1 = (int)((var6+var4)-(var0-var6));
 break;
case 4:
var6 = (int)(33);
 break;
case 5:
System.out.println("TP18 - TP0method2- LineInMethod: 19");
 break;
case 6:
System.out.println("TP18 - TP0method2- LineInMethod: 26");
 break;
case 7:
System.out.println("TP18 - TP0method2- LineInMethod: 32");
 break;
case 8:
System.out.println("TP18 - TP0method2- LineInMethod: 36");
 break;
default :
System.out.println("TP18 - TP0method2- LineInMethod: 40");
}
return (int)var1;

}

public static int TP18method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 0; i++){
 if( (((var1/(int)(23))*(var4*var9))>((var7-var8)-(var5+var4)))){
var11 = TP18method7(var4,var10,var3,var3,var7,var6,var5,var5,var9);
}
}
switch((((var11*(int)(17))-(var8/(int)(38)))/(int)(7))){
case 0:
var4 = TP18method7(var3,var7,var1,var8,var9,var6,var7,var1,var4);
 break;
case 1:
var2 = (int)((var10*var4)+(var6*var3));
 break;
case 2:
var8 = (int)(((var5/(int)(31))*((var6%(int)(13))*(var10+var2)))+(var11+var4));
 break;
case 3:
var0 = (int)(((var11-var9)%(int)(49))+(var10-var6));
 break;
case 4:
System.out.println("TP18 - TP18method2- LineInMethod: 19");
 break;
default :
System.out.println("TP18 - TP18method2- LineInMethod: 22");
}
return (int)var6;

}

public int TP0method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var9-var5)==(((var6%(int)(49))-((var9+var8)%(int)(28)))+(var7*var9)))){
System.out.println("TP18 - TP0method3- LineInMethod: 4");
}
else{
 var3 = (int)(var5*var0);
}
return (int)var0;

}

public int TP18method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var5+(int)(39))){
case 0:
var5 = (int)((var7/(int)(36))-(var3*var2));
 break;
case 1:
var7 = (int)((var3*var6)*(var7-var0));
 break;
case 2:
var4 = (int)((var7+(int)(32))-(var4-var5));
 break;
case 3:
TP0method7(var1,var4,var2,var0,var6,var5,var2,var0,var5,var0,var6,var1,var0); break;
case 4:
var4 = (int)((var1/(int)(25))+((var5-var7)*((var0+var4)+((var7+var3)/(int)(43)))));
 break;
case 5:
var3 = (int)((var1-var0)-((var4*var1)-(var0+var2)));
 break;
case 6:
System.out.println("TP18 - TP18method4- LineInMethod: 20");
 break;
default :
var3 = (int)((var6+var3)+(var5+var0));
}
return (int)var0;

}

public int TPInterface2Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if( ((var1*var7)==(var2*var5))){
var11 = (int)((var6-var10)%(int)(15));
}
if( ((var2+var9)<=(var6/(int)(17)))){
var8 = (int)((var7+var11)%(int)(31));
}
return (int)var9;

}

public int TP0method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if(((((var9/(int)(19))*(var2-var8))<=(var2%(int)(32)))&&((((var0*var10)==(var1%(int)(23)))&&((((var8+var0)-(var8%(int)(38)))!=(var2-var10))||((var9*var8)>=(var2*var7))))||((var12-var4)>(var10*(int)(27)))))){
System.out.println("TP18 - TP0method7- LineInMethod: 4");
}
else{
 System.out.println("TP18 - TP0method7- LineInMethod: 6");
}
return (int)var12;

}

public static int TP18method7(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if(((var1-var2)==(var1%(int)(22)))){
System.out.println("TP18 - TP18method7- LineInMethod: 4");
}
else{
 var1 = (int)(var8+var5);
}
return (int)var6;

}


public static void main(String args[]) throws Exception{

try{HashMap<String,Integer> h=new HashMap<String,Integer>();
Connection connect1=null;
connect1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user","user");
TP18 obj = new TP18(h,connect1);
h.put("TP18method0",6);
obj.TP18method0((int)(41),(int)(2),(int)(43),(int)(16),(int)(47),(int)(41));
h.put("TP0method2",7);
obj.TP0method2((int)(31),(int)(49),(int)(5),(int)(23),(int)(25),(int)(4),(int)(1));
h.put("TP18method2",12);
TP18method2((int)(1),(int)(33),(int)(48),(int)(26),(int)(4),(int)(12),(int)(31),(int)(26),(int)(30),(int)(6),(int)(31),(int)(15));
h.put("TP0method3",10);
obj.TP0method3((int)(14),(int)(34),(int)(29),(int)(7),(int)(24),(int)(18),(int)(14),(int)(46),(int)(24),(int)(42));
h.put("TP18method4",8);
obj.TP18method4((int)(16),(int)(45),(int)(13),(int)(15),(int)(32),(int)(35),(int)(48),(int)(24));
h.put("TPInterface2Method0",12);
obj.TPInterface2Method0((int)(29),(int)(6),(int)(12),(int)(5),(int)(26),(int)(16),(int)(8),(int)(39),(int)(21),(int)(16),(int)(1),(int)(46));
h.put("TP0method7",13);
obj.TP0method7((int)(33),(int)(33),(int)(18),(int)(40),(int)(0),(int)(4),(int)(18),(int)(34),(int)(2),(int)(32),(int)(37),(int)(41),(int)(1));
h.put("TP18method7",9);
TP18method7((int)(49),(int)(38),(int)(21),(int)(10),(int)(20),(int)(2),(int)(31),(int)(23),(int)(37));
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
TP18 obj = new TP18();
obj.TP18method0(i14,i9,i1,i7,i6,i4);
obj.TP0method2(i8,i2,i13,i5,i4,i3,i7);
TP18method2(i5,i3,i12,i4,i6,i9,i14,i0,i1,i8,i11,i13);
obj.TP0method3(i5,i6,i11,i13,i2,i8,i0,i12,i1,i7);
obj.TP18method4(i11,i4,i3,i10,i12,i0,i13,i7);
obj.TPInterface2Method0(i1,i7,i9,i5,i0,i14,i2,i11,i6,i8,i13,i4);
obj.TP0method7(i5,i7,i12,i8,i3,i9,i11,i1,i13,i14,i6,i2,i4);
TP18method7(i9,i3,i11,i6,i0,i10,i7,i2,i14);
}

}