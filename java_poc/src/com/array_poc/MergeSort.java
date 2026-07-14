package com.array_poc;

import java.util.Arrays;

public class MergeSort {

	void divide(int[] arr) {
		if(arr.length <=1) {
			return;
		}
		
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length - left.length];
		int i;
		
		for(i=0;i<left.length;i++) {
			left[i] = arr[i];
		}
		
		for(int j=0;j<right.length;j++){
			right[j] = arr[i++];
		}
		
		divide(left);
		System.out.println("Left Array : "+Arrays.toString(left));
		
		divide(right);
		System.out.println("Rigth Array : "+Arrays.toString(right));
		
		merge(arr,left,right);
		
		
	}
	
	void merge(int[] arr,int[] left, int[] right) {
		int i=0;
		int j=0;
		int k =0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}
		}
		
		while(i<left.length) {
			arr[k++] = left[i++];
		}
		
		while(j <right.length) {
			arr[k++] = right[j++];
		}
	}
	void main(String[] args) {
		int[] arr = {50,20,30,40,70,10,80,60};
		
		divide(arr);
		
		System.out.println("Merge Sort : "+Arrays.toString(arr));

	}

}
