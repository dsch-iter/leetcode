package com.albion.PowerOfFour;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerOfFourTest {


	@DataProvider(name = "dp")
	public Object[][] input(){
		Object[][] val = new Object[][] {
//				{4, true}, {8, false}, {16, true}
				{2047, false}
		};
		return val;
	}
	@Test(dataProvider = "dp")
	public void testFoo(int val, boolean expected) {
		PowerOfFour p = new PowerOfFour();
		boolean result = p.isPowerOfFour(val);
		System.out.println(result);
		Assert.assertEquals(result, expected);
	}
}
