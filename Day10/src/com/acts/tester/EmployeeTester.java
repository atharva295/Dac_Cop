package com.acts.tester;

import java.util.Scanner;

import com.acts.bank.*;

public class EmployeeTester {
	public static void main(String[] args) {
	
		String name= "Andleeb" ;
		long accNumber = 82658845;
		int amount= 50000;
		int tenure = 5 ;
		double roi =8;
		int miniBal =5000 ;
		int currBal =50000 ;
		int rois =3 ;
		SavingAccount ands =new SavingAccount(name,accNumber,miniBal,currBal,rois) ;
		System.out.println(ands);
		System.out.println(ands.calIntrest(3));
		System.out.println();
		FdAccount and=new FdAccount(name,accNumber,amount, tenure, roi) ;
		System.out.println(and);
		System.out.println();
		System.out.println(and.calIntrest());
	}
}
