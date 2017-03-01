public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node = new ListNode(0);
		node.next = head;
		ListNode slow = node;
		ListNode fast = node;
		while (fast.next != null) {
			if (n <= 0) {
				slow = slow.next;
			}
			fast = fast.next;
			n--;
		}
		if (slow.next != null) {
			slow.next = slow.next.next;
		}
		return node.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
