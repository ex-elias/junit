package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest3 {
	//Given a string, return a string where for every char in the original, there are two chars.

    private Str str = new Str();

	@Test
	public void shouldReturnRequiredResultWhenNotEmpty() {
		String actual = "AAbb";
		String expected = "AAAAbbbb";
		assertEquals(expected, str.doubleChar(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenNotEmptySecondTest() {
		String actual = "Epam is the best company!";
		String expected = "EEppaamm  iiss  tthhee  bbeesstt  ccoommppaannyy!!";
		assertEquals(expected, str.doubleChar(actual));
	}

	@Test
	public void shouldReturnEmptyWhenEmpty() {
		String actual = "";
		String expected = "";
		assertEquals(expected, str.doubleChar(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		String actual = null;
		str.doubleChar(actual);
	}

}
