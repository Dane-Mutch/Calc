package com.qa.calculator;



import org.junit.Test;
import org.junit.Assert;

public class DividerTest {
	private Divider divider;

	@Test
	public void test() {
		divider = new Divider(); 
		int expectedValue = 2;
		int actualValue = divider.divide(10, 5);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
