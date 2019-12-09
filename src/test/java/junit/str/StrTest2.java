package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest2 {
	//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

    private Str str = new Str();

	@Test
	public void shouldReturnRequiredResultWhenStartsWithXX() {
		String actual = "xxHi";
		String expected = "Hi";
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenXIsSecond() {
		String actual = "QxHi";
		String expected = "QHi";
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenNoXAtBeginning() {
		String actual = "HiQQ";
		String expected = "HiQQ";
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test
	public void shouldReturnEmptyWhenEmpty() {
		String actual = "";
		String expected = "";
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		String actual = null;
		str.withoutX2(actual);
	}

}
