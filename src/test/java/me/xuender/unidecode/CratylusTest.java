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

    /**
     * 修正 朴 的读音，是 pu 不是 po
     */
    @Test
    public void testPu2() {
        assertEquals("P", Unidecode.initials("朴"));
        assertEquals("Pu", Unidecode.decode("朴"));
    }

    /**
     * 修正 价 的读音，是 jia 不是 jie
     */
    @Test
    public void testJia() {
        assertEquals("J", Unidecode.initials("价"));
        assertEquals("Jia", Unidecode.decode("价"));
    }

    /**
     * 修正 坏 的读音，是 huai 不是 pi
     */
    @Test
    public void testHuai() {
        assertEquals("H", Unidecode.initials("坏"));
        assertEquals("Huai", Unidecode.decode("坏"));
    }

    /**
     * 修正 盯 的读音，是 ding 不是 cheng
     */
    @Test
    public void testDing() {
        assertEquals("D", Unidecode.initials("盯"));
        assertEquals("Ding", Unidecode.decode("盯"));
    }

    /**
     * 修正 呆 的读音，是 dai 不是 ai
     */
    @Test
    public void testDai() {
        assertEquals("D", Unidecode.initials("呆"));
        assertEquals("Dai", Unidecode.decode("呆"));
    }

    /**
     * 修正 柜 的读音，是 gui 不是 ju
     */
    @Test
    public void testGui() {
        assertEquals("G", Unidecode.initials("柜"));
        assertEquals("Gui", Unidecode.decode("柜"));
    }

    /**
     * 修正 茧 的读音，是 jian 不是 chong
     */
    @Test
    public void testJian() {
        assertEquals("J", Unidecode.initials("茧"));
        assertEquals("Jian", Unidecode.decode("茧"));
    }

    /**
     * 修正 柏 的读音，是 bai 不是 bo
     */
    @Test
    public void testBai() {
        assertEquals("B", Unidecode.initials("柏"));
        assertEquals("Bai", Unidecode.decode("柏"));
    }

    /**
     * 修正 冒 的读音，是 mao 不是 mou
     */
    @Test
    public void testMao2() {
        assertEquals("M", Unidecode.initials("冒"));
        assertEquals("Mao", Unidecode.decode("冒"));
    }

    /**
     * 修正 适 的读音，是 shi 不是 gua
     */
    @Test
    public void testShi() {
        assertEquals("S", Unidecode.initials("适"));
        assertEquals("Shi", Unidecode.decode("适"));
    }
}