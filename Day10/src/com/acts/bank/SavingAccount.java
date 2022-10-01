package com.acts.bank;

public class SavingAccount extends Account {
	private int miniBal;
	private int currBal;
	private double roi ;
	protected int getMiniBal() {
		return miniBal;
	}
	public SavingAccount(String name, long accNumber, int miniBal, int currBal, int roi) {
		super.accNumber = accNumber ;
		super.name =name ;
		this.currBal = currBal ;
		this.miniBal = miniBal ;
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
