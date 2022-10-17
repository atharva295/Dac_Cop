package com.acts.pet;

public class Pet {
	private int petId;
	private String name;
	private Category category;
	private int unitprice ;
	private int stock;
	
	public Pet(int petId, String name, Category category, int unitprice, int stock) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitprice = unitprice;
		this.stock = stock;
	}
	

}
