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
					  " 1. Create Account \n"
					+ " 2. Display All Account Details \n"
					+ " 3. Find Account by Account Number \n "
					+ " 4. Apply intrest on all accounts ans show \n"
					+ " 5. Remove account"
					+ " 6. Arrange accounts in accesnding order"
					+ " 7. sort by balance "
					+ " 0. Exit ");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Account Name");
				String accountName = sc.next() ;
				System.out.println("Enter Account Number");
				Integer accountNo = sc.nextInt() ; 
				System.out.println("Enter initial Amount to be deposited");
			    Double balance = sc.nextDouble();
				Account a = new Account(accountNo,accountName,balance);
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
					System.out.println(e.getMessage());
					//e.printStackTrace();
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
				System.out.println("Enter Account Number you want to delete");
				int ac = sc.nextInt();
				boolean flag = false;
				for (Account i : accList) {
					if (i.getaccountno() == ac) {
						accList.remove(i) ;
						flag = true;
						break;
					}
				}
				if (!flag) {
					 System.out.println("Account not found.....");
				}
			}
				break;
			case 6: {
				Comparator<Account>compareac = new Comparator<Account>() {
					
					@Override
					public int compare(Account o1, Account o2) {
						
						return o1.getaccountno().compareTo(o2.getaccountno());
					}
				};
				Collections.sort(accList, compareac);
			}
				break;
			case 7: {
				Comparator<Account>comparebal = new Comparator<Account>() {
					
					@Override
					public int compare(Account o1, Account o2) {
						
						return o1.getBalance().compareTo(o2.getBalance());
					}
				};
				Collections.sort(accList, comparebal);
			}
				break;
				
			}
		} while (choice != 0);
		sc.close();
	}

}
