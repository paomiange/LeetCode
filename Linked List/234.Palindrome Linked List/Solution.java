public class Solution {
	public boolean isPalindrome(ListNode head) {
		if (head == null) {
			return true;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// 如果是奇数个节点，那么慢指针此时在链表的中点上，需要后置一位
		if (fast != null) {
			slow = slow.next;
		}
		slow = rev(slow, null);
		while (head != slow && slow != null) {
			if (head.val != slow.val) {
				return false;
			}
			head = head.next;
			slow = slow.next;
		}
		return true;
	}

	public ListNode rev(ListNode head, ListNode newhead) {
		if (head == null) {
			return newhead;
		}
		ListNode next = head.next;
		head.next = newhead;
		return rev(next, head);
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
