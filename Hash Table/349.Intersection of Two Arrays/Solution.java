package com;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		Set<Integer> same = new HashSet<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				same.add(nums2[i]);
			}
		}
		int[] result = new int[same.size()];
		int i = 0;
		for (Integer tmp : same) {
			result[i++] = tmp;
		}
		return result;
	}

}
