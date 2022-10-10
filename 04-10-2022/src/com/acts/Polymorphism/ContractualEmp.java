package com.acts.Polymorphism;

public class ContractualEmp extends Employee {
	private double rateperday;
	private double noofdays;
	
	public ContractualEmp() {
		
	}
	public ContractualEmp(double rateperday1, double noofdays1) {
		super();
		this.rateperday = rateperday1;
		this.noofdays = noofdays1;
	}


	public double getRateperday() {
		return rateperday;
	}


	public void setRateperday(double rateperday) {
		this.rateperday = rateperday;
	}


	public double getNoofdays() {
		return noofdays;
	}


	public void setNoofdays(double noofdays) {
		this.noofdays = noofdays;
	}
	
	public double paymentcal() {
		
		return (rateperday*noofdays);
	}
   

	public String toString() {
		return  super.toString() +
				" \n rate per day " + rateperday +
				" \n no of days " + noofdays +
				paymentcal();
	}
}
