package com.training.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.trainiing.model.Order;

public class OrderCriteria {

	public static 	Function<ArrayList<Order>, ArrayList<Order>> validate = orders -> {
		ArrayList<Order> returnValidData =  orders.stream()
												  .filter(order -> order.getPrice() > 10000 && order.getStatus().equals("Accepted"))
												  .collect(Collectors.toCollection(ArrayList::new));

		return returnValidData;

		};
}
