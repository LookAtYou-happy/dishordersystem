package edu.cugb.javaee.bean;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @Description
 * ������ 
 * @time 2020��11��13�� ����9:57:34 
 * @author ����
 */
public class DishOrder {
	public int orderId;//�������
	public int dishId;//��Ʒ���
	public int userId;//�û����
	public int amount;//��Ʒ����
	public String orderDate;//�µ�ʱ��
	public BigDecimal price;//�ܼ�
	public String orderStatus;//����״̬
	
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
