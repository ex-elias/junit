package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest3 {
	//Given a string, return a string where for every char in the original, there are two chars.

	@Test
	public void shouldReturnRequiredResultWhenNotEmpty() {
		String actual = "AAbb";
		String expected = "AAAAbbbb";

		Str str = new Str();
		assertEquals(expected, str.doubleChar(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenNotEmptySecondTest() {
		String actual = "Epam is the best company!";
		String expected = "EEppaamm  iiss  tthhee  bbeesstt  ccoommppaannyy!!";

		Str str = new Str();
		assertEquals(expected, str.doubleChar(actual));
	}

	@Test
	public void shouldReturnEmptyWhenEmpty() {
		String actual = "";
		String expected = "";

		Str str = new Str();
		assertEquals(expected, str.doubleChar(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		String actual = null;

		Str str = new Str();
		str.doubleChar(actual);
	}

}
