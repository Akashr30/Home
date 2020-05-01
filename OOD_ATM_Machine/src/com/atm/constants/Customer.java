package com.atm.constants;

import java.text.DecimalFormat;
import java.util.Random;

public class Customer {
	
	final String userName = "Akash.R";
	public int atmPinNumber = 0100;
	final String accountNumber = "5468416516196";
	private String phoneNumber = "9566297843";
	public double accountBalance = getAmount();
	
		private double getAmount() {
			boolean flag = true;
			double value = 0;
			if (flag) {
				Random random = new Random(System.currentTimeMillis());
				 value  = random.nextDouble()*100000;
				flag = false;
			}
				DecimalFormat df = new DecimalFormat("0.00");
			 	return Double.valueOf(df.format(value));
		}

		public int getAtmPinNumber() {
			return atmPinNumber;
		}

		public void setAtmPinNumber(int atmPinNumber) {
			this.atmPinNumber = atmPinNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public double getAccountBalance() {
			return accountBalance;
		}

		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}

		public String getUserName() {
			return userName;
		}

		public String getAccountNumber() {
			return accountNumber;
		}
		
		
}
