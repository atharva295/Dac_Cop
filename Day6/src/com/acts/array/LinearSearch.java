package com.acts.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Boolean flag = false ;
		System.out.println("Enter Size of array"); 

		int size = sc.nextInt();
		System.out.println("Enter elements of an array");
		int arr[]= new int[size];
		for(int i=0 ;i<size ; i++ ) {
			arr[i] = sc.nextInt() ;
			
		}
		int i =0 ;
		System.out.println("Enter element to be found"); 
		int element = sc.nextInt() ;
		for(i=0 ;i<size ; i++ ) {
			if(arr[i]==element) {
				flag = true ;
				break ;
			}
			
		}
		if(flag==true)
			System.out.println("Desired Element found on index " +  i);
		else
			System.out.println("Element Not Found!");
	}

}
