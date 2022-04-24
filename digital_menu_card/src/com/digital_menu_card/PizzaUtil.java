package com.digital_menu_card;

import java.util.HashSet;

import com.digital_menu_card_ingredients.IngredientsBuilder;

public class PizzaUtil {
	
	public static void getPizzaOPtions() {
		System.out.println("------- Select the Pizza Option -------");
		System.out.println("1.Veg Pizzas"); 
		System.out.println("2.Non Veg Pizzas");
	}
	
	public static void displayBreads() {
		System.out.println("------- Select the Bread Option -------");
		System.out.println("1.Thick Crust"); 
		System.out.println("2.Thin Crust");
		System.out.println("3.Hand Toasted");
	}
	
	public static String getBread(int val) {
		
		switch (val) {
			case 1:
				return "THICK CRUST";
			case 2 : 
				return "THIN CRUST";
			case 3 : 
				return "HAND TOASTED";
		}
		return "";
	}
	
	public static String getCheese(int val) {
		
		switch (val) {
			case 1:
				return "NORMAL";
			case 2 : 
				return "EXTRA CHEESE";
			case 3 : 
				return "CHEESE BURST";
		}
		return "";
	}
	
public static String getPizzaSize(int val) {
		
		switch (val) {
			case 1:
				return "REGULAR";
			case 2 : 
				return "MEDIUM";
			case 3 : 
				return "LARGE";
		}
		return "";
	}
	
	public static void displayCheeses() {
		System.out.println("------- Select the Cheese Option -------");
		System.out.println("1.Normal"); 
		System.out.println("2.Extra Cheese");
		System.out.println("3.Cheese Burst");
	}
	
	public static void displayPizzaSizes() {
		System.out.println("------- Select the Cheese Option -------");
		System.out.println("1.Regular"); 
		System.out.println("2.Medium");
		System.out.println("3.Large");
	}
	
	public static void loadAvailablePizzasOnline(HashSet<Integer> pizzaOptions) {
		pizzaOptions.add(1);
		pizzaOptions.add(2);
	}
	
	public static void loadAvailableBreadsOnline(HashSet<Integer> breadOptions) {
		breadOptions.add(1);
		breadOptions.add(2);
		breadOptions.add(3);
	}
	
	public static void loadAvailableCheeseOnline(HashSet<Integer> cheeseOptions) {
		cheeseOptions.add(1);
		cheeseOptions.add(2);
		cheeseOptions.add(3);
	}

	public static void loadAvailablePizzaSizesOnline(HashSet<Integer> pizzaSize) {
		pizzaSize.add(1);
		pizzaSize.add(2);
		pizzaSize.add(3);
	}
	
	public static void setMaxIngredientsSize(String val,Integer size) {
		
		if (val.equalsIgnoreCase("regular")) {
			size = 3;
		} else if (val.equalsIgnoreCase("medium")) {
			size = 7;
		} else if (val.equalsIgnoreCase("large")) {
			size = 9;
		}
	}
	
	public static void getVegIngredients() {
		System.out.println("------- Select the Veggies Option -------");
		System.out.println("1.Onions"); 
		System.out.println("2.Tomatoes");
		System.out.println("3.jalapenos");
		System.out.println("4.capsicums");
		System.out.println("5.mushrooms");
		System.out.println("6.panner");
	}
	
	public static void setIngreds(int num , IngredientsBuilder ingreds) {
		
		switch(num) {
			
			case 1 : 
				ingreds.getVeggies().setOnions(true);
				break;
			case 2 : 
				ingreds.getVeggies().setTomatoes(true);
				break;
			case 3 :
				ingreds.getVeggies().setJalapenos(true);
				break;
			case 4 :
				ingreds.getVeggies().setCapsicums(true);
				break;
			case 5 :
				ingreds.getVeggies().setMushrooms(true);
				break;
		}
		
	}

}
