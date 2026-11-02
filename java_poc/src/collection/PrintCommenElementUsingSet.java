package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//2.Write a Java program to find all common elements in three sorted arrays using a Set.
//Input: [1, 5, 10], [1, 4, 10], [1, 6, 10]
//Output: [1, 10]
public class PrintCommenElementUsingSet {

	public static void main(String[] args) {
		
		
//		s1.add(new ArrayList<>(Arrays.asList(1,5,10)));
//		s1.add(new ArrayList<>(Arrays.asList(1,4,10)));
//		s1.add(new ArrayList<>(Arrays.asList(1,6,10)));

//		OR
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(5);
		a1.add(10);
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(1);
		a2.add(4);
		a2.add(10);
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(1);
		a3.add(6);
		a3.add(10);
		
		
		
		Set<Integer> s1 = new HashSet<>(a1);
		
		s1.retainAll(a2);
		s1.retainAll(a3);
		
		
		System.out.println(s1);
		
		
		

	}

}
