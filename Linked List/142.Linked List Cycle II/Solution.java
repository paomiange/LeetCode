public class Solution {
	public ListNode detectCycle(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				while (head != slow) {
					slow = slow.next;
					head = head.next;
				}
				return slow;
			}
		}
		return null;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
