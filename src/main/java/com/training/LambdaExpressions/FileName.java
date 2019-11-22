package com.training.LambdaExpressions;

import java.io.File;
import java.util.ArrayList;

public class FileName {
public static ArrayList<String> add(String path){
		
		File filePath = new File(path);
		ArrayList<String> fileFilter = new ArrayList<String>();
		//File[] files = filePath.listFiles((filter,string) -> filter.isFile());
		File[] files = filePath.listFiles();
		//System.out.println(files[0]);
		for(File file:files) {
			if(file.isFile())
				fileFilter.add(file.getName()+".txt");
		}
		return fileFilter;
		
	}
   public static void main(String[] args) {
		System.out.println(add("C:\\Users\\aborgall"));

	}


}
