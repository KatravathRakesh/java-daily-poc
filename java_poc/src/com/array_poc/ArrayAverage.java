package com.array_poc;

//Find the average of elements.
public class ArrayAverage {

	public static void main(String[] args) {
	    float[] a = {20,32,14,55};
		float sum = 0;
		int n = a.length;
		
		for(float a1 : a) {
			sum += a1;
		}
		
		double avg = sum/n;
		
		System.out.println("Average of Element : "+avg);

	}

}
