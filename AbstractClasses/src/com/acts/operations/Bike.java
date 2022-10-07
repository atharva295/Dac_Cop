package com.acts.operations;

public abstract class Bike {
	public Bike() {
     System.out.println("Bikes are good");
	}
public abstract void speed();//its just a blueprint
//implementation of this method is done in other class 
//abstract class must contain atleast one abstract method 
//it is necessary to declare the abstract class and methods by the keyword abstract
//abstract class is a incomplete type
//abstract classes cannot be instantiated or there object cannot be created but there reference can be created

}
