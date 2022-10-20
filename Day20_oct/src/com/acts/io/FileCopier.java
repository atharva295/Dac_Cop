package com.acts.io;

import java.io.FileInputStream;  
import java.io.FileOutputStream;

public class FileCopier {
	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("D:\\Atharva_Workspace\\Day20_oct\\Oct20.txt");
		FileOutputStream fout=new FileOutputStream("D:\\Atharva_Workspace\\Day20_oct\\Oct21.txt");
		int i=0;    
		String s ="" ;
		try{
			while((i=fin.read())!=-1){    
				s = s+ (char)i;    
			}
		}catch(Exception e){System.out.println(e);}
		try{
			byte b[]=s.getBytes();
			fout.write(b);    
			fout.close();    
			System.out.println("success...");    
		}catch(Exception e){System.out.println(e);}
		fin.close();    
	}
}
