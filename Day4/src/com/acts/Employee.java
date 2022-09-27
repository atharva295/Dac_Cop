package com.acts;

public class Employee {
	
	private String empName ;
	private int empId ;
	private int salary ;
	private String company ;
	
	public Employee() {
		this.empName = "";
		this.empId = 0 ;
		this.salary = 0 ;
		this.company = "ACTS" ;
	}
	public Employee(String empName, int empId, String company) {
		this.empName = empName;
		this.empId = empId ;
		//this.salary = 0 ;
		this.company = company ;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public String getInfo() {
		return "Employee ID :"+this.empId+
				"\n Employee Name: "+ this.empName+
				"\n Employee Salary : "+ this.salary+
				"\n Employee Company: "+this.company;
	}
	
	
	
	
}
