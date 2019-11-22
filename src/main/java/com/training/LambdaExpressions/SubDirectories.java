package com.training.LambdaExpressions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SubDirectories {

	public static ArrayList<String> getAllSubDirectory(String filePath) throws IOException {
		File fileObj = new File(filePath);
		ArrayList<String> paths = new ArrayList<String>();
	
		File[] files = fileObj.listFiles(File::isDirectory);
		for(File file:files) {
			paths.add(file.getPath());
		}
		return paths;
	}
	public static void main(String[] args) throws IOException {
		System.out.println(getAllSubDirectory("."));
	}


}
