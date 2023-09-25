package com.extra;

public class Max3 {

	public static void main(String[] args) {
		int[] a= {-101, -2};
		int max=a[0];
		int Second_Max=0;
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				Second_Max = max ;
				max = a[i] ;


			}
			else if(a[i]>Second_Max && a[i]<max)
				Second_Max = a[i] ;
			else
				continue ;
		}

		System.out.println(max);
		System.out.println(Second_Max);
	}

}
