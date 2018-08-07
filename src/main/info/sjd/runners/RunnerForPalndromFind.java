package main.info.sjd.runners;

import java.util.logging.Logger;

import main.info.sjd.mathModules.PalindromeNumberFinder;

public class RunnerForPalndromFind {

	// TASK#5.2

	private static Logger logger = Logger.getLogger(RunnerForPalndromFind.class.getName());

	public static void main(String[] args) {

		PalindromeNumberFinder palindromeNumberFinder = new PalindromeNumberFinder();

		int palindrome = palindromeNumberFinder.getMaxPalindromeInResultOfMultiplication(2147, 422);

		logger.info("The maximal palindrome number of the multiplication result is " + palindrome);

	}

}
