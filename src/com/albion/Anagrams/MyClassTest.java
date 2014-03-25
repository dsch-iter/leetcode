package com.albion.Anagrams;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyClassTest {

	@DataProvider(name="data01")
	public Object[][] data()
	{
		String[] firstWords = {"cinema", "host", "aba", "train"};
		String[] secondWords = {"iceman", "shot", "shot", "rain" };
		
		return null;
	}
	
	
  //@Test(dataProvider="data01")
  public void check_anagrams() {

  }
}
