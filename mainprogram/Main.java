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
	}

}
