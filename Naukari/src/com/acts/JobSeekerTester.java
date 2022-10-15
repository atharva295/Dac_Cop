package com.acts;
import java.util.*;

import java.time.LocalDate;

public class JobSeekerTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		
		List<JobSeeker> jobList = new ArrayList<>();  ; //lazyin  
		do {
			System.out.println("enter your choice \n"
					+ " 1.Register yourself \n"
					+ " 2. update your email Id \n "
					+ "3. Display all job seekers by their degree type \n"
					+ " 4. Sort job seekers details as per email Id \n "
					+ "5. Sort joob seekers as per date of birth \n"
					+ " 6. Sort customer details as per graduation date \n "); 
			choice = sc.nextInt() ;
			switch (choice) {
			case 1:{
				System.out.println("Enter your name");
				String name =sc.next() ;
				System.out.println("Enter your email ");
				String Email = sc.next();
				if(Validate.validateEmail(Email , jobList)) {
					System.err.println("Account already registered");
					break;
				}
				System.out.println("enter your passward");
				int pass = sc.nextInt();
				System.out.println("enter your date of birth");
				String dob = sc.next() ;
				LocalDate DOB =Validate.validateDOB(dob) ;
				if(DOB == null) {
					System.err.println("invalid DOB !!!!!!!!!!!!");
					break;
				}
				System.out.println("enter your adhaarId");
				int adhaarId = sc.nextInt();
				System.out.println("enter your phone no");
				String phoneNo = sc.next();
				if(!Validate.validatePhone(phoneNo)) {
					System.out.println("Enter valid phone no ");
					break ;
				}
				System.out.println("enter your graduationdate");
				String graddate = sc.next();
				LocalDate d=Validate.validateGrad(graddate); 
				if(d==null) {
					System.err.println("invalid Graduation date !!!!!!!!!!!!");
					break;
				}
				System.out.println("enter your degree");
				String  deg = sc.next();
				JobSeeker obj =new JobSeeker(name, Email, adhaarId, phoneNo, DOB, pass, d) ;
				System.out.println(obj);
			}break;
			case 2:{
				System.out.println("Enter Your registration ID");
				int id = sc.nextInt() ;
				for(int i=0 ;i<jobList.size(); i++) {
					if(jobList.get(i).getRegistrationID() == id) {
						System.out.println("Enter email you want to update");
						String neamil =sc.next() ;
						jobList.get(i).setEmail(neamil);
						System.out.println("Email changed successfully");
						break ;
					}
				}
				System.out.println("You have entered wrong registration ID");
				
			}break ;
			case 3:{
				Collections.sort(jobList, new CourseComparator());
			}break;
			
			default:
				break;
			}

		} while (choice !=0) ;


	}
}
