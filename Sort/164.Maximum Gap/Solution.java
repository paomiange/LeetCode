public class Solution {
	/**
	 * 基数排序
	 */
	public int maximumGap(int[] nums) {
		if (nums.length < 2) {
			return 0;
		}
		// 获取数组中的最大值
		int maxnum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > maxnum) {
				maxnum = nums[i];
			}
		}
		// 新建排序后的结果数组
		int[] aux = new int[nums.length];
		// 从低位到高位的标识
		int exp = 1;// 1, 10, 100, 1000...
		// 排序时用来计数的数组位数
		int R = 10;
		while (maxnum / exp > 0) {// 从低位到高位，一位一位的排序，排序的趟数
			int[] count = new int[R];
			/***** 计数排序 ******/
			// 存储每一位的出现次数
			for (int i = 0; i < nums.length; i++) {
				count[(nums[i] / exp) % 10]++;
			}
			// 这里的存储空间是一维数组，按照出现次数，给排序后的数组预留出位置进行存储，如果count[0]=3,那么给值为0留出3个位置，count[1]就要从第四个位置开始预留
			for (int i = 1; i < count.length; i++) {
				count[i] += count[i - 1];
			}
			// 根据对应位的数字存储并将统计的个数减一，因为数组从0开始存储，个数从1开始计数，所以先--
			for (int i = nums.length - 1; i >= 0; i--) {
				aux[--count[(nums[i] / exp) % 10]] = nums[i];
			}
			/***/
			// 最后得出这一位的排序结果
			for (int i = 0; i < nums.length; i++) {
				nums[i] = aux[i];
			}
			exp *= 10;
		}
		// 根据排序后的结果算最大值
		int result = 0;
		for (int i = 1; i < aux.length; i++) {
			result = Math.max(result, aux[i] - aux[i - 1]);
		}
		return result;
	}

}
