package junit.arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest5 {
	//This is slightly more difficult version of the famous FizzBuzz problems. (See: https://codingbat.com/prob/p153059)

	@Test
	public void shouldReturnRequiredResultWhenMultiplesOfThreeAndFive() {
		int[] actual = new int[] {1, 6};
		String[] expected = {"1", "2", "Fizz", "4", "Buzz"};

		Arr arr = new Arr();
		assertArrayEquals(expected, arr.fizzBuzz(actual[0], actual[1]));
	}

	@Test
	public void shouldReturnRequiredResultWhenNoMultiplesOfThreeAndFive() {
		int[] actual = new int[] {7, 9};
		String[] expected = {"7", "8"};

		Arr arr = new Arr();
		assertArrayEquals(expected, arr.fizzBuzz(actual[0], actual[1]));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldReturnArrayIndexOutOfBoundsExceptionWhenOnlyOneElement() {
		int[] actual = new int[] {2};

		Arr arr = new Arr();
		arr.fizzBuzz(actual[0], actual[1]);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldReturnArrayIndexOutOfBoundsExceptionWhenEmpty() {
		int[] actual = new int[] {};

		Arr arr = new Arr();
		arr.fizzBuzz(actual[0], actual[1]);
	}

	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		int[] actual = null;

		Arr arr = new Arr();
		arr.fizzBuzz(actual[0], actual[1]);
	}

}
