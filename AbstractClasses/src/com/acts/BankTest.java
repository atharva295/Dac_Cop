package com.acts;
import com.acts.derivedclass.*;
import com.acts.operations.*;

public class BankTest {
	public static void main(String[] args) {
	Bank b = new SBIBank();
	int c = b.rateOfInterest();
	System.out.println(c);
	
	b = new ICICIBank();
	System.out.println(b.rateOfInterest());
	
	}
	
	
	
	
	
	
	
	
	
}
