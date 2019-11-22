package com.training.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ThreadConsumer {
	public static Object[] printList(ArrayList<Integer> list) throws InterruptedException {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Thread thread = new Thread(() -> {
			list.forEach( i ->
				array.add(i));
			});
		thread.start();
		thread.join();
		return array.toArray();	
	}
	public static Consumer<ArrayList<Integer>> threading = list -> {
		int[] arr = new int[list.size()];
		Thread t = new Thread(() -> {
			int i = 0;
			while(i < list.size()) {
				arr[i] = list.get(i);
				i++;
			}
		});
		t.start();
	};

}
