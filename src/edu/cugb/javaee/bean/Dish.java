package edu.cugb.javaee.bean;

import java.math.BigDecimal;
/**
 * @Description
 * 菜品类 
 * @time 2020年11月13日 上午9:58:11 
 * @author 王瑞
 */
public class Dish {
	
	private int dishId;//菜品编号
	private String dishName;//菜品名称
	private String dishInfo;//菜品信息
	private BigDecimal unitPrice;//菜品单价
	private BigDecimal discount;//菜品折扣
	private String img;//菜品图片
	private int sellerId;//菜品所属卖家编号
	private int leftnum;//菜品剩余数量
	
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
