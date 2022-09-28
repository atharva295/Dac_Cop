package com.acts.string;

import java.util.Scanner;

public class StringUtility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String str = sc.next() ;
		str = reverse(str);
		System.out.println(str);
		
	}
	public static String reverse(String str1) {
		String str = "" ;
		
		for(int i=0 ; i<str1.length() ; i++) {
			str = str1.charAt(i )+str ;
		}
		return str ;
	}

}
