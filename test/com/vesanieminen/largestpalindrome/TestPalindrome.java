package com.vesanieminen.largestpalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPalindrome {

	@Test public void isAPalindrome() {
		String test1 = "1234567890";
		assertFalse(Palindrome.isAPalindrome(test1));
		String test2 = "123321";
		assertTrue(Palindrome.isAPalindrome(test2));
	}
	
	@Test public void largestProductOfThreeDigitsPalindrome() {
		String largest = Palindrome.largestProductOfThreeDigitsPalindrome();
		assertTrue(Palindrome.isAPalindrome(largest));
		assertTrue(Palindrome.isProductOfThreeDigits(largest));
		assertFalse(Palindrome.largerProductOfThreeDigitsPalindromeExits(largest));
	}
	
	@Test public void isProductOfThreeDigits() {
		String test1 = "10000";
		assertTrue(Palindrome.isProductOfThreeDigits(test1));
		String test2 = "9999";
		assertFalse(Palindrome.isProductOfThreeDigits(test2));
		String test3 = "808201";
		assertTrue(Palindrome.isProductOfThreeDigits(test3));
		String test4 = "808202";
		assertFalse(Palindrome.isProductOfThreeDigits(test4));		
	}
	
	@Test public void noLargerProductOfThreeDigitsPalindromeExits() {
		String test1 = "123321";
		assertTrue(
			Palindrome.isAPalindrome(test1) &&
			Palindrome.isProductOfThreeDigits(test1)
		);		
		String test2 = "321123";
		assertTrue(
			Palindrome.isAPalindrome(test2) &&
			Palindrome.isProductOfThreeDigits(test2)
		);
		assertTrue(Palindrome.largerProductOfThreeDigitsPalindromeExits(test1));
	}
	
}
