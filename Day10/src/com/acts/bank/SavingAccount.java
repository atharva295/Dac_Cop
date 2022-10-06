package com.acts.bank;

import java.util.Scanner;

public class SavingAccount extends Account {
	Scanner sc = new Scanner(System.in) ;
	private int miniBal;
	private int currBal;
	private double roi ;
	protected int getMiniBal() {
		return miniBal;
	}
	public SavingAccount() {
		System.out.println("Enter name");
		super.name = sc.next() ;
		System.out.println("Enter account number"); 
		super.accNumber  = sc.nextLong() ;
		System.out.println("Enter Amont to be deposited");
		this.currBal = sc.nextInt() ;
		System.out.println("Enter ROI");
		this.roi = sc.nextDouble() ;
	
		System.out.println("Account Added Successfully");
		
	}
	public SavingAccount(String name, long accNumber,  int currBal, int roi) {
		super.accNumber = accNumber ;
		super.name =name ;
		this.currBal = currBal ;
		
		this.roi = roi ;
	}
	
	@Override
	public String toString() {
		return "SavingAccount [\n Name"+super.name+
				"\nAccount Number= "+super.accNumber+
				"\n currBal=" + currBal +
				"\n roi=" + roi + "]";
	}
	protected int getCurrBal() {
		return currBal;
	}
	
	protected void setCurrBal(int currBal) {
		this.currBal = currBal;
	}
	protected double getRoi() {
		return roi;
	}
	
	public double calIntrest(int time) {
		double intr ;
		intr = (currBal*time*roi)/100 ;
		return intr ;
	}
	
	
}
