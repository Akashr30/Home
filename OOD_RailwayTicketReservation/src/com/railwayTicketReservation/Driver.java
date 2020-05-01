package com.railwayTicketReservation;

import java.util.Scanner;

import com.railway.models.Customer;

public class Driver {
	
	public static void main(String[] ar) {
		
		Scanner sc = new Scanner(System.in);
		TicketService ticketService = new TicketService();
//		int count = Integer.parseInt(sc.nextLine());
		int count = 0;
		while (count < 2) {
			Customer customer = new Customer("Abc"+count,"1001","xyz"+count,"s1",10+count);
			ticketService.setCustomer(customer);
			ticketService.bookTickets();
			count++;
		}
	}

}
