package com.call_taxi2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

class User {
	
	private String userId;
	private String userName;
	private String password;
	
	public User(String userName, String password) {
		this.userId = userName+UUID.randomUUID().toString();
		this.userName = userName;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}


class Taxi {
	
	private String taxiId;
	private boolean isAvailable;
	private String startPoint;
	private String endPoint;
	private int cost;
	private String time;
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Taxi() {
		this.taxiId = "Taxi@"+UUID.randomUUID().toString();
		isAvailable = true;
	}
	
	public String getTaxiId() {
		return taxiId;
	}
	public void setTaxiId(String taxiId) {
		this.taxiId = taxiId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
}

class Rides {
	
	private User user;
	private Taxi taxi;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Taxi getTaxi() {
		return taxi;
	}
	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}
	
}

public class Driver {
	
	static Scanner sc = new Scanner(System.in);
	static HashMap<String,User> users = new HashMap<>();
	static HashMap<User,List<Taxi>> rides = new HashMap<>();
	static User currentUser = null;
	static Taxi[] taxis = null;
	
	public static void main(String[] args) {
		// System.out.prinln()
		System.out.println("Welcome to QuickRides");
		System.out.println("Already a user ? ");
		int num = Integer.parseInt(sc.next());
		boolean flag = true;
		while (flag) {
			
			switch (num) {
			case 1 : 
				flag = false;
				break;
			case 0 :
				createAccount();
				flag = false;
				break;
			 default :
				System.out.println("Enter valid Option");
			
			}	
		}
		taxis = new Taxi[4];
		for (int i = 0 ; i < taxis.length ; i++) {
			taxis[i] = new Taxi();
		}
		System.out.println("Hello : "+currentUser.getUserName());
		System.out.println("Wanna ride ?");
//		System.out.println("1.Book Taxi");
//		System.out.println("2.Booking history");
//		System.out.println("3.Exit");
		boolean bookingFlag = true;
		while (bookingFlag) {
			System.out.println("1.Book Taxi");
			System.out.println("2.Booking history");
			System.out.println("3.Exit");
			
			int option = Integer.parseInt(sc.next());
			
			switch(option) {
			case 1:
				book();
				break;
			case 2 : 
				printHistory();
				break;
			case 3 : 
				bookingFlag = false;
				System.out.println("See you Again");
				break;
			}
		}
	}
	
	
	public static void createAccount() {
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter password : ");
		String password = sc.next();
		users.put(name, new User(name,password));
		currentUser = users.get(name);
	}
	
	public static void book() {
		
		System.out.println("Checking availabity");
		Taxi obj = checkTaxis();
		if (obj == null ) {
			System.out.println("No Taxis available for this moment.... try after sometime");
			return;
		} else {
			System.out.println("Taxi found");
			System.out.println("Taxi details are "+obj.getTaxiId());
			System.out.println("Enter the Time for pick up");
			String time = sc.next();
			obj.setTime(time);
			System.out.println("Enter the start point and end point between [A-Z]");
			String start  = sc.next().toLowerCase();
			System.out.println("Enter Destination point : ");
			String end = sc.next().toLowerCase();
			obj.setStartPoint(start);
			obj.setEndPoint(end);
			obj.setAvailable(false);
			int cost = calculateRideCharges( start , end);
			obj.setCost(cost);
			if (rides.containsKey(currentUser)) {
				List<Taxi> temp = rides.get(currentUser);
				temp.add(obj);
				rides.put(currentUser, temp);
			} else {
				rides.put(currentUser, new ArrayList<>());
				List<Taxi> temp = rides.get(currentUser);
				temp.add(obj);
				rides.put(currentUser, temp);
			}
			
			System.out.print("Your ride will be available at "+time);
			System.out.println("Total ride cost :"+cost );
		}
	}
	
	
	public static Taxi checkTaxis() {
		
		for (int i = 0 ; i < taxis.length ; i++) {
			if (taxis[i].isAvailable())
				return taxis[i];
		}
		return null;
	}
	
	public static int calculateRideCharges(String start,String end) {
		char st = start.charAt(0);
		char en = end.charAt(0);
		int diff = Math.abs(st-en);
		return diff <= 5 ? diff*5 : diff*diff;
	}
	
	
	public static void printHistory() {
		
		List<Taxi> res = rides.get(currentUser);
			
			System.out.println(currentUser.getUserId()+" "+currentUser.getUserName());
			System.out.println("History of Rides Are : ");
			System.out.println("Taxi Id"+"      "+"Time"+"      "+"Start Point"+"      "+"Destination"+"      "+"TotalCost");
			if (res == null || res.size() == 0) {
				System.out.println("No Records");
				System.out.format("%-13s","No Records To Show");
				System.out.println();
			} else {
				for (Taxi val : res) {
	//				System.out.println(val.getTaxiId()+"      "+val.getTime()+"      "+val.getStartPoint()+"      "+val.getEndPoint()+"      "+val.getCost());
					System.out.format("%-13d%-15d",val.getTaxiId(),val.getTime(),val.getStartPoint(),val.getEndPoint(),val.getCost());
					System.out.println();
				}
			}
	}
	
}
