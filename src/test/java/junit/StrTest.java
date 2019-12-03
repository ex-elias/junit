package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest {

	@Test
	public void testHelloName() {
		String[] tests = new String[] {"Bob", "Alice", "X", "Dolly", "Alpha", "Omega", "Goodbye", "ho ho ho", "xyz!", "Hello"};
		String[] expected = new String[] {"Hello Bob!", "Hello Alice!", "Hello X!", "Hello Dolly!", "Hello Alpha!", "Hello Omega!", "Hello Goodbye!", "Hello ho ho ho!", "Hello xyz!!", "Hello Hello!"};

		Str str = new Str();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], str.helloName(tests[i]));
		}
	}

	@Test
	public void testWithoutX2() {
		String[] tests = new String[] {"xHi", "Hxi", "Hi", "xxHi", "Hix", "xaxb", "xx", "x", "", "Hello", "Hexllo", "xHxllo"};
		String[] expected = new String[] {"Hi", "Hi", "Hi", "Hi", "Hix", "axb", "", "", "", "Hello", "Hexllo", "Hxllo"};

		Str str = new Str();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], str.withoutX2(tests[i]));
		}
	}

	@Test
	public void testDoubleChar() {
		String[] tests = new String[] {"The", "AAbb", "Hi-There", "Word!", "!!", "", "a", ".", "aa"};
		String[] expected = new String[] {"TThhee", "AAAAbbbb", "HHii--TThheerree", "WWoorrdd!!", "!!!!", "", "aa", "..", "aaaa"};

		Str str = new Str();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], str.doubleChar(tests[i]));
		}
	}

	@Test
	public void testStarOut() {
		String[] tests = new String[] {"ab*cd", "ab**cd", "sm*eilly", "sm*eil*ly", "sm**eil*ly", "sm***eil*ly", "stringy*", "*stringy", "*str*in*gy", "abc", "a*bc", "ab", "a*b", "a", "a*", "*a", "*", ""};
		String[] expected = new String[] {"ad", "ad", "silly", "siy", "siy", "siy", "string", "tringy", "ty", "abc", "c", "ab", "", "a", "", "", "", ""};

		Str str = new Str();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], str.starOut(tests[i]));
		}
	}

	@Test
	public void testWordEnds() {
		String[][] tests = new String[][] {{"abcXY123XYijk", "XY"}, {"XY123XY", "XY"}, {"XY1XY", "XY"}, {"XYXY", "XY"}, {"XY", "XY"}, {"Hi", "XY"}, {"", "XY"}, {"abc1xyz1i1j", "1"}, {"abc1xyz1", "1"}, {"abc1xyz11", "1"}, {"abc1xyz1abc", "abc"}, {"abc1xyz1abc", "b"}, {"abc1abc1abc", "abc"}};
		String[] expected = new String[] {"c13i", "13", "11", "XY", "", "", "", "cxziij", "cxz", "cxz11", "11", "acac", "1111"};

		Str str = new Str();
		for(int i = 0; i < tests.length; i++) {
			assertEquals(expected[i], str.wordEnds(tests[i][0], tests[i][1]));
		}
	}

}
