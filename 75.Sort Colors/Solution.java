
public class Solution {

	/**
	 * 快速排序
	 */
	public void sortColors(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
	}

	public static void quickSort(int[] data, int start, int end) {
		if (start < end) {
			int tmp = data[start];
			int i = start;
			int j = end;
			while (i < j) {
				while (data[j] >= tmp && j > i) {
					j--;
				}
				data[i] = data[j];

				while (data[i] <= tmp && i < j) {
					i++;
				}
				data[j] = data[i];
			}
			data[i] = tmp;
			quickSort(data, start, i - 1);// 递归调用
			quickSort(data, i + 1, end);
		}
	}

	public void sortColors_other(int[] nums) {
		int count0 = 0;
		int count1 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count0++;
			} else if (nums[i] == 1) {
				count1++;
			}
		}
		count1 += count0;
		for (int i = 0; i < nums.length; i++) {
			if (i < count0) {
				nums[i] = 0;
			} else if (i < count1) {
				nums[i] = 1;
			} else {
				nums[i] = 2;
			}
		}
	}

}
