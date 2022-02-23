package com.project5;
class Employee{
	int employeeId;
	String employeeName;
	double salary;
	Employee(){
		employeeId=100;
		employeeName="chimpesh";
		salary=10000.00;
	}
}
class Employee1{
	int employeeId;
	String employeeName;
	double employeeSalary;

Employee1(int employeeId,String employeeName,double employeeSalary){
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.employeeSalary=employeeSalary;
   }
}

public class Constructors {
	public static void main(String[] args) {
		System.out.println("-----Default-------");
		Employee e=new Employee();
		System.out.println("Employee Id:"+e.employeeId);
		System.out.println("Employee Name:"+e.employeeName);
		System.out.println("Employee Salary:"+e.salary);

		System.out.println("-----Parameterized-------");
		
		Employee1 e1=new Employee1(100,"abc",20000.00);
		System.out.println("Employee Id:"+e1.employeeId);
		System.out.println("Employee Name:"+e1.employeeName);
		System.out.println("Employee Salary:"+e1.employeeSalary);

	}
}