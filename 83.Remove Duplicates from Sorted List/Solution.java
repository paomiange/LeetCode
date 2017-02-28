public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode node = head;
		while (node.next != null) {
			if (node.val == node.next.val) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
		}
		return head;
	}

	public ListNode deleteDuplicates_other(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
