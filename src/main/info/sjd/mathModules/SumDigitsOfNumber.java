package main.info.sjd.mathModules;

public class SumDigitsOfNumber {

	private int incomingNumber;
	private int sumOfDigits;

	public SumDigitsOfNumber() {

	}

	public SumDigitsOfNumber(int incomingNumber) {
		this.incomingNumber = incomingNumber;
	}

	public int getIncomingNumber() {
		return incomingNumber;
	}

	public void setIncomingNumber(int incomingNumber) {
		this.incomingNumber = incomingNumber;
	}

	public int getResult() {
		return sumOfDigits;
	}

	public void setResult(int result) {
		this.sumOfDigits = result;
	}

	// calculate sum of digits of incoming number 
	// through the int to charArray conversion
	public int getSumDigitsOfNumberThroughChar() {

		if (incomingNumber != 0) {
			sumOfDigits = 0;
			final char[] intAsCharArray = Integer.toString(incomingNumber).toCharArray();

			for (char element : intAsCharArray) {

				sumOfDigits += Character.getNumericValue(element);
			}
		}
		return sumOfDigits;
	}

	// calculate sum of digits of incoming number
	// through the division with reminder
	public int getSumDigitsOfNumberThroughReminderOfDiv() {
		
		if (incomingNumber != 0) {
			sumOfDigits = 0;
			
			while (incomingNumber != 0) {

				sumOfDigits += incomingNumber % 10;
				incomingNumber /= 10;
			}
		}
		return sumOfDigits;
	}

}
