package com.acts.tester;

import java.util.Scanner;

import com.acts.bank.*;

public class EmployeeTester {
	public static void main(String[] args) {

		String name= "" ;
		long accNumber ;
		int amount;
		int tenure ;
		double roi ;
		int miniBal ;
		int currBal  ;
		int rois ;
		//		SavingAccount ands =new SavingAccount(name,accNumber,miniBal,currBal,rois) ;
		//		System.out.println(ands);
		//		System.out.println(ands.calIntrest(3));
		//		System.out.println();
		//		FdAccount and=new FdAccount(name,accNumber,amount, tenure, roi) ;
		//		System.out.println(and);
		//		System.out.println();
		//		System.out.println(and.calIntrest());
		Account[] a = new Account[10] ;
		int choice =0 ;
		int curr =0  ;
		Scanner sc = new Scanner(System.in) ;
		do {
			System.out.println("1. Create New Saving Account ");
			System.out.println("2. Create New FD Account");
			System.out.println("3. change Name by Account Number ");
			System.out.println("4. Search Account By name ");
			System.out.println("5.Show all saving account holders");
			System.out.println("6. Show all FD account holders");
			System.out.println("0. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt() ;

			switch(choice) {
			case 1:{
				a[curr++] = new SavingAccount() ;
			}break ;
			case 2:{
				a[curr++] = new FdAccount() ;
			}break ;
			case 3:{

			}break ;
			case 4:{

			}break ;
			case 5:{

			}break ;
			case 6:{

			}break ;
			case 0:{

			}

			}

		}while(choice!=0 ) ;

		

	}
	
}
