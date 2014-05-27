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

	/**
	 * ArrayIndexOutOfBound exception
	 * 
	 * Schweigi opened this issue
	 * 
	 * If decode() is used with e.g. an emoticon character there is a
	 * ArrayIndexOutOfBound exception thrown.
	 * 
	 * Example text: http://www.scarfboy.com/coding/unicode-tool?s=U%2b1F61C
	 * 
	 * String[] ret = cache[section]; (Line: 63)
	 * 
	 * The reason is that on Line 52 int section = codepoint >> 8; the section
	 * will be bigger than 255 and therefore out of the cache area.
	 * 
	 * In my opinion there are two solution:
	 * 
	 * Either the cache is made bigger to contain all value up to 0xEFFFF or
	 * Characters with a value bigger (> 0xFFFF) than the cache should not be
	 * cached.
	 */
	@Test
	public void testIssues2() {
		assertEquals("", Unidecode.decode("😜"));
		assertEquals("H", Unidecode.decode("Ｈ"));
	}
    /**
     * 修改万的拼音翻译错误的问题 万的拼音是wan，不是mo
     */
    @Test
    public void testWan(){
        assertEquals("W", Unidecode.initials("万"));
        assertEquals("Wan", Unidecode.decode("万"));
    }
    /**
     * 添加\u4e06 丆的读音，参考unicode.org的资料
     */
    @Test
    public void testHan(){
        assertEquals("H", Unidecode.initials("丆"));
        assertEquals("Han", Unidecode.decode("丆"));
    }

    /**
     *添加\u4e4a 乊的读音
     */
    @Test
    public void testYi(){
        assertEquals("Y", Unidecode.initials("乊"));
        assertEquals("Yi", Unidecode.decode("乊"));
    }

    /**
     * 添加\u4e5b 乛的读音
     */
    @Test
    public void testYa(){
        assertEquals("Y", Unidecode.initials("乛"));
        assertEquals("Ya", Unidecode.decode("乛"));
    }

    /**
     * 添加\u4e65 乥的读音
     */
    @Test
    public void testHu(){
        assertEquals("H", Unidecode.initials("乥"));
        assertEquals("Hu", Unidecode.decode("乥"));
    }

    /**
     * 添加\u4e6e 乮的读音
     */
    @Test
    public void testMao(){
        assertEquals("M", Unidecode.initials("乮"));
        assertEquals("Mao", Unidecode.decode("乮"));
    }

    /**
     * 添加\u4e7d 乽的读音
     */
    @Test
    public void testZhe(){
        assertEquals("Z", Unidecode.initials("乽"));
        assertEquals("Zhe", Unidecode.decode("乽"));
    }

    /**
     * 添加\u4eaa 亪的读音
     */
    @Test
    public void testYe(){
        assertEquals("Y", Unidecode.initials("亪"));
        assertEquals("Ye", Unidecode.decode("亪"));
    }

    /**
     * 修正 厂 的读音，是 chang不是 han
     */
    @Test
    public void testChang(){
        assertEquals("C", Unidecode.initials("厂"));
        assertEquals("Chang", Unidecode.decode("厂"));
    }
    /**
     * 添加\u4ee9 仩的读音
     */
    @Test
    public void testShang(){
        assertEquals("S", Unidecode.initials("仩"));
        assertEquals("Shang", Unidecode.decode("仩"));
    }

    /**
     * Translate ≠ to !=, ≥ to >=, ≤ to <=
     */
    public void testUnequal(){
        assertEquals("!=", Unidecode.decode("≠"));
        assertEquals(">=", Unidecode.decode("≥"));
        assertEquals("<=", Unidecode.decode("≤"));
        assertEquals("!=", Unidecode.initials("≠"));
        assertEquals(">=", Unidecode.initials("≥"));
        assertEquals("<=", Unidecode.initials("≤"));
    }
}