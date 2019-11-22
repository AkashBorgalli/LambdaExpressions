package com.training.LambdaExpressions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapConvertor {
	public static StringBuilder convertMap(HashMap<String,String> map) {
		StringBuilder sb = new StringBuilder();
		Set<Entry<String, String>> set = map.entrySet();
		set.forEach(str -> {
			sb.append(str);
		});
	
		return sb;
		
	}

}
