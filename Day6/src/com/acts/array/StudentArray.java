package com.acts.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter number of student"); 

		int size = sc.nextInt() ;
		System.out.println("Enter names of student"); 
		String arr[] = new String[size] ;
		for(int j=0 ; j<size ; j++) {
			arr[j] = sc.next() ;
		}
		System.out.println("Enter roll no of student"); 
		int rollNo =sc.nextInt() ;
		System.out.println(arr[rollNo-1]); 
		
		
		
	}

}
