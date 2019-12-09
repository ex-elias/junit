package junit.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest1 {
	//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    private Str str = new Str();

	@Test
	public void shouldReturnRequiredResultWhenNotEmpty() {
		String actual = "Bob";
		String expected = "Hello Bob!";
		assertEquals(expected, str.helloName(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenEmpty() {
		String actual = "";
		String expected = "Hello !";
		assertEquals(expected, str.helloName(actual));
	}

	@Test
	public void shouldReturnRequiredResultWhenNull() {
		String actual = null;
		String expected = "Hello null!";
		assertEquals(expected, str.helloName(actual));
	}

}
