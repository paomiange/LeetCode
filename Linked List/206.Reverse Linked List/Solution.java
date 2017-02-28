public class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode node = head;
		while (node.next != null) {
			ListNode tmp = node.next.next;
			node.next.next = head;
			head = node.next;
			node.next = tmp;
		}
		return head;
	}

	public ListNode reverseList_other(ListNode head) {
		return reverseListInt(head, null);
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverseListInt(next, head);
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
