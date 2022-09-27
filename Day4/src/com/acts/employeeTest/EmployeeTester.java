package com.acts.employeeTest;

import java.util.Scanner;

import com.acts.Employee;

public class EmployeeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name  = sc.next() ;
		System.out.println("Enter Employee ID");
		int id = sc.nextInt() ;
		System.out.println("Enter salary ");
		int salary = sc.nextInt() ;
		System.out.println("Enter company name ");
		String company = sc.next() ;
		
		Employee employee1 = new Employee(name, id , company) ;
		employee1.setSalary(salary);
		System.out.println("*****Employee Info***** \n"+employee1.getInfo()) ;
		System.out.println("Enter updated salary");
		salary = sc.nextInt() ;
		employee1.setSalary(salary);
		System.out.println("Updated Info");
		System.out.println("*****Employee Info***** \n"+employee1.getInfo()) ;
		
		
		

	}

}
