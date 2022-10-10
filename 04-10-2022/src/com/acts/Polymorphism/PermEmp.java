package com.acts.Polymorphism;

import java.util.Scanner;

public class PermEmp extends Employee {
	private double basicsalary;
	private double allowance;
	private double incentives;
	
	public PermEmp() {
		
	}
	
	public PermEmp( double basicsalary1, double allowance1, double incentives1) {
		super();
		this.basicsalary = basicsalary1;
		this.allowance = allowance1;
		this.incentives = incentives1;
	}
	

	public double salarycal() {
		return (basicsalary+allowance+incentives );
	}
	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	@Override
	public String toString() {
		return  super.toString()+
				"  \n basic salary   " + basicsalary + 
				" \n incentives  " + incentives + 
				"  \n Allowance's  " +  allowance  ; 
	}
	

}
