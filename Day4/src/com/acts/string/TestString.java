package com.acts.string;

public class TestString {

	public static void main(String[] args) {
		String str1="CDAC";
		String str2="ACTS";
		String str3="ACTS";
		System.out.println(str2==str3); 
		System.out.println(str2.equals(str3));
		String str4 = new String("ACTS") ;
		System.out.println(str2==str4);
		System.out.println(str2.equals(str4));
		String str5 = new String("ACTS").intern();
		System.out.println(str2==str5);
		System.out.println(str2.equals(str5));
		

	}

}
