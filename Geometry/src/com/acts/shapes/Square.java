package com.acts.shapes;

public class Square extends Shape {
	int side ;

	public Square(int side) {
		super();
		this.side = side; 
	}

	@Override
	public double calArea() {
		return  side*side;
	}

	@Override
	public double calPeri() {
		return 4*side;
	}

}
