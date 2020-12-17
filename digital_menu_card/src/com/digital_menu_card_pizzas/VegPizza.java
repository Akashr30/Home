package com.digital_menu_card_pizzas;

import java.util.HashSet;

import com.digital_menu_card_ingredients.Bread;
import com.digital_menu_card_ingredients.Cheeses;

public class VegPizza implements Pizza {
	
	private Bread bread;
	private Cheeses cheese;
	private String size;
	public HashSet<String> veggies = new HashSet<>();
	
	public VegPizza(String size) {
		this.size = size;
	}
	
	public void selectBread(String bread) {
		this.bread = new Bread(bread);
	}
	
	public void selectCheese(String cheese) {
		this.cheese = new Cheeses(cheese);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
//	public void selectOnions(boolean flag) {
//		this.onion = new Onions(flag);
//	}
	
}
