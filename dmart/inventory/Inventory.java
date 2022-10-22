package com.cdac.dmart.inventory;

import java.util.Iterator;
import java.util.Scanner;

import com.cdac.dmart.bill.BillDetails;

public class Inventory {
	private String itemName;
	private int itemID;
	private double itemAmount;
	private int itemQuantity;
	Scanner sc = new Scanner(System.in);
	int n,count=0;
	Inventory iarr[];
	BillDetails bparr[] = new BillDetails[100];

	public Inventory() {
		this.itemName = "";
		this.itemID = 0;
		this.itemAmount = 0.0;
		this.itemQuantity = 0;
	}

	public Inventory(String itemName, int itemID, double itemAmount, int itemQuantity) {
		this.itemName = itemName;
		this.itemID = itemID;
		this.itemAmount = itemAmount;
		this.itemQuantity = itemQuantity;
	}

	public void additem(int quantity) {
		iarr = new Inventory[quantity];
		for (int i = 0; i < iarr.length; i++) {
			System.out.println("Enter the ITEM NAME:");
			String name = sc.next();
			System.out.println("Enter the item id");
			int id = sc.nextInt();
			System.out.println("Enter the Iitem Amount");
			double amount = sc.nextDouble();
			System.out.println("Enter the item Quantity");
			int quantity1 = sc.nextInt();
			iarr[i] = new Inventory(name, id, amount, quantity1);
			System.out.println(iarr[i].toString());
		}
	}

	public void showInventory() {
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i].toString());
		}
	}

	public void consumerAddItems() {
		double amount = 0.0;
		String choice = "";
		int itemID2 = 0, id = 0;
		do {
				System.out.println("Enter the Item ID");
				id = sc.nextInt();
				for (int j = 0; j < iarr.length; j++) {
					if (id == iarr[j].getItemID()) {
						System.out.println("Enter the Quantity of Item");
						int q = sc.nextInt();
						if (q <= iarr[j].getItemQuantity()) {

							iarr[j].setItemQuantity(iarr[j].getItemQuantity() - q);
							// amount = amount + (q * iarr[i].getItemAmount());
							
							bparr[j] = new BillDetails(iarr[j].getItemName(), iarr[j].getItemAmount(), q,
									(iarr[j].getItemAmount() * q));
								count++;
						} else {
							System.out.println("Item Quantity not available");
						}
						System.out.println("do you want to continue");
						choice = sc.next();
						if (choice.equalsIgnoreCase("Y")) {
							showInventory();
							consumerAddItems();
						}

					}
					
				}
				break;

			
		} while (choice.equalsIgnoreCase("Y"));

	}

	public void billPrint() {
		int totalBillAmount = 0;
		System.out.println("                           ---Bill Details");
		System.out.println("Item Name\t\tItem Amount\t\tItem Quantity\t\tTotal Amount");
		for (int j = 0; j <count; j++) {
			//System.err.println(bparr.length);
			System.out.println(bparr[j].getIteamName() + "\t\t\t" + bparr[j].getItemAmount() + "\t\t\t" + bparr[j].getQuantity()
					+ "\t\t\t" + bparr[j].getAmount());
			totalBillAmount+=bparr[j].getAmount();
			}
		System.out.println("\nTotal Bill Amount = \t\t\t\t\t\t\t" + totalBillAmount);
		
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public double getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(double itemAmount) {
		this.itemAmount = itemAmount;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Override
	public String toString() {
		return "Inventory [itemName=" + itemName + ", itemID=" + itemID + ", itemAmount=" + itemAmount
				+ ", itemQuantity=" + itemQuantity + "]";
	}

}
