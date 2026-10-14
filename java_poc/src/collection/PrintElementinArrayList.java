package collection;

import java.util.ArrayList;
import java.util.Collection;

public class PrintElementinArrayList {

	public static void main(String[] args) {
		Collection<Object> c1 = new ArrayList<>();
		
		c1.add(12);
		c1.add(30);
		c1.add(50);
		c1.add(43);
		c1.add(90);
		c1.add("Rakesh");
		c1.add("MD.marshuk");
		
		System.out.println(c1);
		
		
		
		Collection<String> boys = new ArrayList<>();
		
		boys.add("ram");
		boys.add("suresh");
		boys.add("Rishi");
		boys.add("manikanta");
		boys.add("Dhoni");
		boys.add("suresh");
		
		
		System.out.println(boys);
		boys.remove("suresh");
		System.out.println(boys);
		
		Collection<Object> both = new ArrayList<>();
		
		both.addAll(c1);
		
		both.addAll(boys);
		
		System.out.println(both);
		both.remove("Rakesh");
		System.out.println(both.containsAll(c1));
		

	}

}
