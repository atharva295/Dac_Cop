import java.util.*;
public class  ReverseN {
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to be reversed");
		int n=sc.nextInt();
		//n=1234->4321
		int reverse =0 ;
		int temp =n ;
		while(temp!=0){
			reverse = reverse*10+temp%10 ;
			temp =temp/10 ;
		}
		
		System.out.println("Reverse of number "+n+" is "+ reverse);
		
	}
}

//432 
//1234->1000*1+2*100+3*10+4*1