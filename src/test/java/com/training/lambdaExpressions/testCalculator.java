package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.LambdaExpressions.CalculatorImpl;

public class testCalculator {

	@Test
	public void testaddition() {
		CalculatorImpl s = new CalculatorImpl();
		int result = s.add.calculate(2, 5);
		assertEquals(7, result);

	}
	@Test
	public void testsubstraction() {
		CalculatorImpl s = new CalculatorImpl();
		int result = s.sub.calculate(5, 2);
		assertEquals(3, result);

	}
	@Test
	public void testdivision() {
		CalculatorImpl s = new CalculatorImpl();
		int result = s.div.calculate(4, 2);
		assertEquals(2, result);

	}
	@Test
	public void testmultiply() {
		CalculatorImpl s = new CalculatorImpl();
		int result = s.mul.calculate(4, 2);
		assertEquals(8, result);

	}
}
