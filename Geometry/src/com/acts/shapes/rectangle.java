package com.acts.shapes;

public class rectangle extends Shape {
	int l,b;

	public rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public double calArea(){
		return l*b;
		
	}
	public double calPeri() {
		return 2*(l+b) ;
	}
	

}
