package com.acts.array;
import java.util.*;


public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size of array");
		int size= sc.nextInt();
		int a[]= new int[size] ;
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++) {
			a[i]= sc.nextInt();
		}
		for(int j=0;j<size/2;j++) {
			int temp=a[j];
			a[j]=a[size-1-j];
			a[size-1-j]= temp;
			
		}
		
		
		for(int i=0;i<size;i++) {
			System.out.print(a[i]);
			
		}
		
			
		
	}

}
