package com.acts.derivedclass;
import com.acts.operations.*;

public class SBIBank extends Bank{//inheriting the properties of bank in child class
//here it is necessary to implement the abstract method of parent class Bank
//we have to override the method 
	//while overriding everything i.e. signature must be same i.e. return type access modifier name of the method 
	public int rateOfInterest() {
		return 7;
	}
}
