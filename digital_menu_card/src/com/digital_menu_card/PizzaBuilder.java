package com.digital_menu_card;

import com.digital_menu_card_pizzas.Pizza;
import com.digital_menu_card_pizzas.VegPizza;

public class PizzaBuilder {
	
	
	public static VegPizza vegPizza;
	
	PizzaBuilder() {}
	
	public static Pizza getPizza(int val,String size) {
		switch(val) {
		case 1 :
			vegPizza = new VegPizza(size);
			return vegPizza;
		}
		return null;
	}

}
