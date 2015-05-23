package com.demo.enumdemo;

public class OrderStatus {

	private int orderId;
	private String address;
	private OrderContantsEnum orderStatus;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public OrderContantsEnum getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderContantsEnum orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderStatus [orderId=" + orderId + ", address=" + address
				+ ", orderStatus=" + orderStatus + "]";
	}


	
}
