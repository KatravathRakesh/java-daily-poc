package collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyonwriteArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cart = new CopyOnWriteArrayList<>();

//		1. Add products
		cart.add("Laptop");
		cart.add("Mouse");
		cart.add("Keyboard");
		cart.add("Monitor");

//        2.create iterator
		Iterator<String> itr1 = cart.iterator();

//        4.print before update data
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
//          3.add and remove
			cart.add("Headphones ");
			cart.remove("Mouse");
		}

		System.out.println("*******************************");
//        5.print after update
		Iterator<String> itr2 = cart.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println(cart);
	}

}
