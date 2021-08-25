package com.yml.functional;

import java.util.Scanner;

public class Quadratic {
	
	public static void quadratic() {
		
		int a, b, c;
		double delta, root1, root2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = scanner.nextInt();
		System.out.println("Enter the value of b");
		b = scanner.nextInt();
		System.out.println("Enter the value of c");
		c = scanner.nextInt();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		root1 = ( -b + Math.sqrt(delta)) / 2 * a;
		root2 = ( -b - Math.sqrt(delta)) / 2 * a;
		
		System.out.println("Root 1= " + root1);
		System.out.println("Root 2= " + root2);
		scanner.close();
	}

}
