public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		return toBST(head, null);
	}

	public TreeNode toBST(ListNode head, ListNode tail) {
		if (head == tail) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		// 利用快慢指针找到中间节点
		while (fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
		}
		// mid左边是比它小的节点，mid右边是比它大的节点
		TreeNode mid = new TreeNode(slow.val);
		mid.left = toBST(head, slow);
		mid.right = toBST(slow.next, tail);
		return mid;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
