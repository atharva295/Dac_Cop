import java.util.*;

public class StringReverseByWord {

	public static void main(String[] args) {
		   String reverseWord="";  
		String str ;  
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter the string to be reversed");
		str= sc.nextLine();
		String words[]=str.split("\\s");  
		for(String w:words){ 
			StringBuilder sb=new StringBuilder(w) ;
			sb.reverse();  
			reverseWord+=sb.toString()+" ";  
		}  
		System.out.println(reverseWord.trim());   
	}
}


