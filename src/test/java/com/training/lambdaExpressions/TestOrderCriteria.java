package com.training.lambdaExpressions;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.trainiing.model.Order;
import com.training.LambdaExpressions.OrderCriteria;

public class TestOrderCriteria {

	Order order1,order2,order3,order4,order5;
	ArrayList<Order> data;
	@Before
	public void setUp() {
		order1 = new Order(100000,"Accepted");
		order2 = new Order(6600, "NotAccepted");
		order3 = new Order(1099900, "NotAccepted");
		order4 = new Order(100000,"Accepted");
		order5 = new Order(500000, "Accepted");
		data = new ArrayList<Order>();
		data.add(order1);
		data.add(order2);
		data.add(order3);
		data.add(order4);
		data.add(order5);
	}
	
	@Test
	public void testWithValidInput() {
		Order[] expected = {order1,order4,order5};
		assertArrayEquals(expected, OrderCriteria.validate.apply(data).toArray());
	}

}
