package com.digital_menu_card_ingredients;

public class Cheeses {
	
	Cheeses(){}
	
	public Cheeses(String cheese){
		this.cheese = cheese;
	}
	
	private String cheese;

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
}
