import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	
	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void assertThatCheckIsOneForOne() {
		String check = underTest.response(1);
		assertEquals("1", check);
	}

	@Test
	public void assertThatCheckIsTwoForTwo() {
		String check = underTest.response(2);
		assertEquals("2", check);
	}

	@Test
	public void assertThatCheckIsFizzForThree() {
		String check = underTest.response(3);
		assertEquals("Fizz", check);
	}

	@Test
	public void assertThatCheckIsBuzzForFive() {
		String check = underTest.response(5);
		assertEquals("Buzz", check);
	}

	@Test
	public void assertThatCheckIsFizzForSix() {
		String check = underTest.response(6);
		assertEquals("Fizz", check);
	}

	@Test
	public void assertThatCheckIsBuzzForTen() {
		String check = underTest.response(10);
		assertEquals("Buzz", check);
	}

	@Test
	public void assertThatCheckIsFizzBuzzForFifteen() {
		String check = underTest.response(15);
		assertEquals("FizzBuzz", check);
	}

	@Test
	public void assertThatCheckIsInvalidForZeroOrLess() {
		String check = underTest.response(0);
		assertEquals("Invalid", check);
	}

}
