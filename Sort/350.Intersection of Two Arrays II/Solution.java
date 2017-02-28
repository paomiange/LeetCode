import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> params = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			if (params.containsKey(nums1[i])) {
				params.put(nums1[i], params.get(nums1[i]).intValue() + 1);
			} else {
				params.put(nums1[i], 1);
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			if (params.containsKey(nums2[i])) {
				list.add(nums2[i]);
				if (params.get(nums2[i]).intValue() == 1) {
					params.remove(nums2[i]);
				} else {
					params.put(nums2[i], params.get(nums2[i]).intValue() - 1);
				}
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
