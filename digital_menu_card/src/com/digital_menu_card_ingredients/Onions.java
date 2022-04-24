package com.digital_menu_card_ingredients;

public class Onions {
	
	Onions(){}
	
	public Onions(boolean isOnionsRequired) {
		this.isOnionsRequired = isOnionsRequired;
	}

	private boolean isOnionsRequired;

	public boolean isOnionsRequired() {
		return isOnionsRequired;
	}

	public void setOnionsRequired(boolean isOnionsRequired) {
		this.isOnionsRequired = isOnionsRequired;
	}

}
