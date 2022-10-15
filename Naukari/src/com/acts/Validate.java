package com.acts;
import java.time.LocalDate;
import java.util.List;
public class Validate {
	public static LocalDate validateDOB(String dob){
		LocalDate DOB = LocalDate.parse(dob);
		int a = LocalDate.now().getYear()-DOB.getYear() ;
		if (a>18) {
			return DOB ;
		}


		return null ;
	}
	
	public static LocalDate validateGrad(String graddate){
		LocalDate today = LocalDate.now() ;
		LocalDate date = LocalDate.parse(graddate);//yyy-mm-dd
		if(date.isBefore(today)) {
			return date ;
		}

		return null ;
	}
	public static boolean validatePhone(String phoneNo) {
		if((phoneNo.length()==10)) {
			for(int i=0 ;i<10;i++) {
				if(phoneNo.charAt(i)>='0'&&phoneNo.charAt(i)<='9') {

				}else {
					return false ;
				}
			}
			return true ;

		}
		return false ;
	}
	public static boolean validateEmail(String email, List<JobSeeker> jobList) {

		for(JobSeeker i : jobList) {
			if(i.getEmail().equals(email)) {
				return true ;
				
			}
		}
		return false;
	}

}
