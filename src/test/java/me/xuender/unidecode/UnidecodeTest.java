/**
 * 
 */
package me.xuender.unidecode;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * @author ender
 * 
 */
public class UnidecodeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for
	 * {@link me.xuender.unidecode.Unidecode#decode(java.lang.String)}.
	 */
	@Test
	public void testDecode() {
		assertEquals("hello world", "Hello world.",
				Unidecode.decode("Hello world."));
		assertEquals("北京", "Bei Jing", Unidecode.decode("北京"));
		assertEquals("Κνωσός", "Knosos", Unidecode.decode("Κνωσός"));
		assertEquals("あみだにょらい", "amidaniyorai", Unidecode.decode("あみだにょらい"));
	}
}