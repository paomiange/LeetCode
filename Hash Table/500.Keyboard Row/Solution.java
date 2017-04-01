package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	char[] words_one = new char[] { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P' };
	char[] words_two = new char[] { 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L' };
	char[] words_three = new char[] { 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
	Map<String, Integer> map = new HashMap<String, Integer>();

	public Solution() {
		for (int i = 0; i < words_one.length; i++) {
			map.put(String.valueOf(words_one[i]), 1);
			map.put(String.valueOf((char) (words_one[i] + 32)), 1);
		}
		for (int i = 0; i < words_two.length; i++) {
			map.put(String.valueOf(words_two[i]), 2);
			map.put(String.valueOf((char) (words_two[i] + 32)), 2);
		}
		for (int i = 0; i < words_three.length; i++) {
			map.put(String.valueOf(words_three[i]), 3);
			map.put(String.valueOf((char) (words_three[i] + 32)), 3);
		}
	}

	public String[] findWords(String[] words) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (isRow(words[i])) {
				result.add(words[i]);
			}
		}
		return result.toArray(new String[0]);
	}

	public boolean isRow(String word) {
		int row = 0;
		for (int i = 0; i < word.length(); i++) {
			if (i == 0) {
				row = map.get(String.valueOf(word.charAt(i)));
			} else if (map.get(String.valueOf(word.charAt(i))) != row) {
				return false;
			}
		}
		return true;
	}

}
