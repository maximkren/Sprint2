package main.info.sjd.mathModules;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberFinderTest {

	@Test
		void testGetMaxPalindromeInResultOfMultiplication() {
			PalindromeNumberFinder palindromeNumberFinder = new PalindromeNumberFinder();
	
			assertEquals(199797991, palindromeNumberFinder.getMaxPalindromeInResultOfMultiplication(199999, 999));
		}

}
