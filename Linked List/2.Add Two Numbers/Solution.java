package com;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode node = result;
		int next = 0;
		int sum = 0;
		while (l1 != null || l2 != null || next > 0) {
			sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + next;
			if (sum >= 10) {
				next = 1;
				sum -= 10;
			} else {
				next = 0;
			}
			node.next = new ListNode(sum);
			node = node.next;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
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
