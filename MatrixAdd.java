package com.acts.array;
import java.util.*;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter size of matrix");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr1 [][]= new int[a][b];
		int arr2 [][] = new int[a][b] ;
		int ans [][] = new int[a][b] ;
		System.out.println("Enter values of first matrix");
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				arr1[i][j] = sc.nextInt() ;
			}
		}
		System.out.println("Enter values of Secound matrix");
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				arr2[i][j] = sc.nextInt() ;
			}
		}
		//addition 
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				ans[i][j] = arr1[i][j]+ arr2[i][j] ;
			}
		}
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
