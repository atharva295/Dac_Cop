package com.cdac.dmart.bill;

public class BillDetails {
	private String iteamName;
	private double itemAmount;
	private int quantity;
	double amount;
	
	public BillDetails() {
		
	}
	public BillDetails(String itemName,double itemAmount,int quantity,double amount) {
		this.iteamName=itemName;
		this.itemAmount=itemAmount;
		this.quantity=quantity;
		this.amount=amount;
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "BillDetails [iteamName=" + iteamName + ", itemAmount=" + itemAmount + ", quantity=" + quantity
				+ ", amount=" + amount + "]";
	}
	public String getIteamName() {
		return iteamName;
	}
	public void setIteamName(String iteamName) {
		this.iteamName = iteamName;
	}
	public double getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(double itemAmount) {
		this.itemAmount = itemAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
