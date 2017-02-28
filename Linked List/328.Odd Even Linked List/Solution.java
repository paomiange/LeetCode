public class Solution {
	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode odd = head;// 奇数指针
		ListNode even = head.next;// 偶数指针
		ListNode tmp = even;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = tmp;
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
