package com.acts.array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter size of matrix");
		int a = sc.nextInt();
		int arr1 [][]= new int[a][a];
		int arr2 [][] = new int[a][a] ;
		int ans [][] = new int[a][a] ;
		System.out.println("Enter values of first matrix");
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<a ; j++) {
				arr1[i][j] = sc.nextInt() ;
			}
		}
		System.out.println("Enter values of Secound matrix");
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<a ; j++) {
				arr2[i][j] = sc.nextInt() ;
			}
		}
		
		//Multiplication logic 
		
		//System.out.println("Enter values of first matrix");
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<a ; j++) {
				for(int k=0 ; k<a ; k++) {
					ans[i][j] = ans[i][j]+arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<a ; j++) {
				System.out.print(ans[i][j] +" ");;
			}
			System.out.println();
		}
		
	}

}
