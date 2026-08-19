package com.array_poc;

public class FindUniqueElement {

	static void finduniqueElement(int[] num) {
		
		for(int i=0;i<num.length;i++) {
			boolean flag = false;
			for(int k=0;k<i;k++) {
				if(num[k] == num[i]) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				continue;
			}
			
			for(int j= i+1;j<num.length;j++) {
				if(num[j] == num[i]) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.print(num[i]+" ");
			}
			
			
		}
	}
	public static void main(String[] args) {
		int[] num = {10,20,30,40,20,10,10};
		
		finduniqueElement(num);

	}

}
