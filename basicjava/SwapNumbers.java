package com.yml.basicjava;

import java.util.Scanner;

public class SwapNumbers {
	public static void swap2Numbers()
	{
		int a,b,temp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nSWAP TWO NUMBERS\nEnter the two numbers to swap");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("Before swapping values are\n a= "+a+" and b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping values are\n a= "+a+" and b= "+b);
		scanner.close();
		
	
	}
}
