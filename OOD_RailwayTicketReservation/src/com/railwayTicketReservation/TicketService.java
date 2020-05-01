package com.railwayTicketReservation;

import com.railway.models.Compartment;
import com.railway.models.Customer;

public class TicketService {
	
	private Customer customer;
	private ComapartmentService compServ = new ComapartmentService();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	public void bookTickets() {
		
		Compartment cs = new Compartment(customer);
		if (getFreeSeatNumber().length > 0) {
			String str1 = getFreeSeatNumber()[0];
			String str2 = getFreeSeatNumber()[1];
			compServ.comp[Integer.parseInt(str1)][Integer.parseInt(str2)] = cs;
		}
	}
	
	public String[] getFreeSeatNumber() {
		
		
		for (int i = 0 ;i < compServ.comp[0].length ; i++) {
			for (int j = 0 ; j < compServ.comp[1].length ; j++) {
				if (compServ.comp[i][j] == null) {
//					int rowIdx = 5*i;
//					int seat = rowIdx+j+1;
					String seat = i+","+j;
					return seat.split(",");
				}
			}
		}
		
		return null;
	}
}
