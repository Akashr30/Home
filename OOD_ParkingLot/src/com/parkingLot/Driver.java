package com.parkingLot;

import java.util.List;
import java.util.Scanner;

import com.vehicle.models.Bikes;

enum Vehicles{
	Bike,Car,MiniTruck,Trailer;
}


public class Driver {
	
	public static void main(String[] ar) {
		
		Scanner sc = new Scanner(System.in);
		
		int noOfVehicles = Integer.parseInt(sc.nextLine());
		int count = 0;
		ParkingService parkingService = new ParkingService();
		while (count < noOfVehicles) {
			String typeOfVehicle = sc.nextLine();
			if (typeOfVehicle.equals(Vehicles.Bike.toString())) {
				String bikeNo = sc.nextLine();
				String bikeModel = sc.nextLine();
				Bikes bike = new Bikes(bikeNo,bikeModel);
				Object obj = bike;
				System.out.println(parkingService.park(obj));
			}
			count++;
		}
		
		List<ParkingLot> details = parkingService.getAllVehicleDetails();
		for (int i = 0 ; i < details.size() ; i++) {
			System.out.println(details.get(i).getBike().getBikeNo()+"......."+details.get(i).getBike().getModelName());
		}
	}

}
