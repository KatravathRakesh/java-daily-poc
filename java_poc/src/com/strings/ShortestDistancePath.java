package com.strings;

//Short Distance = √(x2-x1)^2 + (y2-y1)^2

public class ShortestDistancePath {

	static float shortestDist(String path) {
		int dist = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < path.length(); i++) {
			char dir = path.charAt(i);
			if (dir == 'S') {
				y--;
			} else if (dir == 'N') {
				y++;
			} else if (dir == 'W') {
				x--;
			} else {
				x++;
			}

		}
		int x2 = x * x;
		int y2 = y * y;
		dist = (int) Math.sqrt(x2 + y2);
		return dist;
	}

	public static void main(String[] args) {
		String path = "WNEENEESENNN";

		float dist = shortestDist(path);
		System.out.println("Shortest Distance : " + dist);

	}

}
