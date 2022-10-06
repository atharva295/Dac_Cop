package com.acts.shapes;

public class circle extends Shape {
	int radius ;
	

	public circle(int radius) {
		super();
		this.radius = radius;
	}
	

	@Override
	public double calArea() {
		return (3.14*radius*radius);
	}

	@Override
	public double calPeri() {
		return(3.14*2*radius);
	}

}
