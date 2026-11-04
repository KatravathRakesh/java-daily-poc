package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//1.Convert integer to Roman  and Roman to Integer vice versa.
///integer to Roman
//Input: 58 ==> 50+5+1+1+1 ==> LVIII
//Output: "LVIII"
/// Roman to Integer
//Input: "LVIII"
//Output: 58
public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Map<Integer, String> roman = new TreeMap<>(Collections.reverseOrder());
		roman.put(1000, "M");
		roman.put(900, "CM");
		roman.put(500, "D");
		roman.put(400, "CD");
		roman.put(100, "C");
		roman.put(90, "XC");
		roman.put(50, "L");
		roman.put(40, "XL");
		roman.put(10, "X");
		roman.put(9, "IX");
		roman.put(5, "V");
		roman.put(4, "IV");
		roman.put(1, "I");
		
		System.out.println("Enter the Number which you want to canvert from integer to String :");
		int num = s.nextInt();
		
		System.out.println(roman.containsKey(50));
		
		String result = "";
		for (Map.Entry<Integer, String> entry : roman.entrySet()) {
		   while(num >= entry.getKey()) {
			   
			   result += entry.getValue();
			   
			   num -= entry.getKey();
			   System.out.println(entry);
		   }
			
			
		}
		
		System.out.println("Integer to Roman Number : "+result);
		
	}
}
