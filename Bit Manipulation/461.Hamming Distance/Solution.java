
public class Solution {
	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	public int hammingDistance_other(int x, int y) {
		int tmp = x ^ y;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			count += (tmp >> i) & 1;
		}
		return count;
	}
}
