package com.acts.acc;

import java.util.*;

import com.acts.acc.exception.NotFoundException;

public class AccountListTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> accList = new LinkedList<Account>();
		int choice = 0;
		do {
			System.out.println(
					" 1. Create Account \n 2. Display All Account Details \n 3. Find Account by Account Number \n 4. Apply intrest on all accounts ans show \n 0. Exit ");
			System.out.println("Enter yout Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				Account a = new Account();
				accList.add(a);
				System.out.println("Account created Successfully");
				System.out.println(a);
			}
				break;
			case 2: {

				System.out.println(accList.toString());

			}
				break;
			case 3: {
				boolean flag = false;

				System.out.println("Enter Account Number");
				int ac = sc.nextInt();
				try {
					for (Account i : accList) {
						if (i.getaccountno() == ac) {
							System.out.println(i.toString());
							flag = true;
							break;
						}
					}

					if (!flag) {
						throw new NotFoundException("Account not found.....");
					}
				} catch (NotFoundException e) {
					e.printStackTrace();
				}

			}
				break;
			case 4: {
				for (Account i : accList) {
					System.out.println(i.intrestcal());
				}
				System.out.println(accList);

			}
				break;
			case 5: {

			}
				break;
			}
		} while (choice != 0);
		sc.close();
	}

}
