package com.acts.pet;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private static int orderId_Start =101 ;
	private int orderId;
	private int petId;
	private int quantity;
	private Status status ;

	static List<Order> olist = new ArrayList<>();
	public Order( int petId, int quantity) {
		super();
		this.orderId = orderId_Start++;
		this.petId = petId;
		this.quantity = quantity;
		this.status=Status.placed;
	}
	public int getOrderId() {
		return orderId;
	}

	public int getPetId() {
		return petId;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public static Status checkStatus(int id){
		for(Order o: olist) {
			if(o.orderId == id) {
				return o.status ;
			}
		}
		
		return null ; 
	}
public static boolean updateStatus(int oid, Status s) {
		
	for(Order o: olist) {
		if(o.orderId == oid) {
			o.status = s ;
			return true ; 
		}
	}
	return false;
	}
	
	public int getAmount(Order o) {
		int Amount =0 ;
		Pet p = Pet.findByID(o.petId);
		Amount = o.quantity * p.getUnitprice();
		return Amount  ;
	}
	
	@Override
	public String toString() {
		return "Order \n orderId=" + orderId 
				+ "\n petId=" + petId 
				+ "\n quantity=" + quantity 
				+ " \n status=" + status 
				+ "\n Amount =" + this.getAmount(this) 
				+"]";
				
	}


}
