package com.albion.HasCycleList;

import com.albion.core.ListNode;

public class Solution {
	public boolean hasCycle(ListNode head) {

		if (head == null || head.next == null) {
			return false;
		}

		ListNode c1 = head;
		ListNode c2 = c1;

		while (c2 != null) {
			c2 = travel(c2,3);
			if (c2 == null) {
				return false;
			}
			c1 = travel(c1, 1);
			if (c1 == null) {
				return false;
			}
			if (c1 == c2) {
				System.out.println("c1: "+c1.val + " c2: "+c2.val);
				return true;
			}
			else{
				System.out.println("c1: "+c1.val + " c2: "+c2.val);
			}
		}

		return false;
	}

	public ListNode travel(ListNode n, int steps) {
		ListNode cur = n;
		if (n == null)
			return null;

		for (int i = 0; i < steps; i++) {
			cur = cur.next;
			if (cur == null)
				return null;
			if (i == steps - 1)
				return cur;
		}

		return cur;
	}

	// public boolean currentNodeHasCycle(ListNode thisNode) {
	// if (thisNode == null || thisNode.next == null) {
	// return false;
	// }
	//
	// ListNode cur = thisNode.next;
	//
	// while (cur != null) {
	// if (cur == thisNode) {
	// return true;
	// }
	// cur = cur.next;
	// }
	//
	// return false;
	// }
}
