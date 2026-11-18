package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<>();

		q.add(5);
		q.add(2);
		q.add(4);
		q.add(1);
		q.add(3);

		System.out.println(q);

		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
