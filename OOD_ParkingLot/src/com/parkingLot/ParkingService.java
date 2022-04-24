package com.parkingLot;

import java.util.ArrayList;
import java.util.List;

import com.vehicle.models.Bikes;
import com.vehicle.models.Cars;

public class ParkingService {
	
	private Bikes bike;
	private Cars cars;
	ArrayList<ParkingLot> ar = new ArrayList<>();
	private static ParkingLot parkingLot = null ;
	
	public Bikes getBike() {
		return bike;
	}
	public void setBike(Bikes bike) {
		this.bike = bike;
	}
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	
	public ParkingService () {}
	
	public ParkingLot getSingleton() {
		
		if (parkingLot == null) {
			return parkingLot = new ParkingLot();
		}
		
		return parkingLot;
	}
		
	
	public String park(Object obj) {
		
		Bikes bike = (Bikes)obj;
		ParkingLot pl = new ParkingLot();
		pl.setBike(bike);
		if(getFreeSpot() != -1) {
			ar.add(pl);
			return "Vehicle parked successfully in the location "+pl;
		} else {
			return "No empty space found.Please come after sometime";
		}
	}
	
	public int getFreeSpot() {
		
		if (ar.size() < 10) {
			return 1;
		}
		
		return -1;
	}
	
	public List<ParkingLot> getAllVehicleDetails() {
		
		List<ParkingLot> plx = new ArrayList<>();
		for (int z = 0 ; z < ar.size() ; z++) 
		plx.add(ar.get(z));
		
		return plx;
	}

}
