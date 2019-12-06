package junit.arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest4 {
	//Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

	@Test
	public void shouldReturnTrueWhenTripleUp() {
		int[] actual = new int[] {1, 4, 5, 6, 2};

		Arr arr = new Arr();
		assertTrue(arr.tripleUp(actual));
	}

	@Test
	public void shouldReturnFalseWhenNoTripleUp() {
		int[] actual = new int[] {1, 2, 4, 5, 7, 6, 5, 7, 7, 6};

		Arr arr = new Arr();
		assertFalse(arr.tripleUp(actual));
	}

	@Test
	public void shouldReturnFalseWhenEmpty() {
		int[] actual = new int[] {};

		Arr arr = new Arr();
		assertFalse(arr.tripleUp(actual));
	}


	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		int[] actual = null;

		Arr arr = new Arr();
		arr.tripleUp(actual);
	}

}
