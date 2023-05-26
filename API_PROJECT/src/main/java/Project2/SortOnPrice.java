package Project2;

import java.util.Comparator;

public class SortOnPrice implements Comparator<Mobile> {

	
	public int compare(Mobile mob1, Mobile mob2) 
	{

		Integer price1 = mob1.price;
		Integer price2 = mob2.price;

		if(price1.equals(price2))
			return - mob1.speed.compareTo(mob2.speed);

		return price1.compareTo(price2);
	}



}
