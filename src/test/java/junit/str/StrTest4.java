package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest4 {
	//Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
	//So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

	@Test
	public void shouldReturnRequiredResultWhenSomeStars() {
		String actual = "sm**eil*ly";
		String expected = "siy";

		Str str = new Str();
		assertEquals(expected, str.starOut(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenSomeStarsSecondTest() {
		String actual = "sm***eil*ly*";
		String expected = "si";

		Str str = new Str();
		assertEquals(expected, str.starOut(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenStarOnlyAtFirst() {
		String actual = "*EPAM";
		String expected = "PAM";

		Str str = new Str();
		assertEquals(expected, str.starOut(actual));
	}

	@Test
	public void shouldReturnEmptyWhenOnlyStars() {
		String actual = "*****";
		String expected = "";

		Str str = new Str();
		assertEquals(expected, str.starOut(actual));
	}

	@Test
	public void shouldReturnEmptyWhenEmpty() {
		String actual = "";
		String expected = "";

		Str str = new Str();
		assertEquals(expected, str.starOut(actual));
	}

	@Test(expected = NullPointerException.class)
	public void shouldReturnNullPointerExceptionWhenNull() {
		String actual = null;

		Str str = new Str();
		str.starOut(actual);
	}

}
