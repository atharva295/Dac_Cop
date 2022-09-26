package com.math;

import java.util.Scanner;


public class Complex {
	Scanner sc = new Scanner(System.in) ;
	private int real  ;
	private int img ;
	
	
	Complex() {
		
		int real = 0;
		int img  = 0;
	}
	Complex(int real, int img){
		this.real = real ;
		this.img = img ;
	}
	
	 public String getComplex(){
		
		 return "real = "+this.real+"  img = "+this.img ;

	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	void addComplex(Complex c2){
		this.real = this.real+ c2.real ;
		this.img = this.img + c2.img ;
		
		
		
	}
	
	
}
