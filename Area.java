import java.util.*;
public class Area{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter length of rectangle"); 
		int l = sc.nextInt();
		System.out.println("Enter breadth of rectangle"); 
		int b = sc.nextInt();
		int area= l*b;
		int peri= 2*(l+b);
		System.out.println("area="+area);
		System.out.println("peri="+peri);
		
		
		
	}
}

