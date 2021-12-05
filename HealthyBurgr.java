package trails;

import java.util.List;

public class HealthyBurgr extends BurgerDetails {

	HealthyBurgr(String rollType, String mMeat, int bPrice) {
		super(rollType, mMeat, bPrice);
	}

	public int baseprice() {
		return super.getbaseprice();
	}

	public void additional_items(List<String> items, int bPrice) {
		int n = 0;
		String item;
		int base_price = bPrice;
		items.add("latts");
		items.add("cauliflower");
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
			} else if (n == 5) {
				bPrice = bPrice + 60;
				System.out.print("Additional price is: 60\n");
			} else if (n == 6) {
				bPrice = bPrice + 70;
				System.out.print("Additional price is: 70\n");
			}
		}
		System.out.print("Number of Additional item added are: " + n + "\n");
		System.out.print("Total Additional Price is: " + (bPrice - base_price) + "\n");
		System.out.print("\nGrand Total : " + bPrice + "\n");

	}

}