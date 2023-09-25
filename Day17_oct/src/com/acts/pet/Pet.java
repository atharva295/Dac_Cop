package com.acts.pet;

import java.util.LinkedList;
import java.util.List;

public class Pet {
	private int petId;
	private String name;
	private Category category;
	private int unitprice ;
	private int stock;
	static List<Pet> plist =new LinkedList<>() ;
	public Pet(int petId, String name, Category category, int unitprice, int stock) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitprice = unitprice;
		this.stock = stock;
	}
	public static Pet findByID(int pid) {
		//		for(int i=0;i<plist.size();i++) {
		//			if(plist.get(i).petId==pid) {
		//				return plist.get(i) ;
		//			}
		for(Pet p: plist)
		{
			if(p.petId==pid) {
				return p;
			}

		}

		return null ;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public static List<Pet> getPlist() {
		return plist;
	}
	public static void setPlist(List<Pet> plist) {
		Pet.plist = plist;
	}
	@Override
	public String toString() {
		return "petId=" + petId + 
				"/n name=" + name + 
				"/n category=" + category + 
				"/n unitprice=" + unitprice
				+ "/n stock=" + stock+"/n";
	}


}
