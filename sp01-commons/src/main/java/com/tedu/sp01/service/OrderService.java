package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 通过订单Id获取订单信息
	 */
	Order getOrder(String orderId);
	/**
	 * 添加订单信息
	 */
	void addOrder(Order order);                                          
}
