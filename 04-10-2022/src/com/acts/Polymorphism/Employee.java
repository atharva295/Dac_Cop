package com.acts.Polymorphism;

public class Employee {

	private String name;
	private String des;
	private double emp_id;
	private double doj;
	public Employee(String name, String des, double emp_id, double doj) {
		super();
		this.name = name;
		this.des = des;
		this.emp_id = emp_id;
		this.doj = doj;
	}

	//private double
	
	
	public Employee() {
		
	}
	

	public String getdes() {
		return des;
	}

	public void setdes(String des) {
		this.des = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(double emp_id) {
		this.emp_id = emp_id;
	}

	public double getDoj() {
		return doj;
	}

	public void setDoj(double doj) {
		this.doj = doj;
	}
	
	public String toString() {
		
		return "  name  " + name +
				" \n des  "+  des +
				" \n emp_id " + emp_id +
				" \n doj " + doj ;
	}
	
	
	
	
	
}
