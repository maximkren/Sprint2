package main.info.sjd.mathModules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeNumberFinder {

	public int getMaxPalindrome() {
		List<Integer> palindromes = new ArrayList<Integer>();

		for (int i = 1000; i < 10000; i++) {
			for (int j = 1000; j < 10000; j++) {
				int result = i * j;

				if (isPalindrome(result)) {
					palindromes.add(result);
				}
			}
		}
		
		return Collections.max(palindromes);

	}
	

	public boolean isPalindrome(int value) {

		String valueAsString = Integer.toString(value);

		// Next block of code check that a number is a palindrome
		for (int i = 0; i <= valueAsString.length() / 2;) {

			if (valueAsString.charAt(i) == valueAsString.charAt(valueAsString.length() - 1 - i)) {
				i++;
			} else {
				return false;
			}
		}

		return true;
	}

}
