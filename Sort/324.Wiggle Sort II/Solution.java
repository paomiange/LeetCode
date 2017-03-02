public class Solution {
	public void wiggleSort(int[] nums) {
		if (nums.length < 2) {
			return;
		}
		int[] tmp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			tmp[i] = nums[i];
		}
		quickSort(tmp, 0, tmp.length - 1);
		int mid = (nums.length + 1) >> 1;
		int tail = nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i % 2) == 0 ? tmp[--mid] : tmp[--tail];
		}
	}

	public void quickSort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		int low = start;
		int high = end;
		int key = nums[low];
		while (low < high) {
			while (low < high && nums[high] >= key) {
				high--;
			}
			nums[low] = nums[high];
			while (low < high && nums[low] <= key) {
				low++;
			}
			nums[high] = nums[low];
		}
		nums[low] = key;
		quickSort(nums, start, low);
		quickSort(nums, low + 1, end);
	}

}
