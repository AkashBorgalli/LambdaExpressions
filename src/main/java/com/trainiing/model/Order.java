package com.trainiing.model;

public class Order {
	private long price;
	private String status;
	
	public Order() {
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public Order(long price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	
}
