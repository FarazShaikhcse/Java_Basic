package com.yml.basicjava;

import java.util.Scanner;

public class PrimeFactors {
	
	public static void primeFactors() {
	int number, div;
	Scanner scanner = new Scanner(System.in);
	System.out.println("\nPRIME FACTORS\nEnter a number to find its prime factorization");
	number = scanner.nextInt();
	div = number;
	System.out.println("Prime factors of " + number + " are:" );
	for(int i = 2;i<=number/2;i++) {
		while(div % i == 0 ) {
			System.out.println(i + " ");
			div = div / i;
		}
	}
	if ( div == number) {
		System.out.println(number + " is a prime number and cannot be factorized");
	}
	scanner.close();
	}
}
