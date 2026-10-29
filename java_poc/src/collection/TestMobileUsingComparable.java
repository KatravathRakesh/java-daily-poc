package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMobileUsingComparable {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Vivo", "Y72 5G", 22000.0);
		Mobile m2 = new Mobile("Samsung", "Galaxy S24", 75000.0);
		Mobile m3 = new Mobile("Apple", "iPhone 16", 80000.0);
		Mobile m4 = new Mobile("OnePlus", "Nord CE4", 25000.0);
		Mobile m5 = new Mobile("Redmi", "Note 13", 18000.0);
		Mobile m6 = new Mobile("Realme", "GT 6", 40000.0);
		Mobile m7 = new Mobile("Oppo", "Reno 12", 32000.0);
		Mobile m8 = new Mobile("Motorola", "Edge 50", 28000.0);
		Mobile m9 = new Mobile("iQOO", "Neo 9 Pro", 35000.0);
		Mobile m10 = new Mobile("Poco", "X6 Pro", 26000.0);
		
		List<Mobile> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);
		list.add(m10);
		
		Collections.sort(list);
		for(Mobile m:list) {
			System.out.println(m);
		}

	}

}
