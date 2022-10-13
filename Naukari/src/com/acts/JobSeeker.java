package com.acts;
import java.util.*;
public class JobSeeker {
	private int registrationID ;
	private String name ;
	private String email ;
	private int adharNO ;
	private String phoneno  ;
	private int DOB ;
	private int GradDate ;
	//PARA CONSTRUCTOR
	public JobSeeker(int registrationID, String name, String email, int adharNO, String phoneno, int dOB,
			int gradDate) {
		super();
		this.registrationID = registrationID;
		this.name = name;
		this.email = email;
		this.adharNO = adharNO;
		this.phoneno = phoneno;
		DOB = dOB;
		GradDate = gradDate;
	}
	//default CONSTRUCTOR
	public JobSeeker() {
		super();
	}
	
	// getters setters 
	public int getRegistrationID() {
		return registrationID;
	}
	public void setRegistrationID(int registrationID) {
		this.registrationID = registrationID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAdharNO() {
		return adharNO;
	}
	public void setAdharNO(int adharNO) {
		this.adharNO = adharNO;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public int getGradDate() {
		return GradDate;
	}
	public void setGradDate(int gradDate) {
		GradDate = gradDate;
	}
	
	
}
