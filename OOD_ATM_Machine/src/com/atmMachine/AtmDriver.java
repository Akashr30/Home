package com.atmMachine;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

import com.ATMModels.Authenticate;
import com.atm.constants.Customer;

public class AtmDriver {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.out.println("Welcome to ABC Bank");
		Thread.sleep(1500);
		System.out.println("Please insert your ATM Card");
		// asks the user to type yes
		Thread.sleep(500);
		System.out.println("Enter the 4 Digit pin");
		int pin = 0100;
		Scanner sc = new Scanner(System.in);
		if (pin == new Authenticate().getAtmPinNumber()) {
			
			System.out.println("CHOOSE ANY ONE OF THE OPTIONS TO PROCEED FURTHER");			
			System.out.println("OPTION 1 : CASH DEPOSIT");
			System.out.println("OPTION 2 : WITHDRAW");
			System.out.println("OPTION 3 :CHECK BALANCE");
			System.out.println("OPTION 4 :TRANSFER CASH");
			System.out.println("OPTION 5 :EXIT");
			int option = Integer.parseInt(sc.nextLine());
//			sc.nextLine();
			ATMService atmService = new ATMService();
			atmService.beginTransaction(option);
		} else {
			System.out.println("Wrong Pin Number");
		}
		

		
		 
		System.out.println(new Customer().accountBalance);
		
	}

}
