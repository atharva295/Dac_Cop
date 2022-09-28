package com.acts.array;
import java.util.* ;

public class ArrayUtilityClass {
	public static void main(String[] args) {
		int arr[] = {80,100,30,20,60,50} ;
		int max= 0 ;
		int secondMax = 0 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax =max ;
				max = arr[i];
			}
			else if(arr[i]>secondMax &&arr[i]<max) {
				secondMax = arr[i] ;
			}
			else {
				continue ;
			}
		}
		System.out.println(max );
		System.out.println(secondMax);
		
	}
}
