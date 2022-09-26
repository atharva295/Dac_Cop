import java.util.*;
public class Max3{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt() ;
		int b= sc.nextInt() ;
		int c= sc.nextInt() ;
		if(a>b&&a>c)
			System.out.println("Maximum number is " +a) ;
		else if(b>a&&b>c)
			System.out.println("Maximum number is " +b) ;
		else
			System.out.println("Maximum number is " +c) ;
	}
	
}