package com.ATMModels;

import com.atm.constants.Customer;

public class Authenticate {
	
	private int atmPinNumber;
	private String userName;
	
	public Authenticate() {
		Customer ah = new Customer();
		this.setAtmPinNumber(ah.atmPinNumber);
	}
	
	public int getAtmPinNumber() {
		return atmPinNumber;
	}
	public void setAtmPinNumber(int atmPinNumber) {
		this.atmPinNumber = atmPinNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
