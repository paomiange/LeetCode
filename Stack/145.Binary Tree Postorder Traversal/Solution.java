import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null) {
			return list;
		}
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			root = stack1.pop();
			if (root.left != null) {
				stack1.push(root.left);
			}
			if (root.right != null) {
				stack1.push(root.right);
			}
			stack2.push(root);
		}
		while (!stack2.isEmpty()) {
			list.add(stack2.pop().val);
		}
		return list;
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
