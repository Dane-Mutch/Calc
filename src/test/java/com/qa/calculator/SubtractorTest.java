package com.qa.calculator;

import org.junit.Test;
import org.junit.Assert;

public class SubtractorTest {
	
	private Subtractor subtractor;

	@Test
	public void test() {
		subtractor = new Subtractor();
		int expectedValue = 2;
		int actualValue = subtractor.subtract(3, 1);
		Assert.assertEquals(expectedValue, actualValue);
		}

}
