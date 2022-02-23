package com.project4;

class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	int employeeIdInfo() {
		return employeeId;
	}
	String employeeNameInfo() {
		return employeeName;
	}
	double employeeSalaryInfo() {
	return employeeSalary;
}
}

public class DiffMethodDiffReturn {
	public static void main(String[] args) {
		System.out.println("------1st Employee------- ");
		
		Employee e1=new Employee();
		
		e1.employeeId=1020;
		e1.employeeName="Giridhar";
		e1.employeeSalary=10000.00;
		
		System.out.println("Employee Id:"+e1.employeeIdInfo());
		System.out.println("Employee Name:"+e1.employeeNameInfo());
		System.out.println("Employee Salary:"+e1.employeeSalaryInfo());
		System.out.println("------2nd Employee------- ");
		
		Employee e2=new Employee();
		
		e2.employeeId=1030;
		e2.employeeName="Naveen";
		e2.employeeSalary=30000.00;
		
		System.out.println("Employee Id:"+e2.employeeIdInfo());
		System.out.println("Employee Name:"+e2.employeeNameInfo());
		System.out.println("Employee Salary:"+e2.employeeSalaryInfo());
	}

}