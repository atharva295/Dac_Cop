import java.util.*;
public class Circle{
	public static void main(String... args){
		Scanner sc= new Scanner(System.in);
		int radius= sc.nextInt();
		//double pi=3.14;
		double A=Operations.Area(radius);
		double B = Operations.circumference(radius);
		System.out.println("Area of circle is="+A);
		System.out.println("circumference of circle is="+B);
		
		
	}
}
static private class Operations{
	public static double Area(int radius){
		return (3.14*radius*radius);
	}
	public static double circumference(int radius){
		return (3.14*2*radius);
	}
	
}
