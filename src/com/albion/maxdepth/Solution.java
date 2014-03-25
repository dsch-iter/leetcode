package com.albion.maxdepth;

import java.util.Stack;

import com.albion.core.TreeNode;

public class Solution {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public int maxDepth2(TreeNode r) {
		int depth = 0;
		Stack<TreeNode> wq = new Stack<TreeNode>();
		Stack<TreeNode> path = new Stack<TreeNode>();

		wq.push(r);
		while (!wq.empty()) {
			r = wq.peek();
			if (!path.empty() && r == path.peek()) {
				if (path.size() > depth)
					depth = path.size();
				path.pop();
				wq.pop();
			} else {
				path.push(r);
				if (r.right != null)
					wq.push(r.right);
				if (r.left != null)
					wq.push(r.left);
			}
		}

		return depth;
	}
}
