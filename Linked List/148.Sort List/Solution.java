class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	/**
	 * 链表归并排序
	 */
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode mid = findMiddle(head);
		ListNode left = sortList(mid.next);
		mid.next = null;
		ListNode right = sortList(head);
		return merge(right, left);
	}

	/**
	 * 找出中间的节点
	 */
	public ListNode findMiddle(ListNode node) {
		ListNode slow = node;
		ListNode fast = node.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	/**
	 * 对两组链表进行归并排序
	 */
	public ListNode merge(ListNode node1, ListNode node2) {
		ListNode list = new ListNode(0);
		ListNode tmp = list;
		while (node1 != null && node2 != null) {
			if (node1.val < node2.val) {
				tmp.next = node1;
				node1 = node1.next;
			} else {
				tmp.next = node2;
				node2 = node2.next;
			}
			tmp = tmp.next;
		}
		if (node1 != null) {
			tmp.next = node1;
		} else {
			tmp.next = node2;
		}
		return list.next;
	}
}
