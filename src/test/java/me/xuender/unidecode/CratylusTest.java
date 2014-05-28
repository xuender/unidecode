package me.xuender.unidecode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ender on 14-5-28.
 */
public class CratylusTest {
    /**
     * 修改万的拼音翻译错误的问题 万的拼音是wan，不是mo
     */
    @Test
    public void testWan() {
        assertEquals("W", Unidecode.initials("万"));
        assertEquals("Wan", Unidecode.decode("万"));
    }

    /**
     * 添加\u4e06 丆的读音，参考unicode.org的资料
     */
    @Test
    public void testHan() {
        assertEquals("H", Unidecode.initials("丆"));
        assertEquals("Han", Unidecode.decode("丆"));
    }

    /**
     * 添加\u4e4a 乊的读音
     */
    @Test
    public void testYi() {
        assertEquals("Y", Unidecode.initials("乊"));
        assertEquals("Yi", Unidecode.decode("乊"));
    }

    /**
     * 添加\u4e5b 乛的读音
     */
    @Test
    public void testYa() {
        assertEquals("Y", Unidecode.initials("乛"));
        assertEquals("Ya", Unidecode.decode("乛"));
    }

    /**
     * 添加\u4e65 乥的读音
     */
    @Test
    public void testHu() {
        assertEquals("H", Unidecode.initials("乥"));
        assertEquals("Hu", Unidecode.decode("乥"));
    }

    /**
     * 添加\u4e6e 乮的读音
     */
    @Test
    public void testMao() {
        assertEquals("M", Unidecode.initials("乮"));
        assertEquals("Mao", Unidecode.decode("乮"));
    }

    /**
     * 添加\u4e7d 乽的读音
     */
    @Test
    public void testZhe() {
        assertEquals("Z", Unidecode.initials("乽"));
        assertEquals("Zhe", Unidecode.decode("乽"));
    }

    /**
     * 添加\u4eaa 亪的读音
     */
    @Test
    public void testYe() {
        assertEquals("Y", Unidecode.initials("亪"));
        assertEquals("Ye", Unidecode.decode("亪"));
    }

    /**
     * 修正 厂 的读音，是 chang不是 han
     */
    @Test
    public void testChang() {
        assertEquals("C", Unidecode.initials("厂"));
        assertEquals("Chang", Unidecode.decode("厂"));
    }

    /**
     * 添加\u4ee9 仩的读音
     */
    @Test
    public void testShang() {
        assertEquals("S", Unidecode.initials("仩"));
        assertEquals("Shang", Unidecode.decode("仩"));
    }

    /**
     * 修正 亏 的读音，是 kui不是 yu
     */
    @Test
    public void testKui() {
        assertEquals("K", Unidecode.initials("亏"));
        assertEquals("Kui", Unidecode.decode("亏"));
    }

    /**
     * 修正 广 的读音，是 guang 不是 yan
     */
    @Test
    public void testGuang() {
        assertEquals("G", Unidecode.initials("广"));
        assertEquals("Guang", Unidecode.decode("广"));
    }

    /**
     * 修正 扑 的读音，是 pu不是 bu
     */
    @Test
    public void testPu() {
        assertEquals("P", Unidecode.initials("扑"));
        assertEquals("Pu", Unidecode.decode("扑"));
    }

    /**
     * 修正 术 的读音，是 shu不是 zhu
     */
    @Test
    public void testShu() {
        assertEquals("S", Unidecode.initials("术"));
        assertEquals("Shu", Unidecode.decode("术"));
    }

    /**
     * 修正 叶 的读音，是 ye不是 xie
     */
    @Test
    public void testYe2() {
        assertEquals("Y", Unidecode.initials("叶"));
        assertEquals("Ye", Unidecode.decode("叶"));
    }

    /**
     * 修正 叨 的读音，是 dao不是 tao
     */
    @Test
    public void testDao() {
        assertEquals("D", Unidecode.initials("叨"));
        assertEquals("Dao", Unidecode.decode("叨"));
    }

    /**
     * 修正 仔 的读音，是 zai不是 zi
     */
    @Test
    public void testZai() {
        assertEquals("Z", Unidecode.initials("仔"));
        assertEquals("Zai", Unidecode.decode("仔"));
    }

    /**
     * 修正 汉 的读音，是 han不是 yi
     */
    @Test
    public void testHan2() {
        assertEquals("H", Unidecode.initials("汉"));
        assertEquals("Han", Unidecode.decode("汉"));
    }

    /**
     * 修正 宁 的读音，是 ning不是 zhu
     */
    @Test
    public void testNing() {
        assertEquals("N", Unidecode.initials("宁"));
        assertEquals("Ning", Unidecode.decode("宁"));
    }
}
