package com.acts.business;

public class Student {
	private int rollNo ;
	private String name ;
	private int marks ;
	private Address address ;
	
	public Student(int rollNo, String name,int marks,Address address ) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String  getStudentInfo(){
		return ("***************************"+
				"\nStudent Name :"+this.name+
				"\n Student Rollno: "+this.rollNo+
				"\n Student Marks :"+this.marks+
				"\n Student Address :"+this.address.getAddress()+
				"***************************") ;
	}
	
	
} 
