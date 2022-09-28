package com.acts.array;

public class SelectionSortArray {
	public static void main(String[] args) {
		int arr[] = {80,100,30,20,60,50} ;
		int small =0 ;
		for(int i=0;i<arr.length;i++)
		{	
			small = i ; 
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[small])
					small = j;
			}
			int temp = arr[small] ;
			arr[small] = arr[i] ;
			arr[i] = temp ;	
		
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
			
	}
}
