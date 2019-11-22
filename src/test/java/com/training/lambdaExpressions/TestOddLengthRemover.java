/**
 * 
 */
package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.training.LambdaExpressions.OddLengthRemover;

/**
 * @author aborgall
 *
 */
public class TestOddLengthRemover {

ArrayList<String> data;
	
	@Before
	public void setUp() {
		data = new ArrayList<String>();
		data.add("Akashb");
		data.add("Odd");
		data.add("even");
		data.add("perfect");
	}
	
	@Test
	public void testWithValidInput() {
		String[] expected = {"Akashb","even"};
		assertArrayEquals(expected, OddLengthRemover.remove(data).toArray());
	}


}
