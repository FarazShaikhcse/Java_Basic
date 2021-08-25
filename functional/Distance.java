package com.yml.functional;

import java.util.Scanner;

public class Distance {

		public static void distance(){
			int x, y;
			double dist;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the point");
			x = scanner.nextInt();
			y = scanner.nextInt();
			dist = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
			System.out.println("Distance between origin and the point is:"+dist);
			scanner.close();
		}
}
