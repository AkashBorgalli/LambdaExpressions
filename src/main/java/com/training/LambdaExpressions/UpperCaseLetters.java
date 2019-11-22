package com.training.LambdaExpressions;

import java.util.ArrayList;

public class UpperCaseLetters {
	public static ArrayList<String> convert(ArrayList<String> letters) {
		letters.replaceAll(string -> string.toUpperCase());
		return letters;
}
}