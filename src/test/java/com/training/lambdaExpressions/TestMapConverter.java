package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.training.LambdaExpressions.MapConvertor;

public class TestMapConverter {
HashMap<String,String> map;
	
	@Before
	public void setUp() {
		map = new HashMap<String, String>();
		map.put("akash", "borgalli");
		map.put("dare", "venom");
	}
	
	@Test
	public void testWithValidInput() {
		
		String s = "akashborgalli";
		MapConvertor.convertMap(map);
		
	}
	

}
