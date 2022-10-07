package com.acts.bankatm;

import java.util.*;

public class ATMMenuDriven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		Atm[] a = new Atm[10] ;
		int cardNo = 80400;
		int curr =5 ;
		for(int i=0;i<5 ; i++) {
			
			a[i].setCardNo(cardNo);
			System.out.println("Your card number is"+cardNo++) ;
			System.out.println("Enter pin you want to set ") ;
			a[i].setPin(sc.nextInt()); 
			System.out.println("Enter amount to be deposited") ;
			a[i].setCurrentBal(sc.nextInt());
			System.out.println("Your Account is Created") ;
		}
		int choice =0 ;
		do{
			System.out.println("Enter user cardno and pin");
			int c = sc.nextInt() ;
			int p = sc.nextInt() ;
			int flag =0 ;
			for(int i=0 ; i<5 ; i++) {
				if(a[i].getCardNo()==c && a[i].getPin()==p) {
					flag=1 ;
					System.out.println("Welcome");
					System.out.println("Choose from the below given options");
					System.out.println(" 1. Check Balance");
					System.out.println(" 2. Withdrawl Amount");
					System.out.println(" 3. Credit Amount");
					System.out.println(" 4. Update your details");
					System.out.println("0. Exit");
					
					
					
				}
			}
			if(flag==0) {
				System.out.println("Enter valid details");
			}
		}while(choice!=0) ;


	}

}

