package com.railway.models;

public class Customer {
	
	private String customerName;
	private String trainNo;
	private String trainName;
	private String comapartmentName;
	private int seatNo;
	
	
	public Customer(String customerName, String trainNo, String trainName, String comapartmentName, int seatNo) {
		this.customerName = customerName;
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.comapartmentName = comapartmentName;
		this.seatNo = seatNo;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getComapartmentName() {
		return comapartmentName;
	}
	public void setComapartmentName(String comapartmentName) {
		this.comapartmentName = comapartmentName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	

}
