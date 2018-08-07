package main.info.sjd.mathModules;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumDigitsOfNumberTest {

	
	@Test
	void testGetSumDigitsOfNumberThroughChar() {
		SumDigitsOfNumber sumDigitsOfNumber = new SumDigitsOfNumber(1234567);
		
	 assertEquals(28, sumDigitsOfNumber.getSumDigitsOfNumberThroughChar());
		
	}
	
	
	
	@Test
	void testGetSumDigitsOfNumberThroughReminderOfDiv() {
		
		SumDigitsOfNumber sumDigitsOfNumber = new SumDigitsOfNumber(1234567);
		
		assertEquals(28,sumDigitsOfNumber.getSumDigitsOfNumberThroughReminderOfDiv());
				
		
	}

}
