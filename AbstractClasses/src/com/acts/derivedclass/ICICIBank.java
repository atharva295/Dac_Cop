package com.acts.derivedclass;
import com.acts.operations.*;

public class ICICIBank extends Bank{
	//here we have to implement the abstract method of the parent class
	//first override it i.e. signature should be same no matter what's in the body
	public int rateOfInterest() {
		return 8;
	}
	

}
