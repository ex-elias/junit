package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest2 {
	//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

	@Test
	public void shouldReturnRequiredResultWhenStartsWithXX() {
		String actual = "xxHi";
		String expected = "Hi";

		Str str = new Str();
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenXIsSecond() {
		String actual = "QxHi";
		String expected = "QHi";

		Str str = new Str();
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenNoXAtBeginning() {
		String actual = "HiQQ";
		String expected = "HiQQ";

		Str str = new Str();
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test
	public void shouldReturnEmptyWhenEmpty() {
		String actual = "";
		String expected = "";

		Str str = new Str();
		assertEquals(expected, str.withoutX2(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		String actual = null;

		Str str = new Str();
		str.withoutX2(actual);
	}

}
