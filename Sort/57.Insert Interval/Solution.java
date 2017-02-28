
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> list = new ArrayList<Interval>();
		for (Interval tmp : intervals) {
			if (newInterval == null || newInterval.start > tmp.end) {
				list.add(tmp);
			} else if (newInterval.end < tmp.start) {
				list.add(newInterval);
				list.add(tmp);
				newInterval = null;
			} else {
				newInterval.start = Math.min(newInterval.start, tmp.start);
				newInterval.end = Math.max(newInterval.end, tmp.end);
			}
		}
		if (newInterval != null) {
			list.add(newInterval);
		}
		return list;
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}
