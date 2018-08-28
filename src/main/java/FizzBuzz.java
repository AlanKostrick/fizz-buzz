
public class FizzBuzz {

	public String response(int userEnteredNumber) {

		if (isValid(userEnteredNumber)) {
			return "Invalid";
		} else if (isFizzBuzz(userEnteredNumber)) {
			return "FizzBuzz";
		} else if (isFizz(userEnteredNumber)) {
			return "Fizz";
		} else if (isBuzz(userEnteredNumber)) {
			return "Buzz";
		}
		return "" + userEnteredNumber;
	}

	private boolean isBuzz(int userEnteredNumber) {
		return userEnteredNumber % 5 == 0;
	}

	private boolean isFizz(int userEnteredNumber) {
		return userEnteredNumber % 3 == 0;
	}

	private boolean isFizzBuzz(int userEnteredNumber) {
		return isFizz(userEnteredNumber) && isBuzz(userEnteredNumber);
	}

	private boolean isValid(int userEnteredNumber) {
		return userEnteredNumber <= 0;
	}

}
