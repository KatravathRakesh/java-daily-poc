package collection;

import java.util.HashMap;
import java.util.Map;

public class CountfrequencyOfElement {

	public static void main(String[] args) {
		Map<Integer , Integer> map = new HashMap<>();
		int[] num = {1,2,2,3,1,4,3};
		for(int i=0;i<num.length;i++) {
			map.put(num[i], map.getOrDefault(num[i], 0)+1);
//			map.put(num[i], map.getOrDefault(num[i], 0)+i);
			
		}
		
		System.out.println(map);
		

	}

}
