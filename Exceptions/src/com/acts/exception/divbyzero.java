package com.acts.exception;
import java.util.*;


public class divbyzero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans=0 ;
		try {
			 ans= a/b;
		}
		catch(Exception e) {
			System.out.println("do not enter zero");
		}
		System.out.println(ans);	
		
	}

}
