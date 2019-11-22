package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.training.LambdaExpressions.ThreadConsumer;

public class TestThreadConsumer {
	ArrayList<Integer> list;
	@Before
	public void setUp() {
		list = new ArrayList<Integer>();
		list.add(78);
		list.add(10);
		list.add(13);
		list.add(66);
	}
	
	@Test
	public void testWithValidInput() throws InterruptedException {
		Object[] expected = {78,10,13,66};
		assertArrayEquals(expected, ThreadConsumer.printList(list));
	}
}
