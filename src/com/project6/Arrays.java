package com.project6;

public class Arrays {

	public static void main(String[] args) {
       Employee e1=new Employee();
       e1.name="Giri";
       Employee e2=new Employee();
       e2.name="Pavan";
       Employee e3=new Employee();
       e3.name="Naveen";
       Employee e4=new Employee();
       e4.name="Murali";
       Employee e5=new Employee();
       e5.name="Mani";
       
       Employee[] empArr=new Employee[5];
       empArr[0]=e1;
       empArr[1]=e2;
       empArr[2]=e3;
       empArr[3]=e4;
       empArr[4]=e5;
       
       for(int i=0;i<empArr.length;i++) {
    	   System.out.println(empArr[i].name);
       }
	}
}
class Employee{
	String name;
}
