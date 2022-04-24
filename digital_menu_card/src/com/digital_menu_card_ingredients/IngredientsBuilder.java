package com.digital_menu_card_ingredients;

public class IngredientsBuilder {
	
	private Bread bread;
	private Cheeses cheese;
	private Veggies veggies;
	
	public IngredientsBuilder() {
		veggies = new Veggies();
	}
	
	public Veggies getVeggies() {
		return veggies;
	}
	public void setVeggies(Veggies veggies) {
		this.veggies = veggies;
	}
	private Onions onion;
	public Bread getBread() {
		return bread;
	}
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	public Cheeses getCheese() {
		return cheese;
	}
	public void setCheese(Cheeses cheese) {
		this.cheese = cheese;
	}
	public Onions getOnion() {
		return onion;
	}
	public void setOnion(Onions onion) {
		this.onion = onion;
	}

}
