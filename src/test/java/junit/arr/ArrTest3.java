package junit.arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest3 {
	//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    private Arr arr = new Arr();

	@Test
	public void shouldReturnNumberOfEvenIntsWhenNotEmpty() {
		int[] actual = new int[] {2, 1, 2, 3, 4};
		int expected = 3;
		assertEquals(expected, arr.countEvens(actual));
	}

	@Test
	public void shouldReturnZeroWhenNotEmptyAndNoEvenInts() {
		int[] actual = new int[] {5, 1, 7, 3, 9};
		int expected = 0;
		assertEquals(expected, arr.countEvens(actual));
	}

	@Test
	public void shouldReturnZeroWhenEmpty() {
		int[] actual = new int[] {};
		int expected = 0;
		assertEquals(expected, arr.countEvens(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		int[] actual = null;
		arr.countEvens(actual);
	}

}
