import java.util.*;
public class Leapyear{
	public static void main(String... args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter year of your choice");
		
		int year=sc.nextInt();
		if(year%4==0&&(year)%100!=0)
		{
			System.out.println("it is a leap year");
		}
		else if(year%400==0)
			System.out.println("it is a leap year");
		else
			System.out.println("not a leap year") ;
			
		
	}
}