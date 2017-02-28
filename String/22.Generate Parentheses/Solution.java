import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		if (n <= 0) {
			return list;
		}
		helper(list, "", n, n);
		return list;
	}

	public static void helper(List<String> list, String str, int open, int close) {
		if (open < 0 || close < 0 || open > close) {
			return;
		}
		if (open == 0 && close == 0) {
			list.add(str);
			return;
		}
		helper(list, str + "(", open - 1, close);
		helper(list, str + ")", open, close - 1);
	}
}
