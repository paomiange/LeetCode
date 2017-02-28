import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals == null || intervals.size() < 1) {
			return intervals;
		}
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		List<Interval> result = new ArrayList<Interval>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for (Interval interval : intervals) {
			if (interval.start <= end)
				end = Math.max(end, interval.end);
			else {
				result.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}

	public static void main(String[] args) {
		Interval a = new Interval(1, 4);
		List<Interval> list = new ArrayList<Interval>();
		list.add(a);
		list.add(a);
		System.out.println(list.size());
		list = new Solution().merge(list);
		System.out.println(list.size());
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
