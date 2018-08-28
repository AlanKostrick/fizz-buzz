import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Let's play FizzBuzz!");
		System.out.println("Enter a positive number.");
		int userEnteredNumber = input.nextInt();

		FizzBuzz play = new FizzBuzz();

		System.out.println(play.response(userEnteredNumber));
		input.close();

	}

}
