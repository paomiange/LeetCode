public class Solution {

	public int longestValidParentheses(String s) {
		if (s.length() < 2) {
			return 0;
		}
		int maxnum = 0;
		int[] dp = new int[s.length()];
		for (int i = s.length() - 2; i >= 0; i--) {
			if (s.charAt(i) == ')') {
				dp[i] = 0;
			} else {
				int nextIndex = i + dp[i + 1] + 1;
				if (nextIndex < s.length() && s.charAt(nextIndex) == ')') {
					dp[i] = dp[i + 1] + 2;
					if (nextIndex + 1 < s.length()) {
						dp[i] += dp[nextIndex + 1];
					}
				}
			}
			maxnum = Math.max(maxnum, dp[i]);
		}
		return maxnum;
	}
}
