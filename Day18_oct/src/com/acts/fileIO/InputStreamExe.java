package com.acts.fileIO;
import java.io.*; 
public class InputStreamExe {
	 public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("D:\\Atharva_Workspace\\Dac_Cop\\Day18_oct\\class.txt");    
           int i=0;    
           while((i=fin.read())!=-1){    
            System.out.print((char)i);    
           }    
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }    
}
