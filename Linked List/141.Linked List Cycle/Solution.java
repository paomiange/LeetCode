public class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			if (fast.next == slow || fast == slow) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
