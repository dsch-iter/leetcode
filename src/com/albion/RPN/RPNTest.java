package com.albion.RPN;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RPNTest {

	@DataProvider(name ="data01")
	public Object[][] evalRPNDataProvider() {

		return new Object[][] {
				{
					new String[]{"2", "1", "+", "3", "*"}, 9
				}, 
				{
					new String[]{"4", "13", "5", "/", "+"}, 6
				}
		};
	}

	@Test(dataProvider="data01")
	public void evalRPN(String[] tokens, int expectedValue) {
		Solution sol = new Solution();
		int actualValue = sol.evalRPN(tokens);
		Assert.assertEquals(actualValue, expectedValue);
	}
}
