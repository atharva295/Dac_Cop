package com.acts;
import java.time.LocalDate;

import java.util.*;
public class JobSeeker {
	private static int registrationID_Start = 101 ;
	private int registrationID ;
	private String name ;
	private String email ;
	private int adharNO ;
	private String phoneno  ;
	private LocalDate DOB ;
	private LocalDate GradDate ;
	private int  password;
	private Degree degree ;

	
	//PARA CONSTRUCTOR
	public JobSeeker( String name, String email, int adharNO, String phoneno, LocalDate dOB, int password,
			LocalDate gradDate) {
		super();
		this.registrationID = registrationID_Start++;
		this.name = name;
		this.email = email;
		this.adharNO = adharNO;
		this.phoneno = phoneno;
		this.DOB = dOB;
		this.GradDate = gradDate;
		this.password = password ;
	}
	@Override
	public String toString() {
		return "registrationID=" + registrationID 
				+ " name=" + name 
				+ " email=" + email 
				+ " adharNO="+ adharNO 
				+ " phoneno=" + phoneno 
				+ " DOB=" + DOB 
				+ " GradDate=" + GradDate ;
	}
	//default CONSTRUCTOR
	public JobSeeker() {
		super();
	}

	// getters setters 
	public int getRegistrationID() {
		return registrationID;
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
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		this.DOB = dOB;
	}
	public LocalDate getGradDate() {
		return GradDate;
	}
	public void setGradDate(LocalDate gradDate) {
		GradDate = gradDate;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public JobSeeker findByID(int id, List<JobSeeker> ll) {
		
		return null ;
	}


}
