import java.util.*;
public class Pow{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int base= sc.nextInt();
		System.out.println("enter power");
		int power=sc.nextInt();
		int ans=1 ;
		while(power!=0){
			ans = ans*base ;
			power-- ;
		}
		System.out.println("power of no "+base+"is"+ans ) ;
	}
}