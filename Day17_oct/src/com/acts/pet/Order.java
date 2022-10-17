package com.acts.pet;

public class Order {
private static int orderId_Start =101 ;
private int orderId;
 private int petId;
 private int quantity;
 private String status;
public Order( int petId, int quantity, String status) {
	super();
	this.orderId = orderId_Start++;
	this.petId = petId;
	this.quantity = quantity;
	this.status = status;
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
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
}
 
 
}
