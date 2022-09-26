package com.math;
import java.util.*;

public class ComplexTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int real = sc.nextInt();
		int img=sc.nextInt();
		Complex c1 = new Complex(real ,img) ;
		//Complex c2  = new Complex() ;
		//Complex c3 = new Complex();
		System.out.println(c1.getComplex());
		c1.setReal(6);
		c1.setImg(5);
		System.out.println(c1.getComplex());
		real = sc.nextInt();
		img=sc.nextInt();
		Complex c2  = new Complex(real ,img) ;
		Complex c3  = new Complex() ;
		c1.addComplex(c2);
		System.out.println(c1.getComplex());
		System.out.println(c3.getComplex());
		
		
		
		
		
		
		
		
		
		
		

	}

}
