package com.yml.basicjava;

public class Powerof2 {
	
	public static void powerof2(int n) {
		
		if(n > 30) {
			System.out.println("Please provide number less than or equal to 30");
			return;
		}
		System.out.println("\nPOWER OF 2");
		for(int i=0;i<=n;i++) {
			System.out.println("2^"+i+"="+(int)Math.pow(2,i));
			
		}
		
	}
}
