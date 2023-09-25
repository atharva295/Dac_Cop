package com.acts;
import com.acts.derivedclass.*;
import com.acts.operations.*;

public class AbstractClasses {
public static void main(String[] args) {
	Bike b1 = new Honda();//so yes we can make reference of parent class/abstract class but cannot instantiate it because in abstract classes there are abstract methods
	//and abstract methods are just blue print there is nothing in that method implementation of that method is done in other class 
	b1.speed();
}
}
