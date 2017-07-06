package Util;
import org.apache.commons.lang.StringUtils;

/** 
* @author caofei 
* @version 2017年6月16日 下午4:55:20 
* 
*/
public class Test {

	public static void main(String[] args) {
		String s1 = "abgabgeawgeabwwwg";

		System.out.println(coutSubString(s1, "ab"));

	}

	/**
	 * 判断子串出现的次数
	 * @param orgin
	 * @param sub
	 * @return
	 */
	public static int coutSubString(String orgin, String sub) {
		if (isBlank(orgin, sub)) {
			return 0;
		}
		StringBuilder sb = new StringBuilder(orgin);
		int count = 0;
		int subLength = sub.length();
		while (true) {
			int index = sb.indexOf(sub);
			if (index < 0) {
				break;
			}
			sb.replace(index, index + subLength, "");
			count++;
		}
		return count;
	}

	/**
	 * 判断多个字符串不为null、空
	 * @param strings
	 * @return
	 */
	public static boolean isNotBlank(String... strings) {
		for (String string : strings) {
			if (StringUtils.isBlank(string)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断多个字符是null/空
	 * @param strings
	 * @return
	 */
	public static boolean isBlank(String... strings) {
		return !isNotBlank(strings);
	}

}
