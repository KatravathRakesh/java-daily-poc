package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestBikeUsingComparator {

	public static void main(String[] args) {
		
		Bike b1 = new Bike("Classic 350", "Royal Enfield", 220000.0);
		Bike b2 = new Bike("Hunter 350", "Royal Enfield", 150000.0);
		Bike b3 = new Bike("Pulsar NS200", "Bajaj", 150000.0);
		Bike b4 = new Bike("Apache RTR 160", "TVS", 120000.0);
		Bike b5 = new Bike("R15 V4", "Yamaha", 185000.0);
		Bike b6 = new Bike("Unicorn", "Honda", 110000.0);
		Bike b7 = new Bike("Duke 200", "KTM", 200000.0);
		Bike b8 = new Bike("Gixxer SF", "Suzuki", 140000.0);
		Bike b9 = new Bike("Xtreme 160R", "Hero", 120000.0);
		Bike b10 = new Bike("Ronin", "TVS", 160000.0);
		
		
		List<Bike> list = new ArrayList<>();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b10);
		
		
		
		Comparator<Bike> c = new Comparator<>() {
			
			@Override
			public int compare(Bike o1, Bike o2) {
//				if(o1.price < o2.price) {
//					return -1;
//				}else if(o1.price > o2.price) {
//					return 1;
//				}else {
//					return 0;
//				}
				
//				----OR----
//			   return o1.model.compareTo(o2.model);
//				----OR----
			   return o2.model.compareTo(o1.model);
			
			}
		};
		
		Collections.sort(list, c);
		
		for(Bike b : list) {
			System.out.println(b);
		}
		
		
	}

}
