/**
 * 
 */
package me.xuender.unidecode;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * @author <a href="mailto:xuender@gmail.com">ender</a>
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

	/**
	 * Test method for
	 * {@link me.xuender.unidecode.Unidecode#initials(java.lang.String)}.
	 */
	@Test
	public void testInitials() {
		assertEquals("hello world", "Hw", Unidecode.initials("Hello world."));
		assertEquals("北京", "BJ", Unidecode.initials("北京"));
		assertEquals("Κνωσός", "K", Unidecode.initials("Κνωσός"));
		assertEquals("あみだにょらい", "a", Unidecode.initials("あみだにょらい"));
		assertEquals("enter", "BJ\nSSD\n\rTS\tYSGD",
				Unidecode.initials("北京\n是首都\n\r同时\t也是古都"));
	}
}