package com.acts;
import java.util.Scanner;

import com.acts.derivedclass.*;
import com.acts.operations.*;

public class BankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Bank b = new SBIBank();
		int option =0 ;
		
		do {
			System.out.println("Which bank Rate of intrest you want to know? \n 1. SBI Bank \n 2. ICICI Bank \n 0. Exit ");
			option = sc.nextInt() ;
			if(option==0)
				break ;
			if(option==1) {
				int c = b.rateOfInterest();
				System.out.println(c);
			}else if(option==2){
				b = new ICICIBank();
				System.out.println(b.rateOfInterest());
			}else {
				System.out.println("You have Enterd wrong choice please try again");
			}
		}while(option!=0) ;

	}









}
