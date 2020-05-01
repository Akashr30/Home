package com.vehicle.models;

import java.util.UUID;

public class Bikes {
	
	private String bikeNo;
	private String modelName;
	
	public Bikes(String bikeNum , String bikeName) {
		bikeNo = bikeNum;
		modelName = bikeName;
	}
	
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
}
