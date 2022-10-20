package com.acts.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;

public class newcopy {
public static void main(String[] args) throws Exception {
	Scanner sc =new Scanner(System.in) ;
	System.out.println("Enter the source file location you want to copy");
	String sin = sc.next() ;
	System.out.println("Enter the destination file location you want to copy");
	String sout = sc.next() ;
	FileInputStream fin =new FileInputStream(sin) ;
//	"D:\\Atharva_Workspace\\Day20_oct\\Oct22.txt"
	FileOutputStream fout =new FileOutputStream(sout) ;
	String s ="" ;
	int i =0 ;
	try {
		while((i = fin.read())!= -1) {
			s = s+ (char)i ;
			
		}
		byte b[]=s.getBytes();
		fout.write(b); 
		System.out.println("File copied successfully");
	} catch (Exception e) {
	}
	
	
	
	
	fin.close(); 
	fout.close();
}
}
