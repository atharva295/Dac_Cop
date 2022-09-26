package com.math;

import java.util.*;

public class AdditionTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter two integers to add");
		int n = sc.nextInt() ;
		int n1 =sc.nextInt();
		int ans  = Addition.add(n, n1);
		System.out.println("Enter two doubles to add");
		double d1 , d2 ;
		d1 = sc.nextDouble() ;
		d2 = sc.nextDouble() ;
		double ans1  = Addition.add(d1, d2);  
		
		System.out.println(ans);
		System.out.println(ans1);
		
		
		 
		
		
		
		
	}

}
