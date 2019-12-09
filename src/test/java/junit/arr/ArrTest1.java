package junit.arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest1 {
	//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

    private Arr arr = new Arr();

	@Test
	public void shouldReturnTrueWhenSixIsLastElement() {
		int[] actual = new int[] {1, 2, 6};
		assertTrue(arr.firstLast6(actual));
	}

	@Test
	public void shouldReturnTrueWhenSixIsFirstElement() {
		int[] actual = new int[] {6, 1, 2, 3};
		assertTrue(arr.firstLast6(actual));
	}

	@Test
	public void shouldReturnFalseWhenFirstAndLastElementsAreNotSix() {
		int[] actual = new int[] {13, 6, 1, 2, 3};
		assertFalse(arr.firstLast6(actual));
	}

	@Test
	public void shouldReturnFalseWhenNoSix() {
		int[] actual = new int[] {3, 2, 1};
		boolean expected = false;
		assertEquals(expected, arr.firstLast6(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		int[] actual = null;
		arr.firstLast6(actual);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldReturnArrayIndexOutOfBoundsExceptionWhenEmpty() {
		int[] actual = new int[] {};
		arr.firstLast6(actual);
	}

}
