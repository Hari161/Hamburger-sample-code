package trails;

import java.util.ArrayList;
import java.util.List;

public class HamBurgr {

	public static void main(String[] args) {

		System.out.println("\n              Welcome to Bills Burgers\n");
		System.out.println("                  ******************\n");

		System.out.println("                Base Burger Details");
		System.out.println("                  ******************\n");

		BurgerDetails baseBurger = new BurgerDetails("Ciabatta Roll", "chicken", 50), baseBurger1 = new BurgerDetails();
		List<String> baseHamburger = new ArrayList<String>();
		baseHamburger.add("lettuce");
		baseHamburger.add("tomato");
		baseHamburger.add("cabbage");
		baseHamburger.add("cauliflower");
		baseBurger1.additional_items(baseHamburger, 50);

		System.out.println(" \n\n             Healthy Burger Details");
		System.out.println("                  ******************\n");

		HealthyBurgr healthyburger = new HealthyBurgr("Grilled Burger", "vegitables", 100);
		healthyburger.additional_items(baseHamburger, 100);

		System.out.println(" \n\n             Delux Burger Details");
		System.out.println("                  ******************\n");

		new Deluxhamburgr("Delux", "chicken", 150);
	}

}
