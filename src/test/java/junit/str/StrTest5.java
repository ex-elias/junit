package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest5 {
	//Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
	//Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

	@Test
	public void shouldReturnRequiredResultWhenWord() {
		String[] actual = {"XY123XY", "XY"};
		String expected = "13";

		Str str = new Str();
		assertEquals(expected, str.wordEnds(actual[0], actual[1]));
	}

	@Test
	public void shouldReturnRequiredResultWhenTwoWords() {
		String[] actual = {"abcXY123XYijk", "XY"};
		String expected = "c13i";

		Str str = new Str();
		assertEquals(expected, str.wordEnds(actual[0], actual[1]));
	}

	@Test
	public void shouldReturnEmptyWhenEmpty() {
		String[] actual = {"", "XY"};
		String expected = "";

		Str str = new Str();
		assertEquals(expected, str.wordEnds(actual[0], actual[1]));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldReturnArrayIndexOutOfBoundsExceptionWhenNoWord() {
		String[] actual = {"asdf"};

		Str str = new Str();
		str.wordEnds(actual[0], actual[1]);
	}

	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		String actual[] = null;

		Str str = new Str();
		str.wordEnds(actual[0], actual[1]);
	}

}
