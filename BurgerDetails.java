package trails;

import java.util.List;

public class BurgerDetails {

	String rollType, mMeat;
	int burgerPrice;

	BurgerDetails(String rollType, String mMeat, int bPrice) {
		this.rollType = rollType;
		this.mMeat = mMeat;
		this.burgerPrice = bPrice;
		System.out.println("Bread roll type : " + rollType);
		System.out.println("Meat : " + mMeat);
		System.out.println("Base price : " + bPrice);
		setbaseprice(bPrice);
	}

	public int getbaseprice() {
		return burgerPrice;
	}

	public void setbaseprice(int base_price) {
		this.burgerPrice = base_price;
	}

	public BurgerDetails() {

	}

	public void additional_items(List<String> items, int bPrice) {
		int n = 0;
		int base_price = bPrice;
		String item;
		for (String s : items) {
			n++;
			item = s;
			System.out.println("Additional items you added is : " + s);
			if (n == 1) {
				bPrice = bPrice + 20;
				System.out.print("Additional price is: 20\n");
			} else if (n == 2) {
				bPrice = bPrice + 30;
				System.out.print("Additional price is: 30\n");
			} else if (n == 3) {
				bPrice = bPrice + 40;
				System.out.print("Additional price is: 40\n");
			} else if (n == 4) {
				bPrice = bPrice + 50;
				System.out.print("Additional price is: 50\n");
			}
		}
		System.out.print("Number of Additional item added are: " + n + "\n");
		System.out.print("Total Additional Price is: " + (bPrice - base_price) + "\n");
		System.out.print("\nGrand Total : " + bPrice + "\n");

	}
}
