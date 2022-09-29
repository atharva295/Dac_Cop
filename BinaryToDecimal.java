package com.extra;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		System.out.println("Enter bineary number"); 
		int a = sc.nextInt() ;
		//int b = sc.nextInt() ;
		 int power= 0 ;
		 int temp = a ;
		 double ans =0 ;
		 
		 while(temp!=0) {
			 int i=temp%10 ;
			 ans = ans + i*Math.pow(2, power) ;
			 power++ ;
			 temp/=10 ;
			 
		 }
		 System.out.println(ans); 

	}

}
