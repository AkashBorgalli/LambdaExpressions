/**
 * 
 */
package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.training.LambdaExpressions.SubDirectories;

/**
 * @author aborgall
 *
 */
public class TestSubdirecteroes {

	@Test
	public void testWithValidInput() throws IOException {
		System.out.println(SubDirectories.getAllSubDirectory("."));
	}

}
