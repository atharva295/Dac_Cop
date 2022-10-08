package employeeee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {


		//Employee[] employee1 = new Employee[5] ;
		ArrayList<Employee>employee1 = new ArrayList<Employee>() ;
		for(int i=0 ; i<3 ; i++) {
			Employee e1 = new Employee() ;
			employee1.add(e1) ;
		}

		System.out.println("*****Employee Info***** \n"+employee1.toString()) ;

	}

}
