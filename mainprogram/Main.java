package com.yml.mainprogram;

import com.yml.basicjava.CoinFlip;
import com.yml.basicjava.EvenorOdd;
import com.yml.basicjava.HarmonicNumber;
import com.yml.basicjava.LargestofNumbers;
import com.yml.basicjava.LeapYear;
import com.yml.basicjava.Powerof2;
import com.yml.basicjava.PrimeFactors;
import com.yml.basicjava.QuotientandRemainder;
import com.yml.basicjava.SwapNumbers;
import com.yml.basicjava.VowelorConsonant;
import com.yml.functional.Array2D;
import com.yml.functional.Distance;
import com.yml.functional.Quadratic;
import com.yml.functional.Triplet;
import com.yml.functional.WindChill;

public class Main {

	public static void main(String[] args) {
		CoinFlip.flipCoin();
		LeapYear.isLeapYear();
		Powerof2.powerof2(Integer.parseInt(args[0]));
		HarmonicNumber.harmonicNumber();
		PrimeFactors.primeFactors();
		QuotientandRemainder.quotientandRemainder();
		SwapNumbers.swap2Numbers();
		EvenorOdd.oddOreven();
		VowelorConsonant.vowelOrConsonant();
		LargestofNumbers.largestOf3Numbers();
		
		Distance.distance();
		Quadratic.quadratic();
		Array2D.array2D();
		Triplet.triplets();
		WindChill.windChill(args);
	}

}
