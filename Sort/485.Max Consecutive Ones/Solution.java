public class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int times = 0;
		int maxnums = 0;
		for (int num : nums) {
			if (num == 1) {
				times++;
			} else {
				maxnums = maxnums > times ? maxnums : times;
				times = 0;
			}
		}
		maxnums = maxnums > times ? maxnums : times;
		return maxnums;
	}

}
