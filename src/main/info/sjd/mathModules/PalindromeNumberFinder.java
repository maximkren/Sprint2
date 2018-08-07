package main.info.sjd.mathModules;

public class PalindromeNumberFinder {


	public int getMaxPalindromeInResultOfMultiplication(int argument1, int argument2) {

		int result = argument1 * argument2;
		int iterator = 0;
		String resultAsString = Integer.toString(result);

		
		while (iterator <= resultAsString.length() / 2) {

			if (resultAsString.charAt(iterator) == resultAsString.charAt(resultAsString.length() - 1 - iterator)) {
				iterator++;
			} else {
				result--;
				resultAsString = Integer.toString(result);
				iterator = 0;
			}

		}

		return result;
	}

}
