package com.albion.Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyClassTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		String[] firstWords = { "cinema", "host", "aba", "train" };
		String[] secondWords = { "iceman", "shot", "shot", "rain" };

		return null;
	}

	// @Test(dataProvider="data01")
	@Test(expectedExceptions=java.lang.UnsupportedOperationException.class)
	public void testFixedList() {

		String[] firstWords = { "cinema", "host", "aba", "train" };
		List<String> x = Arrays.asList(firstWords);
		//List<String> x = new ArrayList<String>(Arrays.asList(firstWords));
		x.add("creme");
		
		for(String str: x)
		{
			System.out.println("str:"+str);
		}
	}
}
