package com.array_poc;

public class CountDuplicates {
	
	static void countduplicate(int[] num) {
		int count =0;
		
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
			
			for(int j=i+1;j<num.length;j++) {
				if(num[i] == num[j]) {
					count++;
					
					System.out.print(num[i]+" ");
					break;
					
				}
			}
	
		}
		System.out.println();
		
		System.out.println("Count : "+ count);
		
	}

	public static void main(String[] args) {
		int[] num = {10,20,30,40,10,20,10,30}; 
		
		 countduplicate(num);

	}

}
