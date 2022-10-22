package com.acts.fileIO;
import java.io.FileOutputStream;
public class FileOutStrem {

	public static void main(String[] args) {

		try{    
			   FileOutputStream fout=new FileOutputStream("D:\\Atharva_Workspace\\Dac_Cop\\Day18_oct\\class.txt");    
	             String s="this is andleeb and atharva ";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);} 
	}    
}
