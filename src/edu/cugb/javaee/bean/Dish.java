package edu.cugb.javaee.bean;

import java.math.BigDecimal;
/**
 * @Description
 * ��Ʒ�� 
 * @time 2020��11��13�� ����9:58:11 
 * @author ����
 */
public class Dish {
	
	private int dishId;//��Ʒ���
	private String dishName;//��Ʒ����
	private String dishInfo;//��Ʒ��Ϣ
	private BigDecimal unitPrice;//��Ʒ����
	private BigDecimal discount;//��Ʒ�ۿ�
	private String img;//��ƷͼƬ
	private int sellerId;//��Ʒ�������ұ��
	private int leftnum;//��Ʒʣ������
	
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishInfo() {
		return dishInfo;
	}
	public void setDishInfo(String dishInfo) {
		this.dishInfo = dishInfo;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getLeftnum() {
		return leftnum;
	}
	public void setLeftnum(int leftnum) {
		this.leftnum = leftnum;
	}
	
	
	
}
