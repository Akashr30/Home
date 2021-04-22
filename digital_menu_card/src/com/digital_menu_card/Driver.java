package com.digital_menu_card;

import java.util.HashSet;
import java.util.Scanner;

import com.digital_menu_card_ingredients.Bread;
import com.digital_menu_card_ingredients.Cheeses;
import com.digital_menu_card_ingredients.IngredientsBuilder;
import com.digital_menu_card_pizzas.Pizza;

public class Driver {
	
	public static void addIngredients(Integer totalIngredientsAdded,
			Integer maxSizeForIngredients,
			IngredientsBuilder ingreds) {
		PizzaUtil.getVegIngredients();
		for (int i = 0 ; i < maxSizeForIngredients ; i++) {
			int val = Integer.parseInt(sc.next());
			PizzaUtil.setIngreds(val, ingreds);
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	static HashSet<Integer> pizzaOptions;
	static HashSet<Integer> breadOptions;
	static HashSet<Integer> cheeseOptions;
	static HashSet<Integer> pizzaSize;
	static Pizza pizza;
	static Integer maxSizeForIngredients = 0;
	static Integer totalIngredientsAdded = 0;
	public static void main(String[] args) {
		
		pizzaOptions = new HashSet<>();
		PizzaUtil.loadAvailablePizzasOnline(pizzaOptions);
		PizzaUtil.loadAvailableBreadsOnline(breadOptions);
		PizzaUtil.loadAvailableCheeseOnline(cheeseOptions);
		PizzaUtil.loadAvailablePizzaSizesOnline(pizzaSize);
		System.out.println("------- Welcome to ThePizzaShop -------");
		while (true) {
			PizzaUtil.getPizzaOPtions();
			int option = Integer.parseInt(sc.next());
			String size = "";
			if (pizzaOptions.contains(option)) {
				while (true) {
					PizzaUtil.displayPizzaSizes();
					int val = Integer.parseInt(sc.next());
					if (pizzaSize.contains(val)) {
						size = PizzaUtil.getPizzaSize(val);
						PizzaUtil.setMaxIngredientsSize(size, maxSizeForIngredients);
						break;
					}
				}
				pizza = PizzaBuilder.getPizza(option,size);
				break;
			}
			System.out.println("------- option Not present in the list -------");
		}
		IngredientsBuilder ingreds = new IngredientsBuilder();
		System.out.println("------- Select the type of Bread -------");
		while (true) {
			PizzaUtil.displayBreads();
			int option = Integer.parseInt(sc.next());
			if (breadOptions.contains(option)) {
				String breadName = PizzaUtil.getBread(option);
				ingreds.setBread(new Bread(breadName));
				break;
			}
			System.out.println("------- option Not present in the list -------");
		}
		System.out.println("------- Select the type of Cheese -------");
		while (true) {
			PizzaUtil.displayCheeses();
			int option = Integer.parseInt(sc.next());
			if (cheeseOptions.contains(option)) {
				String cheeseType = PizzaUtil.getCheese(option);
				ingreds.setCheese(new Cheeses(cheeseType));
			}else {
				System.out.println("------- option Not present in the list -------");
				break;
			}
		}
		addIngredients(totalIngredientsAdded,maxSizeForIngredients,ingreds);
		while (true) {
//			modifyVeggies();
			
		}
		
	}

	

}
