package com.albion.InsertionSort;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;

public class InsertionTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		ListNode t1 = new ListNode(3);
		ListNode t2 = new ListNode(2);
		ListNode t3 = new ListNode(4);

		t1.next = t2;
		t2.next = t3;
		t3.next = null;

		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(1);
		a1.next = a2;
		a2.next = null;
		
		ListNode b1 = new ListNode(3);
		ListNode b2 = new ListNode(4);
		ListNode b3 = new ListNode(1);
		
		b1.next = b2;
		b2.next = b3;
		b3.next = null;

		return new Object[][] {  {t1}, { a1 } , {b1}};
	}

	@Test(dataProvider = "data01")
	public void insertionSortList(ListNode p) {
		Solution s = new Solution();
		ListNode c = s.insertionSortList(p);
		s.print(c);
	}
	
	
}
