package com.railway.models;

public class Train {
	
	private String trainNo;
	private String trainName;
	private final int Max_compartments = 10;
	
	
	
	public Train(String trainNo, String trainName) {
		this.trainNo = trainNo;
		this.trainName = trainName;
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
	public int getMax_compartments() {
		return Max_compartments;
	}
	
	

}
