package com.extra;
import java.lang.String ;
import java.util.Scanner;

public class DecimalToBianary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		System.out.println("Enter Decimal number"); 
		int n = sc.nextInt() ;
		//int b = sc.nextInt() ;
		String ans= "" ;
		int temp = n ;
		while(temp!= 0) {
			int  a = temp %2 ;
			temp/=2 ;
			ans =  a+ans  ;
		}
		System.out.println(ans);

	}

}
