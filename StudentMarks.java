import java.util.*;
public class StudentMarks{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of the Student");
		int marks = sc.nextInt();
		if(marks<40&&marks>=0)
			System.out.println("Fail");
		else if(marks>=40&&marks<50)
			System.out.println("Second position");
		else if(marks>=50&&marks<75)
			System.out.println("First position");
		else if(marks>=75&&marks<=100)
			System.out.println("Distinction");
		else
			System.out.println("Invalid Input");
	}
}