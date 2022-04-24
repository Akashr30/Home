package com.atmMachine;

import java.util.Scanner;

import com.atm.constants.ATMConstants;
import com.atm.constants.Customer;

enum Currency {
	Rupees,Dollars,Ringets,Dinars;
}

public class ATMService {
	
	static Scanner sc = new Scanner(System.in); ;
	static int yesOrNO;
	private static Customer customer;
	
	private static Customer getSingleton() {
		
		if (customer == null) {
			return customer = new Customer();
		}
		
		return customer;
	}
	
	public static void beginTransaction(int option) {
		
		switch (option) {
		
			case 1 :
				System.out.println(ATMConstants.DEPOSIT_AMOUNT);
				double amount = Double.parseDouble(sc.nextLine());
				depositMoney(amount);
				System.out.println(ATMConstants.CHECK_BALANCE);
				System.out.println(ATMConstants.YES_OR_NO);
				yesOrNO =  Integer.parseInt(sc.nextLine());
				if (yesOrNO == 1) {
					System.out.println(checkBalance());
					System.out.println(ATMConstants.EXIT_MESSAGE);
					break;
				} else {
					System.out.println(ATMConstants.EXIT_MESSAGE);
					break;
				}
			
			case 2 :
				System.out.println(ATMConstants.WITHDRAW_AMOUNT);
				boolean flag = true;
				while (flag) {
					double withDrawAmt = Double.parseDouble(sc.next());
					System.out.println(withDrawAmount(withDrawAmt));
					System.out.println(ATMConstants.WITHDRAW_AGAIN);
					System.out.println(ATMConstants.YES_OR_NO);
					yesOrNO =  Integer.parseInt(sc.nextLine());
					if (yesOrNO == 0) {
						flag = false;
					}
				}
				System.out.println(ATMConstants.CHECK_BALANCE);
				System.out.println(ATMConstants.YES_OR_NO);
				yesOrNO =  Integer.parseInt(sc.nextLine());
				if (yesOrNO == 1) {
					System.out.println(checkBalance());
					System.out.println(ATMConstants.EXIT_MESSAGE);
					break;
				} else {
					System.out.println(ATMConstants.EXIT_MESSAGE);
					break;
				}
				
			case 3 :
				System.out.println(ATMConstants.CURRENT_BALANCE+checkBalance());
				break;
				
			case 4 :
				// enter beneficiary account number
				Long acctNo = Long.parseLong(sc.next());
				// enter beneficiary's bank name
				String beneficiaryBankName = sc.next();
				// enter transfer amount 
				double transferAmount = Double.parseDouble(sc.next());
				System.out.println(transferAmount(transferAmount,acctNo,beneficiaryBankName));
				
		}
	}
	
	public static String depositMoney(double amount) {
		
		Customer customer = getSingleton();
		if (amount < ATMConstants.DEFAULT_AMOUNT) {
			return ATMConstants.INVALID_AMOUNT;
		}
		double total = (double) customer.getAccountBalance() + amount;
		customer.setAccountBalance(total);
		return ATMConstants.DEPOSIT_SUCCESSFUL;
	}
	
	public static double checkBalance() {

		Customer customer = getSingleton();
		return customer.getAccountBalance();
	}
	
	public static String withDrawAmount(double withDrawAmt) {
		
		double currentAmount = checkBalance();
		if (currentAmount+ATMConstants.DEFAULT_AMOUNT < withDrawAmt) {
			return ATMConstants.LOW_BALANCE;
		}
		Customer customer = getSingleton();
		customer.setAccountBalance(currentAmount - withDrawAmt);
		
		return ATMConstants.COLLECT_CASH+withDrawAmt;
	}
	
	public static String transferAmount(double transferAmount , long beneficiaryAccNo , String beneficiaryBankName ) {
		
		double currentAmount = checkBalance();
		if (currentAmount+ATMConstants.DEFAULT_AMOUNT < transferAmount) {
			return ATMConstants.LOW_BALANCE;
		}
		Customer customer = getSingleton();
		customer.setAccountBalance(currentAmount - transferAmount);
		
		return ATMConstants.TRANSFER_SUCCESSFUL;
	}

}
