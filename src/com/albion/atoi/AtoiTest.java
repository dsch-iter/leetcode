package com.albion.atoi;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtoiTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		Object[][] ret = new Object[][] {
//				{ "100", 100 }, 
				{ "-100", -100 } 
		
		};
		return ret;
	}

	@Test(dataProvider = "data01")
	public void atoi(String input, int expectedNumber) {
		
		Solution s = new Solution();
		int actual = s.atoi(input);
		Assert.assertEquals(actual, expectedNumber, "not equal");
	}
}
