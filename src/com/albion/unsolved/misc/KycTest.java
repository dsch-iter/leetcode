package com.albion.unsolved.misc;

import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.Utils;


public class KycTest {

	@Test
	public void test01()
	{
		ListNode x = Utils.generateList(new Integer[]{4,3,5,2,1});
		ListNode s = search(x, 3);
//		if(s!=null)
//		{			
//			System.out.println("s.val: "+s.val);
//		}
//		else{
//			System.out.println("not found");
//		}
		
		System.out.println("head.val <4> "+x.val);
	}
	
	public ListNode search(ListNode head, Integer look)
	{
		System.out.println("head.val <2> "+head.val);
		for(ListNode p = head; p!=null; p=p.next)
		{
			if(p.val == look)
			{
//				p.val = p.val + 100;
				head = head.next;
				System.out.println("head.val <3> "+head.val);
				return p;
			}
		}
		return null;
	}
}
