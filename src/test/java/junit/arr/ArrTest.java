package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest {

	@Test
	public void testFirstLast6() {
		int[][] tests = new int[][] {{1, 2, 6}, {6, 1, 2, 3}, {13, 6, 1, 2, 3}, {13, 6, 1, 2, 6}, {3, 2, 1}, {3, 6, 1}, {3, 6}, {6}, {3}, {5, 6}, {5, 5}, {1, 2, 3, 4, 6}, {1, 2, 3, 4}};
		boolean[] expected = new boolean[] {true, true, false, true, false, false, true, true, false, true, false, true, false};

		Arr arr = new Arr();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], arr.firstLast6(tests[i]));
		}
	}

	@Test
	public void testFront11() {
		int[][][] tests = new int[][][] {{{1, 2, 3}, {7, 9, 8}}, {{1}, {2}}, {{1, 7}, {}}, {{}, {2, 8}}, {{}, {}}, {{3}, {1, 4, 1, 9}}, {{}, {1, 4, 1, 9}}};
		int[][] expected = new int[][] {{1, 7}, {1, 2}, {1}, {2}, {}, {3, 1}, {1}};

		Arr arr = new Arr();
		for(int i = 0; i < tests.length; i++) {
			assertArrayEquals(expected[i], arr.front11(tests[i][0], tests[i][1]));
		}
	}

	@Test
	public void testCountEvens() {
		int[][] tests = new int[][] {{2, 1, 2, 3, 4}, {2, 2, 0}, {1, 3, 5}, {}, {11, 9, 0, 1}, {2, 11, 9, 0}, {2}, {2, 5, 12}};
		int[] expected = new int[] {3, 3, 0, 0, 1, 2, 1, 2};

		Arr arr = new Arr();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], arr.countEvens(tests[i]));
		}
	}

	@Test
	public void testTripleUp() {
		int[][] tests = new int[][] {{1, 4, 5, 6, 2}, {1, 2, 3}, {1, 2, 4}, {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}, {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}, {1, 2}, {1}, {}, {10, 9, 8, -100, -99, -98, 100}, {10, 9, 8, -100, -99, 99, 100}, {-100, -99, -99, 100, 101, 102}, {2, 3, 5, 6, 8, 9, 2, 3}};
		boolean[] expected = new boolean[] {true, true, false, true, false, false, false, false, true, false, true, false};

		Arr arr = new Arr();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], arr.tripleUp(tests[i]));
		}
	}

	@Test
	public void testFizzBuzz() {
		int[][] tests = new int[][] {{1, 6}, {1, 8}, {1, 11}, {1, 16}, {1, 4}, {1, 2}, {50, 56}, {15, 17}, {30, 36}, {1000, 1006}, {99, 102}, {14, 20}};
		String[][] expected = new String[][] {{"1", "2", "Fizz", "4", "Buzz"}, {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, {"1", "2", "Fizz"}, {"1"}, {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}, {"FizzBuzz", "16"}, {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}, {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}, {"Fizz", "Buzz", "101"}, {"14", "FizzBuzz", "16", "17", "Fizz", "19"}};

		Arr arr = new Arr();
		for(int i = 0; i < tests.length; i++) {
			assertArrayEquals(expected[i], arr.fizzBuzz(tests[i][0], tests[i][1]));
		}
	}

}
