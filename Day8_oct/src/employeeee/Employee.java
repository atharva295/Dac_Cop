package employeeee;

import java.util.Scanner;

public class Employee {
	private String empName ;
	private int empId ;
	private int salary ;
	private String company ;
	
	public Employee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		this.empName  = sc.next() ;
		System.out.println("Enter Employee ID");
		this.empId = sc.nextInt() ;
		System.out.println("Enter salary ");
		this.salary = sc.nextInt() ;
		System.out.println("Enter company name ");
		this.company = sc.next() ;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", company=" + company
				+ "]";
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
