public class Solution {
	public int hIndex(int[] citations) {
		int length = citations.length;
		int[] tmp = new int[length + 1];
		for (int i = 0; i < length; i++) {
			if (citations[i] > length) {
				tmp[length]++;
			} else {
				tmp[citations[i]]++;
			}
		}
		int h = 0;
		for (int i = tmp.length - 1; i >= 0; i--) {
			h += tmp[i];
			if (h >= i) {
				return i;
			}
		}
		return 0;
	}
}
