package main.info.sjd.mathModules;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberFinderTest {

	@Test
			void testIsPalindrome() {
				PalindromeNumberFinder palindromeNumberFinder = new PalindromeNumberFinder();
		
				assertEquals(99000099, palindromeNumberFinder.getMaxPalindrome());
			}

}
