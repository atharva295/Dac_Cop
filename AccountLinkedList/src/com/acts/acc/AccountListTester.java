package com.acts.acc;
import java.util.*;
public class AccountListTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		List<Account> accList = new LinkedList<Account>() ;
		int choice =0  ;
		do {
			System.out.println("1. Create Account \n 2. Display All Account Details \n 3. Find Account by Account Number \n 0. Exit " );
			System.out.println("Enter yout Choice");
			choice = sc.nextInt() ;
			switch(choice) {
			case 1: {
				Account a = new Account() ;
				accList.add(a) ;
				System.out.println("Account created Successfully");
				System.out.println(a);
			}break ;
			case 2: {
				for(Account i:accList) {
					System.out.println(accList.toString());
				}
					
			}break ;
			case 3: {
				
				System.out.println("Enter Account Number");
				int ac = sc.nextInt() ;
				for(Account i:accList) {
					if(i.getaccountno() == ac) {
						System.out.println(i.toString()); 
						break ;
					}
				}

			}break ;
			}
		}while(choice!=0) ;
	}

}
