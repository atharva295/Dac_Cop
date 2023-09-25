package com.acts.fileIO;
import java.io.*;  
public class SequInputStream {
	public static void main(String args[])throws Exception{    
//		FileInputStream input1=new FileInputStream("D:\\Atharva_Workspace\\Day18_oct\\andleeb.txt");    
//		FileInputStream input2=new FileInputStream("D:\\Atharva_Workspace\\Day18_oct\\class.txt");    
		SequenceInputStream inst=new SequenceInputStream(new FileInputStream("D:\\Atharva_Workspace\\Day18_oct\\andleeb.txt"), 
				new FileInputStream("D:\\Atharva_Workspace\\Day18_oct\\class.txt"));    
		int j;    
		while((j=inst.read())!=-1){    
			System.out.print((char)j);    
		}    
		inst.close();    
//		input1.close();    
//		input2.close();    
	}    
}
