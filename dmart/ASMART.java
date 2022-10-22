package com.cdac.dmart;

import java.util.Scanner;

import com.cdac.dmart.inventory.Inventory;

public class ASMART {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Inventory I = new Inventory();
		do {
			System.out.println("        \t\t--- WELCOME TO ASJ MART ---");
			System.out.println("Press\n 1. For Producer \n 2. For Show Inventory \n 3. For Consumer \n 4. bill");
			System.out.println("Enter the user type:");
			int userchoice = sc.nextInt();
			switch (userchoice) {
			case 1: {
				System.out.println("Enter the quantity of items");
				int n = sc.nextInt();
				I.additem(n);

				break;
			}

			case 2: {
				I.showInventory();
				break;
			}
			case 3: {
				I.consumerAddItems();
			break;
			}
			case 4:{
				I.billPrint();
			}
			case 5: {
				System.exit(0);
			}
			}

		} while (1 > 0);
	}

}
