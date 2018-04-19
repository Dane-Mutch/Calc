package com.qa.calculator;


import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {
	private Multiplier multiplier;

	@Test
	public void test() {
		multiplier = new Multiplier(); 
		int expectedValue = 10;
		int actualValue = multiplier.multiply(5, 2);
		Assert.assertEquals(expectedValue, actualValue);
		
	}

}
