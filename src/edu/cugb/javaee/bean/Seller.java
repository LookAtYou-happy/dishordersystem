package edu.cugb.javaee.bean;

import java.math.BigDecimal;

public class Seller {
	
	private int sellerId;	
	private String sellerName;
	private String phonenumber;
	private String selleraddress;
	private String sellerImg;
	private int score;
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getSelleraddress() {
		return selleraddress;
	}
	public void setSelleraddress(String selleraddress) {
		this.selleraddress = selleraddress;
	}
	public String getSellerImg() {
		return sellerImg;
	}
	public void setSellerImg(String sellerImg) {
		this.sellerImg = sellerImg;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", phonenumber=" + phonenumber
				+ ", selleraddress=" + selleraddress + ", sellerImg=" + sellerImg + ", score=" + score + "]";
	}
	

	
}
