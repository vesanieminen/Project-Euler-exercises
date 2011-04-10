package com.vesanieminen.largestpalindrome;

import java.util.HashSet;
import java.util.Set;

/**
 * This is my solution to <a href="http://projecteuler.net/index.php?section=problems&id=4">Project Euler's problem #4</a>
 * written in Java and created in a TDD manner.
 * 
 * @author Vesa Nieminen
 * 
 */
public class Palindrome {
	
	private static Set<String> listOfProductsOfThreeDigits;

	/**
	 * Returns the largest three digit palindrome that exists.
	 * @return
	 */
	public static String largestProductOfThreeDigitsPalindrome() {
		int largest = 0;
		for (String s : getListOfProductsOfThreeDigits()) {
			int candidate = Integer.parseInt(s);
			if (isAPalindrome(s) && candidate > largest) {
				largest = candidate;
			}
		}
		return "" + largest;
	}

	/**
	 * Checks if the string parameter is a palindrome or not.
	 * @param string The word being checked
	 * @return
	 */
	public static boolean isAPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; ++i) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isProductOfThreeDigits(String largest) {
		return Palindrome.getListOfProductsOfThreeDigits().contains(largest);		
	}

	public static Set<String> getListOfProductsOfThreeDigits() {
		if (listOfProductsOfThreeDigits == null) {
			listOfProductsOfThreeDigits = generateAllProductsOfThreeDigits();
		}
		return listOfProductsOfThreeDigits;
	}
	
	private static Set<String> generateAllProductsOfThreeDigits() {
		Set<String> set = new HashSet<String>();
		for (int x = 100; x < 1000; ++x) {
			for (int y = 100; y < 1000; ++y) {
				set.add( "" + x * y );
			}
		}
		return set;
	}

	public static boolean largerProductOfThreeDigitsPalindromeExits(
			String largest) {
		int candidate = Integer.parseInt(largest);
		for (String s : getListOfProductsOfThreeDigits()) {
			if (Integer.parseInt(s) > candidate && isAPalindrome(s)) {
				return true;
			}
		}
		return false;
	}

}
