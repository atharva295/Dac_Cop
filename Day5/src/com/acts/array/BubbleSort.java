package com.acts.array;

public class BubbleSort {

	public static void main(String[] args) { 
		int arr[]= {10,50,34,79,22};
		for(int i=arr.length;i>=0;i--)
		{
			for(int j=0;j<i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp ;
				}
					
				
			}
		}
		for(int k=0 ;k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

}
