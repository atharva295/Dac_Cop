package com.extra;

import java.util.Scanner;

public class ReplaceZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int temp = n ;
		int dec=1 ;
		int ans =0 ;
		while(temp!=0 ) {
			int i = temp%10 ;
			if(i==0) {
				ans = ans+ 1*dec;
			}else {
				ans = i*dec + ans  ;
				
			}
			temp/=10 ;
			dec = dec*10 ;

		}
		System.out.println(ans);
		sc.close();
	}
}
