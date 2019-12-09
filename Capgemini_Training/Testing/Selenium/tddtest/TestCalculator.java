package com.capgemini.seleniumjava.tddtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.seleniumjava.tdd.Calculator;

public class TestCalculator {

	@Test
	public void addTest() {
		int a = 20;
		int b = 30;
		int expected = 50;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void subTest() {
		int a = 30;
		int b = 10;
		int expected = 20;
		Calculator cal = new Calculator();
		int actual = cal.sub(a, b);
		Assert.assertEquals(expected, actual);
	}
}
