//package com.acts.Polymorphism;
//import java.lang.Object;
//import java.util.Date;
//import java.util.Scanner;
//import com.acts.Polymorphism.*;
//import java.util.Date;
//import java.util.Arrays;
//
//
//
//public class EmpTester {
//
//	public static void main(String[] args) {
//
//
//		double permcount = 0;
//		double contractualcount = 0;
//		String name2 = null, des2 = null;
//		double emp_id2 = 0;
//		double doj2 = 0;
//		double basicsalary2 = 0;
//		double allowance2 = 0;
//		double incentives2 = 0;
//		double rateperday2 = 0;
//		double noofdays2 = 0;
//		//		 Employee e = new PermEmp(2000,1000,100);
//		//		 System.out.println(e.toString());
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter the size");
//		int size = sc.nextInt();
//		Employee[] e = new Employee[size];
//
//
//		int choice = 0;
//		int current = 0;
//
//		do {System.out.println("1. register or add new employee(permennat)\n" 
//				+ "2. add or register contractual employee \n" 
//				+ " 3. print SPecific employye id \n"
//				+ "4.print the details of all employees \n"
//				+ "5.want to change name of employee with using emp id \n"
//				+ "6.print emp with same title or designation \n "
//				+ "0. exit or quite");
//		System.out.println("please enter your choice \n");
//		choice = sc.nextInt();
//
//		switch(choice) {
//
//		case 1 :{PermanentDetails();
//
//		e[current++] = new PermEmp( basicsalary2, allowance2, incentives2);
//		permcount++;
//		System.out.println("employee added succesfully");
//		System.out.println(Arrays.toString(e));
//		//System.out.println(PermanentDetails());
//		}break;
//
//		case 2 :{ContractualDetails();
//		e[current++] = new ContractualEmp(rateperday2, noofdays2);
//		contractualcount++;	
//		}break;
//
//		case 3 :{System.out.println(" enter emp id to search");
//		int id =sc.nextInt();
//		for(int k=0;k<current;k++) {
//			if(id == e[k].getEmp_id()) {
//				System.out.println(e[k].toString());
//			}
//		}
//		}break;
//
//		case 4 :{ 
//		}break;
//		case 5 :{ System.out.println("  details of all employees");
//		for(int k=0;k<current;k++) {
//			System.out.println(e[k].toString());
//			//{System.out.println("  details of all employees");
//			//		for(int k=0;k<current;k++) {
//			//				System.out.println(e[k].toString());
//			//			
//		}
//		}break;
//
//		case 0 :{System.exit(0);
//
//			}
//		}
//
//
//		}while(choice != 0);
//
//
//	}
//
//	public static void PermanentDetails(){
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println(" Enter the name of the employee");
//		String name2 = sc.next();
//
//		System.out.println(" Enter the title or designation of employee");
//		String des2 = sc.next();
//		System.out.println(" enter emp id");
//		double emp_id2 = sc.nextDouble();
//		System.out.println(" Enter the date of joining of employee");
//		//		System.out.println("Please enter date in DD/MM/YYYY format");
//		//		String strDate = sc.next();
//		//		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
//		double doj2 = sc.nextDouble();
//		//		 System.out.println(" Enter the title or designation of employee");
//		//		 String des2 = sc.next();
//		//		 
//		//Employee e1 = new Employee(name2, des2, emp_id2, doj2);
//		//Employee e1 = new Employee(name2, des2, emp_id2, doj2);
//
//		System.out.println(" Enter the basic salary");
//		double basicsalary2 = sc.nextDouble();
//
//		System.out.println(" Enter the Allowance");
//		double allowance2 = sc.nextDouble();
//
//		System.out.println(" Enter the incentives");
//		double incentives2 = sc.nextDouble();
//	}
//	public static void ContractualDetails() {
//		// PermEmp e2 = new PermEmp (basicsalary2, allowance2, incentives2);
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println(" Enter the name of the employee");
//		String name2 = sc.next();
//		System.out.println(" enter emp id");
//		double emp_id2 = sc.nextDouble();
//		System.out.println(" Enter the date of joining of employee");
//		double doj2 = sc.nextDouble();
//		System.out.println(" Enter the title or designation of employee");
//		String des2 = sc.next();
//		System.out.println(" Enter daily wages(rate per day) ");
//
//		double rateperday2 = sc.nextDouble();
//
//		System.out.println(" Enter no of working days of employee");
//		double noofdays2 = sc.nextDouble();
//
//		// ContractualEmp e3 = new ContractualEmp(rateperday2, noofdays2);
//
//		// System.out.println(e1);
//		// System.out.println(e2);
//		// System.out.println(e3);
//
//	} 
//
//
//
//
//}	
//
//
