package com.array_poc;

public class FindSecondSmallestNum {

	static int findsecondSmallest(int[] num) {
		int lowest = num[0];
		int seclowest = num[0];
		
		for(int i=1;i<num.length;i++) {
			if(lowest > num[i]) {
				lowest = num[i];
			}
		}
		
		for(int i=1;i<num.length;i++) {
			if(lowest == num[i]) {
				continue;
			}else if(seclowest > num[i]) {
				seclowest = num[i];
			}
		}
		
		return seclowest;
	}
	public static void main(String[] args) {
		int[] num = {50,40,30,20,10};
		
		int seclowest =findsecondSmallest(num);
		
		System.out.println("Second Smallest Number : "+seclowest);

	}

}
