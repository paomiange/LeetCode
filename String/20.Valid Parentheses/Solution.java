public class Solution {
	public boolean isValid(String s) {
		char[] chars = new char[s.length() / 2 + 1];
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				chars[j++] = c;
			} else if (c == ')' && (j == 0 || chars[j - 1] != '(')) {
				return false;
			} else if (c == ']' && (j == 0 || chars[j - 1] != '[')) {
				return false;
			} else if (c == '}' && (j == 0 || chars[j - 1] != '{')) {
				return false;
			} else {
				j--;
			}
		}
		if (j != 0) {
			return false;
		}
		return true;
	}
}
