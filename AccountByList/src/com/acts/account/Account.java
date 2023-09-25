package com.acts.account;

public class Account {
	private Integer accNo;
	private String name;
	private Type accType;
	private String accOpeningDate;
	private Double accBalance;
	private Address address;
	
	public final double rate = 2.75;
	
	public Account(Integer accNo, String name, Type accType, String accOpeningDate, Double accBalance,
			Address address) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.accType = accType;
		this.accOpeningDate = accOpeningDate;
		this.accBalance = accBalance;
		this.address = address;
		
	}
	
	public double Intrest() {
		double byaj = this.accBalance*(rate/100);
		return byaj;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getAccType() {
		return accType;
	}

	public void setAccType(Type accType) {
		this.accType = accType;
	}

	public String getAccOpeningDate() {
		return accOpeningDate;
	}

	public void setAccOpeningDate(String accOpeningDate) {
		this.accOpeningDate = accOpeningDate;
	}

	public Double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(Double accBalance) {
		this.accBalance = accBalance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public  String AccountFound(int a) {
		if(a==this.getAccNo());
		
		return "accOpeningDate";
		
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accType=" + accType + ", accOpeningDate="
				+ accOpeningDate + ", accBalance=" + accBalance + "[INTREST@2.75/monthly ="+Intrest()+", address=" + address + "]\n";
	}

	
}
