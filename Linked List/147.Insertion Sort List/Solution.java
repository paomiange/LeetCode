public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 排序后的链表
		ListNode result = new ListNode(0);
		ListNode tmp = null;
		while (head != null) {
			tmp = result;
			// 遍历结果链表找到大于当前的节点
			while (tmp.next != null && tmp.next.val < head.val) {
				tmp = tmp.next;
			}
			// 交换指针
			ListNode next = head.next;
			head.next = tmp.next;
			tmp.next = head;
			head = next;
		}
		return result.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
