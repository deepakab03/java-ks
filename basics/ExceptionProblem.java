public class ExceptionProblem {

	public static void main(String[] args) {
		String inputString = "abc def ghk\nab3 def ghk\nkdi lkjs 343";
		ExceptionProblem exceptionProblem = new ExceptionProblem();

		try {
			exceptionProblem.valid(inputString);
		} catch (DeepakCustomCheckedEx ex) {
			ex.printStackTrace();
		}

		System.out.println("Validation over");
	}

	public void valid(String input) throws DeepakCustomCheckedEx {
		validateInput(input);
	}

	public void validateInput(String input) throws DeepakCustomCheckedEx {
		String[] lineArray = input.split("\n");
		for (String line: lineArray) {
			System.out.println("Line: " + line);

			try {
				if (checkCharIsNumberAt(line, 2)) {
					throw new DeepakUncheckedEx("Numeric character found at 3rd index in line: " + line);
				}
			} catch (DeepakUncheckedEx e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			validateIfThirdWordIsNumberIn(line);
		}
	}

	public boolean checkCharIsNumberAt(String str, int index) {
		return Character.isDigit(str.charAt(index));
	}

	public void validateIfThirdWordIsNumberIn(String line) throws DeepakCustomCheckedEx {
		String[] wordArray = line.split(" ");
		String thirdWord = wordArray[2];
		//ONE WAY
		/*char[] wordCharArray = thirdWord.toCharArray();
		int index = 0;
		boolean isNumber = true;
		for (int i =0; i < thirdWord.length(); i++) {
			isNumber = isNumber && checkCharIsNumberAt(thirdWord, index++);
		}
		if (isNumber) {
			throw new DeepakCustomCheckedEx();
		}*/

		//SECOND WAY
		/*try {
			Integer.parseInt(thirdWord);
			throw new DeepakCustomCheckedEx();
		} catch (NumberFormatException ex) {
		}*/

		//THIRD WAY
		String regEx = "\\d+";//"[0-9]+";
		if (thirdWord.matches(regEx)) {
			throw new DeepakCustomCheckedEx();
		}
	}

}