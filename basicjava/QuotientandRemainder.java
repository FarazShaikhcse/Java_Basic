package com.yml.basicjava;

import java.util.Scanner;

public class QuotientandRemainder {
		public static void quotientandRemainder() {
			
			double dividend, divisor, remainder;
			int quotient;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\nQUOTIENT AND REMAINDER\nEnter the dividend");
			dividend=scanner.nextDouble();
			System.out.println("Enter the divisor");
			divisor=scanner.nextDouble();
			remainder=dividend % divisor;
			quotient=(int)(dividend / divisor);
			
			System.out.println("Quotient="+ quotient);
			System.out.println("Remainder="+String.format("%.3f", remainder));
			scanner.close();
		}
			
			
		
}
