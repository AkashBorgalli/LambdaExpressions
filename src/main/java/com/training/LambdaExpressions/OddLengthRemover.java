/**
 * 
 */
package com.training.LambdaExpressions;

import java.util.ArrayList;

/**
 * @author aborgall
 *
 */
public class OddLengthRemover {
	public static ArrayList<String> remove(ArrayList<String> mylist) {
		mylist.removeIf(i -> i.length() % 2 != 0);
		return mylist;
	};

}
