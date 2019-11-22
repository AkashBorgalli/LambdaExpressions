package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.training.LambdaExpressions.UpperCaseLetters;

public class TestUppercase {

	ArrayList<String> letters;

	@Before
	public void setUp() {
		letters = new ArrayList<String>();
		letters.add("Akash");
		letters.add("Is");
		letters.add("Good");
		letters.add("developer");
	}

	@Test
	public void testWithValidInput() {
		String[] expected = {"AKASH","IS","GOOD","DEVELOPER"};
		assertArrayEquals(expected,UpperCaseLetters.convert(letters).toArray());
	}
}
