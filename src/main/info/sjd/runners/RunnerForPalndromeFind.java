package main.info.sjd.runners;

import java.util.logging.Logger;

import main.info.sjd.mathModules.PalindromeNumberFinder;

public class RunnerForPalndromeFind {

	// TASK#5.2

	private static Logger logger = Logger.getLogger(RunnerForPalndromeFind.class.getName());

	public static void main(String[] args) {

		PalindromeNumberFinder palNumFinder = new PalindromeNumberFinder();
		
		 logger.info("The maximal palindrome number is "
		 + palNumFinder.getMaxPalindrome());

	}

}
