package com.array_poc;

//WAP to print the number in reverse order
public class ReverseNumber {
	
    public static void ReverseNum(int[] num) {
    	int n = num.length -1;
    	for(int i=n;i>=0;i--) {
    		System.out.print(num[i]+" ");
    	}
    }
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50,60};
		
		ReverseNum(num);

	}

}
