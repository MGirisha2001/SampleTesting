package Testing.SampleTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleProgramTest {
	
	@Test
	
	public void test() {
		String expected = "Java Programming";
		SampleProgram string = new SampleProgram();
		String actual = string.data();
		assertEquals(expected, actual);
	}

	@Test
	
	public void test2() {
		String expected = "Girisha";
		SampleProgram string = new SampleProgram();
		String actual = string.copy();
		assertEquals(expected,actual);
	}
	
	@Test
	
	public void test3() {
		String expected = "Jyothi";
		SampleProgram string = new SampleProgram();
		String actual = string.comp();
		assertEquals(expected,actual);
	}
	

}
