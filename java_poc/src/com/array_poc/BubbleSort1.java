package com.array_poc;

import java.util.Arrays;

public class BubbleSort1 {

	
	static void bubbleSort(int[] num) {
		int temp = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<num.length-1;i++) {
			boolean flag = false;
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = true;
				}
				count2++;
			}
			count1++;
			if(!flag) {
				break;
			}
		}
		
		System.out.println("Count1 : "+count1);
		System.out.println("Count2 : "+count2);
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		int[] num = {20,3,32,21,10};
		
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(num));
		
		bubbleSort(num);

	}

}
