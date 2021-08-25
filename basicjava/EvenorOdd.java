package com.yml.basicjava;

import java.util.Scanner;

public class EvenorOdd {
	
	public static void oddOreven() {
		
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEVEN OR ODD\nEnter the number to check if it is even or odd");
		number=scanner.nextInt();
		
		if(number % 2 == 0) 
			System.out.println(number+" is even");
		else
			System.out.println(number+" is odd");
		scanner.close();
			
	}
}
