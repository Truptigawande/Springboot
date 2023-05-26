package Project2;

import java.util.ArrayList;
import java.util.TreeSet;

import com.sun.media.sound.ModelConnectionBlock;

public class SortPhoneTest {

	public static void main(String[] args) {
		
		Mobile mobile1 = new Mobile(10,8);
		Mobile mobile2 = new Mobile(23,10);
		Mobile mobile3 = new Mobile(23,25);
		Mobile mobile4 = new Mobile(25,65);
		
		ArrayList<Mobile> arrayList = new ArrayList<Mobile>();
		
		arrayList.add(mobile1);
		arrayList.add(mobile2);
		arrayList.add(mobile3);
		arrayList.add(mobile4);
		
		TreeSet<Mobile> ts = new TreeSet(new SortOnPrice());
		
		for (Mobile mobile : arrayList) 
		{
		int price = mobile.price;
		if(price>=15 && price<=30)
			ts.add(mobile);
		}
		
		System.out.println(ts);
	}
}
