package com.acts.acc;

import java.util.Scanner;

public class Account {
	private Integer accountNo ;
	private String accountName ;
	private static double roi = 3.5 ;
	private Double balance =0.0  ;
	private static double minBal ;
	private double intrest = 0.0 ;
	Scanner sc =new Scanner(System.in) ;

	public Account() {
		
	}

	public Account(Integer accountNo, String accountName, Double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}	
	public void setaccountNo(Integer accountno) { this.accountNo = accountno; }
	public Integer getaccountno() { return accountNo; }

	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) { this.accountName =
			accountName; }
	
	public static double getInterest() { return roi; }

	public static void setInterest(double interest) { Account.roi =
			interest; }

	public Double getBalance() { return balance; }

	public void setBalance(Double balance) { this.balance = balance; }

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
				"\n balance = " + balance + "\n "
						+ " intrest= " + intrest 
						+ "\t\t\t************";
	}

}




















