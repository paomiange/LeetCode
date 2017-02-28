public class Solution {
	public String reverseString(String s) {
		char[] chars = s.toCharArray();
		int length = chars.length - 1;
		char tmp;
		for (int i = length; i > length / 2; i--) {
			tmp = chars[i];
			chars[i] = chars[length - i];
			chars[length - i] = tmp;
		}
		return new String(chars);
	}

}
