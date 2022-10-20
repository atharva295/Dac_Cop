package com.acts.fileIO;
import java.io.*; 
public class BufferOutputStreamExample {
	public static void main(String args[])throws Exception{    
	     BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("D:\\Atharva_Workspace\\Day18_oct\\andleeb.txt"));    
	     String s="Andleeb is cool";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     
	     System.out.println("success");    
	}    

}
 



