package com.yml.basicjava;

import java.util.Scanner;

public class VowelorConsonant {

	public static void vowelOrConsonant() {
		char alphabet;
		Scanner scanner = new Scanner(System.in);
		char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
		
		System.out.println("\nVOWEL OR CONSONANT\nEnter an alphabet to check if it is a Vowel or a consonant");
		
		alphabet=scanner.next().charAt(0);
		if(! Character.isAlphabetic(alphabet))
		{
			System.out.println("Invalid input, please input an alphabet");
			return;
		}
		for(char ch:vowels)
		{
			if(ch==alphabet)
			{
				System.out.println(alphabet+" is vowel");
				return ;
			}
		}
		System.out.println(alphabet+" is consonant");
		scanner.close();
	}
}
