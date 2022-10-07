package com.acts.derivedclass;
import com.acts.operations.Bike;

public class Honda extends Bike{
//here implementation of the abstract method in the parent class must be done
    public void speed(){//here we can say we are overriding the behaviour
    	System.out.println("speed is faster");
		
	}
}
