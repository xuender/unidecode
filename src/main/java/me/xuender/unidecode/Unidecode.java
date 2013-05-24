/**
 * 
 */
package me.xuender.unidecode;

import java.lang.reflect.Field;

/**
 * <p>
 * Transliterate Unicode string to a valid 7-bit ASCII String.
 * </p>
 * 
 * Reference python`s <a
 * href="https://pypi.python.org/pypi/Unidecode">Unidecode</a>
 * 
 * @author ender
 * 
 */
public final class Unidecode {
	/**
	 * Array to cache already loaded maps.
	 */
	private static final String[][] cache = new String[256][];

	/**
	 * Transliterate an Unicode object into an ASCII string.
	 * 
	 * @param str
	 *            Unicode String to transliterate.
	 * @return ASCII string.
	 */
	public static String decode(final String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int codepoint = str.codePointAt(i);
			// Basic ASCII
			if (codepoint < 0x80) {
				sb.append(c);
				continue;
			}
			// Characters in Private Use Area and above are ignored
			if (codepoint > 0xeffff)
				continue;
			int section = codepoint >> 8; // Chop off the last two hex digits
			int position = codepoint % 256; // Last two hex digits
			String[] table = getCache(section);
			if (table != null && table.length > position) {
				sb.append(table[position]);
			}
		}
		return sb.toString().trim();
	}

	@SuppressWarnings("rawtypes")
	private static String[] getCache(int section) {
		String[] ret = cache[section];
		if (ret == null) {
			try {
				Class c = Class.forName(String.format(
						"me.xuender.unidecode.X%03x", section));
				Field f = c.getDeclaredField("data");
				ret = (String[]) f.get(null);
				cache[section] = ret;
			} catch (ClassNotFoundException e) {
				// No match: ignore this character and carry on.
				cache[section] = new String[] {};
			} catch (Exception e) {
			}
		} else if (ret.length == 0) {
			return null;
		}
		return ret;
	}
}