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

	/**
	 * 2013-09-06 17:57
	 * 
	 * 你好，最近在项目中使用Unidecode，把用户名转拼音后的声母取出来，发现在转换“一”这个字的时候结果有问题 String pinyin =
	 * Unidecode.decode("一条会走路的鱼"); System.out.print(pinyin.charAt(0)); 输出结果为：[
	 * 怎么办？
	 */
	@Test
	public void testDecodeYi() {
		assertEquals("何清宝提出的bug", "Yi Tiao Hui Zou Lu De Yu",
				Unidecode.decode("一条会走路的鱼"));
	}

	/**
	 * 检查全部汉字是否还有[开头的情况
	 */
	@Test
	public void testAll() {
		int a = (int) (4 * Math.pow(16, 3) + 14 * Math.pow(16, 2)); // 汉字ASCII码最小值
		int b = (int) (9 * Math.pow(16, 3) + 15 * Math.pow(16, 2) + 10 * Math
				.pow(16, 1)) + 5; // 汉字ASCII码最大值
		for (int i = a; i <= b; i++) {
			assertNotEquals("不是[开头", "[", Unidecode.decode((char) i + "")
					.charAt(0));
		}
	}
}