package com.acts.business;

public class Address {
	private int flatNo ;
	private String area ;
	private String city ;
	private int pincode ;
	
	public Address(int flatNo,String area ,String city, int pincode) {
		this.flatNo = flatNo;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return "Flat no :"+this.flatNo+
				" "+this.area+" "+this.city+
				" "+this.pincode;
	}
	
	
}
