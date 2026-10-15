package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FintLargestandSecLargestElementInArrayList {
	
	public static void findFristAndSecLargest(Collection<Integer> nums) {
		int max = Integer.MIN_VALUE;
		
		for(int n : nums) {
			if(max < n) {
				max  = n;
			}
		}
		
		int secmax = Integer.MIN_VALUE;
		for(int n : nums) {
			if(max == n) {
				continue;
			}else if(secmax < n){
				secmax = n;
				
			}
		}
		
		System.out.println("List : "+nums);
		List<Integer> list = new ArrayList<>(nums);
		Collections.sort(list);
		System.out.println("Sorted List : "+list);
		System.out.println("Largest Element : "+max);
		System.out.println("Second Largest Element :"+secmax);
	}

	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<>(
				Arrays.asList(25, 80, 45, 90, 60, 75, 90, 5));
		
		findFristAndSecLargest(nums);
		
	}
}
