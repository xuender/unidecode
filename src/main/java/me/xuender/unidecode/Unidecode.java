/**
 * 
 */
package me.xuender.unidecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * Transliterate Unicode string to a valid 7-bit ASCII String.
 * </p>
 * 
 * @see <a href="https://pypi.python.org/pypi/Unidecode">Python`s Unidecode</a>
 * @see <a href="https://github.com/xuender/unidecode">Unidecode at
 *      github.com</a>
 * @author <a href="mailto:xuender@gmail.com">ender</a>
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
		if (str == null) {
			return "";
		}
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

	private static String[] getCache(int section) {
		String[] ret = cache[section];
		if (ret == null) {
			InputStream inStream = null;
			try {
				inStream = Unidecode.class.getResourceAsStream(String.format(
						"/data/X%03x", section));
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(inStream));
				String line = null;
				ret = new String[256];
				int i = 0;
				while ((line = reader.readLine()) != null) {
					ret[i] = line;
					i++;
				}
				cache[section] = ret;
			} catch (Exception e) {
				// No match: ignore this character and carry on.
				cache[section] = new String[] {};
			} finally {
				if (inStream != null) {
					try {
						inStream.close();
					} catch (IOException e) {
					}
				}
			}
		} else if (ret.length == 0) {
			return null;
		}
		return ret;
	}

	/**
	 * Transliterate Unicode string to a initials.
	 * 
	 * @param str
	 *            Unicode String to initials.
	 * @return String initials.
	 */
	public static String initials(final String str) {
		if (str == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("^\\w|\\s+\\w");
		Matcher m = p.matcher(decode(str));
		while (m.find()) {
			sb.append(m.group().replaceAll(" ", ""));
		}
		return sb.toString();
	}

	private Unidecode() {
	}
}