package junit.arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest2 {
	//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

	@Test
	public void shouldReturnFirstElementFromEveryArrayWhenTheyAreNotEmpty() {
		int[][] actual = new int[][] {{1, 2, 3}, {7, 9, 8}};
		int[] expected = new int[] {1, 7};

		Arr arr = new Arr();
		assertArrayEquals(expected, arr.front11(actual[0], actual[1]));
	}

	@Test
	public void shouldReturnFirstElementFromFirstArrayWhenSecondIsEmpty() {
		int[][] actual = new int[][] {{1, 7}, {}};
		int[] expected = new int[] {1};

		Arr arr = new Arr();
		assertArrayEquals(expected, arr.front11(actual[0], actual[1]));
	}

	@Test
	public void shouldReturnEmptyWhenBothArraysAreEmpty() {
		int[][] actual = new int[][] {{}, {}};
		int[] expected = new int[] {};

		Arr arr = new Arr();
		assertArrayEquals(expected, arr.front11(actual[0], actual[1]));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenFirstElementIsNull() {
		int[][] actual = new int[][] {null, {}};

		Arr arr = new Arr();
		arr.front11(actual[0], actual[1]);
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenBothArraysAreNull() {
		int[][] actual = new int[][] {null, null};

		Arr arr = new Arr();
		arr.front11(actual[0], actual[1]);
	}

}
