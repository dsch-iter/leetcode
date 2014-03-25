package com.albion.HasCycleList;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;


public class HasCycleTest {

	
	public ListNode generateNode(Integer[] input) {
		ListNode head = new ListNode(input[0]);
		ListNode cur = head;
	
		for (int i = 1; i < input.length; i++) {
			cur.next = new ListNode(input[i]);
			cur = cur.next;
		}
		return head;
	}

	public void makeCyclic(ListNode head)
	{
		ListNode cur = head;
		ListNode tail = null;
		while(cur != null)
		{
			if(cur.next == null)
			{
				tail = cur;
				tail.next = head;
				return;
			}
			cur = cur.next;
		}

	}
	
	
	@DataProvider(name = "data01")
	public Object[][] data() {
		Integer[] a1 = {1,2,3,4,5,6,7,8};
		Integer[] a2 = {1,2,3,4,5,6,7};
		Integer[] a3 = {1,2,3};
		Integer[] a4 = {1,2};
		Integer[] a5 = {-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5};
//		ListNode l1 = generateNode(a1);
//		ListNode l2 = generateNode(a2);
		ListNode l3 = generateNode(a5);
//		makeCyclic(l3);
		Object[][] ret = new Object[][]{ {l3}};
		
		return ret;
	}
  @Test(dataProvider = "data01")
  public void hasCycle(ListNode head) {
	  Solution s = new Solution();
	  boolean result = s.hasCycle(head);
	  Assert.assertEquals(result, false);
  }
}
