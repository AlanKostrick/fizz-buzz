
public class FizzBuzz {

	public String response(int userEnteredNumber) {

		if (userEnteredNumber <= 0) {
			return "Invalid";
		} else if (userEnteredNumber % 3 == 0 && userEnteredNumber % 5 == 0) {
			return "FizzBuzz";
		} else if (userEnteredNumber % 3 == 0) {
			return "Fizz";
		} else if (userEnteredNumber % 5 == 0) {
			return "Buzz";
		}
		return "" + userEnteredNumber;
	}

}
