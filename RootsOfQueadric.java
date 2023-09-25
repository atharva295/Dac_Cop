package com.extra;

import java.util.Scanner;

public class RootsOfQueadric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c ;
		System.out.println("Enter three numbers");
		a=sc.nextInt() ;
		b=sc.nextInt() ;
		c=sc.nextInt() ;
		double root1, root2 ;
		root1 = -b +Math.pow((Math.pow(b, 2)-4*a*c), 0.5) ;
		root1 = root1 /(2*a) ;
		root2 = -b -Math.pow((Math.pow(b, 2)-4*a*c), 0.5) ;
		root2 = root2 /(2*a) ;
		System.out.println(root1);
		System.out.println(root2);
		sc.close() ;

		
	}

}
