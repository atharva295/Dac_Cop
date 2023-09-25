package com.acts.tester;
import com.acts.business.Address;
import com.acts.business.Student;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		/*Address a1 =new Address(121, "pashan", "pune", 411037) ;
		Address a2 =new Address(102, "panchvati", "pune", 411036) ;
		Address a3 =new Address(102, "Shivajinagar", "pune", 411055) ;
		Address a4 =new Address(102, "hinjawadi", "pune", 411042) ;
		
		Student s1 = new Student(1, "Andleeb", 97, a2) ;
		Student s2 = new Student(2, "Atharva", 97, a1);
		Student s3 = new Student(3, "Swati", 92, a3) ;
		Student s4 = new Student(4, "Pravin", 94, a4);
		System.out.println(s1.getStudentInfo());
		System.out.println(s2.getStudentInfo());
		System.out.println(s3.getStudentInfo());
		System.out.println(s4.getStudentInfo());
		System.out.println("Enter number of Students");
		*/
		System.out.println("Enter number of Students ");
		int size = sc.nextInt();
		
		Student[] students = new Student[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("enter student Address ");
			Address a = new Address(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()) ;
			System.out.println("enter student name, marks, ");
			String name = sc.next();
			int marks = sc.nextInt() ;
			students[i] = new Student(i+1, name, marks, a);
		}
		for (int i = 0; i < size; i++) {
			System.out.println(students[i].getStudentInfo());
		}
	}	
	
	

}
