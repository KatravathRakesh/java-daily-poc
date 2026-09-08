package com.array_practices_poc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graph {

	static void bfs(int start ,List<List<Integer>> graph ) {
		boolean[] vist = new boolean[graph.size()];
		
		Queue<Integer> queue = new LinkedList<>();
		vist[start] = true;
		queue.add(start);
		while(!queue.isEmpty()) {
			int node = queue.remove();
			System.out.print(node+" ");
			for(int neig: graph.get(node)) {
				if(!vist[neig]) {
					vist[neig] = true;
					queue.add(neig);
				}
			}
		}
	}
	public static void main(String[] args) {
		int v = 5;
		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			graph.add(new ArrayList<>());
		}
		
		graph.get(0).add(1);
		graph.get(1).add(2);
		graph.get(2).add(3);
		graph.get(3).add(4);
		
		
		bfs(0,graph);
	}

}
