package com.acts;
import java.util.*;

import java.time.LocalDate;


public class JobSeekerTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		List<JobSeeker> jobList = null  ; //lazyin  
		do {
			System.out.println("enter your choice \n"
					+ " 1.Register yourself \n"
					+ " 2. update your email Id \n "
					+ "3. Display all job seekers by their degree type \n"
					+ " 4. Sort job seekers details as per email Id \n "
					+ "5. Sort joob seekers as per date of birth \n"
					+ " 6. Sort customer details as per graduation date \n "); 
					switch (choice) {
					case 1:
						System.out.println("Enter your name");
						String name =sc.next() ;
						System.out.println("Enter your email ");
						String Email = sc.next();
						if(!Validate.validateEmail(Email)) {
							System.err.println("Account already registered");
							continue;
						}
						System.out.println("enter your passward");
						int pass = sc.nextInt();
						System.out.println("enter your date of birth");
						String dob = sc.next() ;
						LocalDate DOB =Validate.validateDOB(dob) ;
						if(DOB == null) {
							System.err.println("invalid DOB !!!!!!!!!!!!");
							continue;
						}
						System.out.println("enter your adhaarId");
						int adhaarId = sc.nextInt();
						System.out.println("enter your phone no");
						String phoneNo = sc.next();
						
						System.out.println("enter your graduationdate");
						String graddate = sc.next();
						LocalDate d=Validate.validateGrad(graddate); 
						if(d==null) {
							System.err.println("invalid Graduation date !!!!!!!!!!!!");
							break;
						}
						System.out.println("enter your degree");
						String  deg = sc.next();
						if(jobList == null) {
						}
				
						break;

					default:
						break;
					}

		} while (choice !=0) ;


	}
}
