package com.array_poc;

import java.util.Arrays;

public class CountStudentMarks {

	static void checkMarks(int[] marks) {
		int maxMark = marks[0];
		
		int abcount = 0;
		int blcount = 0;
		System.out.print("Student Marks : ");
		System.out.println(Arrays.toString(marks));
		System.out.println();
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<marks.length;i++) {
			
			if(maxMark < marks[i]) {
				maxMark = marks[i];
			}
			
			if(marks[i] >= 40) {
				abcount++;
			}else if(marks[i] < 40) {
				blcount++;
			}
		}
		System.out.println("Number of Student Scored 40 or above is : "+abcount);
		System.out.println("Number of Student Scored below 40 is : "+blcount);
		System.out.println("Hightest Marks is  : "+maxMark);
		
	}
	public static void main(String[] args) {
		int[] marks = {90,40,79,31,69,41,83,34,96,37};
		

		checkMarks(marks);
	}

}
