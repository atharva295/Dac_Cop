package com.acts.acc;

import java.util.Scanner;

public class Account {
	private int accountNo ;
	private String accountName ;
	private static double roi = 3.5 ;
	private double balance  ;
	private static double minBal ;
	private double intrest = 0.0 ;
	Scanner sc =new Scanner(System.in) ;

	public Account() {
		System.out.println("Enter Account Name");
		this.accountName = sc.next() ;
		System.out.println("Enter Account Number");
		this.accountNo = sc.nextInt() ; 
		System.out.println("Enter initial Amount to be deposited");
	    balance = sc.nextDouble();
		
	}

	public Account(int accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}	
	public void setaccountNo(int accountno) { this.accountNo = accountno; }
	public int getaccountno() { return accountNo; }

	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) { this.accountName =
			accountName; }
	
	public static double getInterest() { return roi; }

	public static void setInterest(double interest) { Account.roi =
			interest; }

	public double getBalance() { return balance; }

	public void setBalance(double balance) { this.balance = balance; }

	public static double getMinBal() { return minBal; }
	
	public static void setMinBal(double minBal) { Account.minBal = minBal; }
	public double intrestcal() {
		intrest = balance*roi/100 ;
		return intrest ;
		
	}

	@Override
	public String toString() {
		return "\t\t\t********** \n  accountNo = " + accountNo + 
				"\n accountName = " + accountName + 
				"\n balance = 1" + balance + "\n "
						+ " intrest= " + intrest 
						+ "\t\t\t************";
	}

}




















