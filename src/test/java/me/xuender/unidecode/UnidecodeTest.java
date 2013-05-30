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
		assertEquals("南无阿弥陀佛", "Nan Wu A Mi Tuo Fo", Unidecode.decode("南无阿弥陀佛"));
		assertEquals("Κνωσός", "Knosos", Unidecode.decode("Κνωσός"));
		assertEquals("あみだにょらい", "amidaniyorai", Unidecode.decode("あみだにょらい"));
	}

	/**
	 * Test method for
	 * {@link me.xuender.unidecode.Unidecode#decode(java.lang.String)}.
	 */
	@Test
	public void testDecodeException() {
		assertEquals("", "", Unidecode.decode(""));
		assertEquals("NULL", "", Unidecode.decode(null));
	}

	/**
	 * Test method for
	 * {@link me.xuender.unidecode.Unidecode#initials(java.lang.String)}.
	 */
	@Test
	public void testInitials() {
		assertEquals("hello world", "Hw", Unidecode.initials("Hello world."));
		assertEquals("南无阿弥陀佛", "NWAMTF", Unidecode.initials("南无阿弥陀佛"));
		assertEquals("Κνωσός", "K", Unidecode.initials("Κνωσός"));
		assertEquals("あみだにょらい", "a", Unidecode.initials("あみだにょらい"));
		assertEquals("enter", "XXGN\nQZQC\n\rTZHL\tSSC",
				Unidecode.initials("小小姑娘\n清早起床\n\r提着花篮\t上市场。"));
	}

	/**
	 * Test method for
	 * {@link me.xuender.unidecode.Unidecode#initials(java.lang.String)}.
	 */
	@Test
	public void testInitialsException() {
		assertEquals("", "", Unidecode.initials(""));
		assertEquals("NULL", "", Unidecode.initials(null));
	}
}