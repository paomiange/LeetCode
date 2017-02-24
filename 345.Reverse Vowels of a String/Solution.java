public class Solution {
	public String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		int[] tmp = new int[s.length()];
		int index = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'
					|| chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
				tmp[index++] = i;
			}
		}
		for (int i = 0; i < index / 2; i++) {
			int j = index - 1 - i;
			char c = chars[tmp[i]];
			chars[tmp[i]] = chars[tmp[j]];
			chars[tmp[j]] = c;
		}
		return new String(chars);
	}
}
