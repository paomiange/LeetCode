public class Solution {
	public String largestNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				String a = nums[i] + "" + nums[j];
				String b = nums[j] + "" + nums[i];
				if (a.compareTo(b) < 0) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		if (nums[0] == 0) {
			return "0";
		}
		StringBuffer result = new StringBuffer();
		for (int tmp : nums) {
			result.append(tmp);
		}
		return result.toString();
	}

}
