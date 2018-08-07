package main.info.sjd.runners;

import java.util.logging.Logger;

import main.info.sjd.mathModules.SumDigitsOfNumber;

public class RunnerSumOfDigits {

// TASK#5.1

	private static Logger logger = Logger.getLogger(RunnerSumOfDigits.class.getName());

	public static void main(String[] args) {

		SumDigitsOfNumber sumDigitsOfDigits = new SumDigitsOfNumber(1234567);

		
		logger.info("The sum of digits of the incoming number, calculated through the charArray conversion is: "
				+ sumDigitsOfDigits.getSumDigitsOfNumberThroughChar());

		logger.info("The sum of digits of the incoming number, calculated through the division with reminder is: "
				+ sumDigitsOfDigits.getSumDigitsOfNumberThroughReminderOfDiv());

	}

}
