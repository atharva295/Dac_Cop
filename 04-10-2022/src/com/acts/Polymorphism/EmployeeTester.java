package com.acts.Polymorphism;

import java.util.Scanner;

public class EmployeeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size");
		int size = sc.nextInt();
		Employee[] e = new Employee[size];
		int choice = 0;
		int current = 0;
		do {
			System.out.println("1. register or add new employee(permennat)\n" 
					+ "2. add or register contractual employee \n" 
					+ " 3. print SPecific employye id \n"
					+ "4.print the details of all employees \n"
					+ "5.want to change name of employee with using emp id \n"
					+ "6.print emp with same title or designation \n "
					+ "0. exit or quite");
			System.out.println("please enter your choice \n");
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				PermEmp n = new PermEmp() ;
				e[current++]  = n ;;
				PermanentDetails(n);

			}
			break;
			case 2:{
				ContractualEmp c = new ContractualEmp();
				e[current++]= c;
				ContractualDetails(c) ;
			}
			break;
			case 3:{
				System.out.println("enter Employee id to be searched");
				int id = sc.nextInt() ;
				int i=0 ;
				for( i=0 ; i<current ; i++) {
					if(e[i].getEmp_id()==id) {
						System.out.println(e[i].toString());
						break ;
					}
				}
				if(i==current) {
					System.err.println("Enter valid employee ID");
				}


			}
			break;
			case 4:{
				for( int i=0 ; i<current ; i++) {
					System.out.println(e[i].toString());
					System.out.println("*************************");
				}
			}
			break;
			case 5:{
				System.out.println("enter Employee id whoes name to be changed");
				int id = sc.nextInt() ;
				int i=0 ;
				for( i=0 ; i<current ; i++) {
					if(e[i].getEmp_id()==id) {
						System.out.println("Enter new Name");
						e[i].setName(sc.next()); //directly input passed to setname method 
					}
				}
				if(i==current) {
					System.err.println("Enter valid employee ID");
				}

			}
			break;
			case 6:{
				System.out.println("enter Employee designation to be searched");
				int i=0 ;
				String ds = sc.next();
				for( i=0 ; i<current ; i++) {
					if(e[i].getdes().equals(ds)) {
						System.out.println(e[i].toString());
					}
				}
			}
			break;
			case 0:{
				System.exit(0);
			}
			}


		} while (choice!=0);
	}
	public static void PermanentDetails(PermEmp e1){


		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the name of the employee");
		String name2 = sc.next();
		e1.setName(name2);

		System.out.println(" Enter the title or designation of employee");
		String des2 = sc.next();
		e1.setdes(des2);

		System.out.println(" enter emp id");
		double emp_id2 = sc.nextDouble();
		e1.setEmp_id(emp_id2);

		System.out.println(" Enter the date of joining of employee");
		double doj2 = sc.nextDouble();
		e1.setDoj(doj2);

		System.out.println(" Enter the basic salary");
		double basicsalary2 = sc.nextDouble();
		e1.setBasicsalary(basicsalary2);

		System.out.println(" Enter the Allowance");
		double allowance2 = sc.nextDouble();
		e1.setAllowance(allowance2);

		System.out.println(" Enter the incentives");
		double incentives2 = sc.nextDouble();
		e1.setIncentives(incentives2);
	}
	public static void ContractualDetails(ContractualEmp e2) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the name of the employee");
		String name2 = sc.next();
		e2.setName(name2);

		System.out.println(" enter emp id");
		double emp_id2 = sc.nextDouble();
		e2.setEmp_id(emp_id2);

		System.out.println(" Enter the date of joining of employee");
		double doj2 = sc.nextDouble();
		e2.setDoj(doj2);

		System.out.println(" Enter the title or designation of employee");
		String des2 = sc.next();
		e2.setdes(des2);

		System.out.println(" Enter daily wages(rate per day) ");
		double rateperday2 = sc.nextDouble();
		e2.setRateperday(rateperday2);

		System.out.println(" Enter no of working days of employee");
		double noofdays2 = sc.nextDouble();
		e2.setNoofdays(noofdays2);
	} 
}
