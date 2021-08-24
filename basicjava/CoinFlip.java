package com.yml.basicjava;
import java.util.Scanner;

public class CoinFlip {

	public static void flipCoin() {

			int n, noofTails=0;
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number of times to flip coin");
			n = reader.nextInt();
			
			while(n < 0) {
				System.out.println("Enter a positive integer");
				n = reader.nextInt();
			}
			for(int i=1;i<=n;i++) {
				if(Math.random()<0.5) {
					noofTails+=1;
				}
			}
			System.out.println("The percentage of heads is="+String.format("%.2f",(n-noofTails-0.0)*100/n));
			System.out.println("The percentage of tails is="+String.format("%.2f",(noofTails-0.0)*100/n));

	}

}
