package com.acts.bankatm;
import java.util.*;


public class Atm {
	int cardNo  ;
	int pin ;
	int currentBal ;
	public Atm() {
		System.out.println();
		System.out.println("Enter pin you want to set ");
	}
	protected int getCardNo() {
		return cardNo;
	}
	protected void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	protected int getPin() {
		return pin;
	}
	protected void setPin(int pin) {
		this.pin = pin;
	}
	protected int getCurrentBal() {
		return currentBal;
	}
	protected void setCurrentBal(int currentBal) {
		this.currentBal = currentBal;
	}

}
