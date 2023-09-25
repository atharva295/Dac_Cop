package com.acts.accountTester;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.acts.exception.AccountNotFound;

import com.acts.account.Account;
import com.acts.account.Address;
import com.acts.account.Datautils;
import com.acts.account.Type;
import com.acts.exception.MinBalanceException;

public class AccountTester {

	public static void main(String[] args) throws AccountNotFound, MinBalanceException {
		List<Account> accLinkList = Datautils.getAccountList();
		Scanner scan = new Scanner(System.in);
		// System.out.println(accLinkList);
		int choice = 0;

		do {
			System.out.println("1 Create Account");
			System.out.println("2 Display all Accounts ");
			System.out.println("3 Search Account");
			System.out.println("4 Transfer money from one account to another");
			System.out.println("5 Remove account ");
			System.out.println("6 Apply interest on all saving Account");
			System.out.println("7 Sort accounts by  Account number");
			System.out.println("8 Sort by accountOpeningDate");
			System.out.println("9 Sort by Balance");
			choice = scan.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter the account no");
				Integer accNo = scan.nextInt();
				System.out.println("Enter the account holder name");
				String accName = scan.next();
				System.out.println("Enter the account type(SAVING,CURRENT,OVERDRAFT)");
				Type accType = Type.valueOf(scan.next());
				System.out.println("Please enter Account Opening Date in yyyy-mm-dd format");
				String accOpeningDate = scan.next();
				System.out.println("Enter the account balacne");
				double accBalance = scan.nextDouble();
				System.out.println("Enter the city");
				String city = scan.next();
				System.out.println("Enter the state");
				String state = scan.next();
				System.out.println("Enter the pincode");
				int pincode = scan.nextInt();
				Address address = new Address(city, state, pincode);

				Account account = new Account(accNo, accName, accType, accOpeningDate, accBalance, address);
				accLinkList.add(account);
				System.out.println("Account details added succesfully");

				break;

			case 2:
				for (Account acnts : accLinkList) {
					System.out.println(acnts);
				}
				break;

			case 3:
				System.out.println("Enter the account number");
				int searchAccount = scan.nextInt();
				boolean flag = false;

				try {

					for (Integer i = 0; i < accLinkList.size(); i++) {
						if (searchAccount == accLinkList.get(i).getAccNo()) {
							System.out.println(accLinkList.get(i));
							flag = true;
						}
					}
					if (!flag) {
						throw new AccountNotFound("account not found");
					}
				} catch (AccountNotFound ab) {
					System.out.println(ab.getMessage());

				}

				break;

			case 4:
				System.out.println("Enter the account Number");
				int account1 = scan.nextInt();
				System.out.println("Enter the account Number in which you want to transfer money");
				int account2 = scan.nextInt();
				System.out.println("Enter the amount you want to transfer");
				double amount = scan.nextDouble();

				for (int i = 0; i < accLinkList.size(); i++) {

					if (account1 == accLinkList.get(i).getAccNo()) {

						for (int j = 0; j < accLinkList.size(); j++) {

							if (account2 == accLinkList.get(j).getAccNo()) {

								try {
									if (accLinkList.get(i).getAccBalance() > amount) {
										accLinkList.get(i).setAccBalance(accLinkList.get(i).getAccBalance() - amount);
										accLinkList.get(j).setAccBalance(accLinkList.get(j).getAccBalance() + amount);
									} else {
										//MinBalanceException minBalanceException = new MinBalanceException("Insufficient Funds");
										throw new MinBalanceException("Insufficient Funds");

									}
								} catch (MinBalanceException minBalanceException) {
									System.err.println(minBalanceException.getMessage());
								}

								System.out.println("Printing the updated account balance");
								System.err.println("Account No : " + accLinkList.get(i).getAccNo() + " "+ accLinkList.get(i).getAccBalance());
								System.err.println("Account No : " + accLinkList.get(j).getAccNo() + " "+ accLinkList.get(j).getAccBalance());
										
							}
						}
					}

				}
				
				break;

			case 5:
				System.out.println("Enter the Account number you want to remove from list");
				int accno = scan.nextInt();
				for (Account i :accLinkList) {
					if (accno == i.getAccNo()) {
						accLinkList.remove(i);
						System.out.println("Account Removed");
					}
				}
				System.out.println(accLinkList);
				break;
			case 7:
				Comparator<Account> accountComparator = new Comparator<Account>() {

					@Override
					public int compare(Account o1, Account o2) {

						return o1.getAccNo().compareTo(o2.getAccNo());
					}
				};
				Collections.sort(accLinkList, accountComparator);
				for (Account acnts : accLinkList) {
					System.out.println(acnts);
				}

				break;

			case 8:
				//Comparator<Account> accountOpeningDate = new Comparator<Account>() {

//					@Override
//					public int compare(Account o1, Account o2) {
//
//						return o1.getAccOpeningDate().compareTo(o2.getAccOpeningDate());
//					}
	//			};
	//			Collections.sort(accLinkList, accountOpeningDate);
//				for (Account acnts : accLinkList) {
//					System.out.println(acnts);
//				}
	//			Comparator<Account> accountOpeningDate =(a,b) -> a.getAccOpeningDate().compareTo(b.getAccOpeningDate());
				Collections.sort(accLinkList,(a,b) -> a.getAccOpeningDate().compareTo(b.getAccOpeningDate()));
				for(Account b :accLinkList) {
					System.out.println(b);
				}
				
				

				break;
			case 9:
//				Comparator<Account> accountBalance = new Comparator<Account>() {
//
//					@Override
//					public int compare(Account o1, Account o2) {
//
//						return o1.getAccBalance().compareTo(o2.getAccBalance());
//					}
//				};
//				Collections.sort(accLinkList, accountBalance);
				
				Collections.sort(accLinkList,(a,b) -> a.getAccBalance().compareTo(b.getAccBalance()));
				break;

			}

		} while (choice != 0);
		scan.close();
	}

}
