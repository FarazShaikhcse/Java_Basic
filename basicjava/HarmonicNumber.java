package com.yml.basicjava;

import java.util.Scanner;

public class HarmonicNumber {
	public static void harmonicNumber() {
		int n;
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nHARMONIC NUMBER\nEnter the the value of n to find harmonic number");
		n=scanner.nextInt();
		if(n<=0) {
			System.out.println("Give positive integer as input");
			scanner.close();
			return;
		}
		for(int i=1;i<=n;i++) {
			sum+=(double) 1/i;
		}
		System.out.println("harmonic value is "+String.format("%.2f",sum));
		scanner.close();
	}
}
