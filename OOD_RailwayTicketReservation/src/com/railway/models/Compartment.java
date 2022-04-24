package com.railway.models;

public class Compartment extends Train {

	private String compartmentName;
	private int seatNo;
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Compartment(Customer customer) {
		super(customer.getTrainNo(),customer.getTrainName());
		this.compartmentName = customer.getComapartmentName();
		this.seatNo = customer.getSeatNo();
		this.customer = customer;
	}
	public String getCompartmentName() {
		return compartmentName;
	}
	public void setCompartmentName(String compartmentName) {
		this.compartmentName = compartmentName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	
}
