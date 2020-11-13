package edu.cugb.javaee.bean;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @Description
 * 订单类 
 * @time 2020年11月13日 上午9:57:34 
 * @author 王瑞
 */
public class DishOrder {
	public int orderId;//订单编号
	public int dishId;//菜品编号
	public int userId;//用户编号
	public int amount;//菜品数量
	public String orderDate;//下单时间
	public BigDecimal price;//总计
	public String orderStatus;//订单状态
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
