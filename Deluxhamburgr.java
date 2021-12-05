package trails;

import java.util.ArrayList;
import java.util.List;

public class Deluxhamburgr extends BurgerDetails {

	Deluxhamburgr(String rollType, String mMeat, int bPrice) {
		super(rollType, mMeat, bPrice);
		additional_items(bPrice);
	}

	public int baseprice() {
		return super.getbaseprice();
	}

	public void additional_items(int bPrice) {
		int n = 0;
		String item;
		List<String> deluxhamburgerlist = new ArrayList<String>();
		deluxhamburgerlist.add("chips");
		deluxhamburgerlist.add("drinks");
		int base_price = bPrice;
		for (String s : deluxhamburgerlist) {
			n++;
			item = s;
			System.out.println("Additional items you added is : " + s);
			if (n == 1) {
				bPrice = bPrice + 20;
				System.out.print("Additional price is: 20\n");
			} else if (n == 2) {
				bPrice = bPrice + 30;
				System.out.print("Additional price is: 30\n");
			}
		}
		System.out.print("Number of Additional item added are: " + n + "\n");
		System.out.print("Total Additional Price is: " + (bPrice - base_price) + "\n");
		System.out.print("\nGrand Total : " + bPrice + "\n");

	}
}
