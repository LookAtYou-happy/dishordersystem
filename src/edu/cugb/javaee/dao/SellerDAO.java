package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Seller;

public class SellerDAO extends BaseDAO implements ISellerDAO{
	/**
	 * @Description �����̼�
	 * @time 2020��11��12�� ����9:20:46 
	 * @author ncq
	 */
	@Override
	public int updateSeller(Seller seller) {
		String sql = "update seller set sellername=?,phonenumber=?,selleraddress=?,sellerimg=?,score=? where sellerid=?";
		Object[] params = {seller.getSellerName(),seller.getPhonenumber(),seller.getSelleraddress(),seller.getSellerImg(),seller.getScore(),seller.getSellerId()};
		return this.modifyObj(sql, params);
	}
	/**
	 * @Description �����̼ҵ�ĳ����Ϣ
	 * @time 2020��11��13�� ����9:17:12 
	 * @author ncq
	 */
	@Override
	public int updateSellerBy(String sql, Object[] params) {
		return this.modifyObj(sql, params);
	}
	/**
	 * @Description ����IDɾ���̼���Ϣ
	 * @time 2020��11��13�� ����9:15:19 
	 * @author ncq
	 */
	@Override
	public int deleteSeller(Seller seller) {
		String sql = "delete from seller where sellerid=?";
		Object[] params = {seller.getSellerId()};
		return this.modifyObj(sql, params);
	}
	/**
	 * @Description �����̼�������Ϣ���п�ֵ����NULL
	 * @time 2020��11��13�� ����9:15:46 
	 * @author ncq
	 */
	@Override
	public int insertSeller(Seller seller) {
		String sql = "insert into seller(sellername,phonenumber,selleraddress,sellerimg,score) values(?,?,?,?,?)";
		Object[] params = {seller.getSellerName(),seller.getPhonenumber(),seller.getSelleraddress(),seller.getSellerImg(),seller.getScore()};
		return this.modifyObj(sql, params);
	}
	/**
	 * @Description ����ID��ѯ�̼���Ϣ
	 * @time 2020��11��13�� ����9:16:19 
	 * @author ncq
	 */
	@Override
	public ArrayList findSeller(Seller seller) {
		String sql = "select * from seller where sellerid=?";
		Object[] params = {seller.getSellerId()};
		return this.findObjs(sql, params, Seller.class);
	}
	/**
	 * @Description ����ĳ����Ϣ��ѯ�̼�
	 * @time 2020��11��13�� ����9:16:41 
	 * @author ncq
	 */
	@Override
	public ArrayList<Seller> findSellerBy(String sql, Object[] params) {
		return this.findObjs(sql,params, Seller.class);
	}
	

}
