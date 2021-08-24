package com.yml.basicjava;

import java.util.Scanner;

public class LargestofNumbers {

	public static void largestOf3Numbers() {
		 
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Largest of Three Numbers\nEnter the first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second number:");
        b = scanner.nextInt();
        System.out.println("Enter the third number:");
        c = scanner.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b > c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
        return ;
 
    }
}
