package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.Seller;

public interface ISellerDAO {
	/**
	 * @Description �����̼����е���Ϣ
	 * @time 2020��11��12�� ����9:13:47 
	 * @author ncq
	 */
	int updateSeller(Seller seller);
	/**
	 * @Description �����̼ҵ�ĳ������Ϣ
	 * @time 2020��11��13�� ����9:12:21 
	 * @author ncq
	 */
	int updateSellerBy(String sql,Object[] params);
	
	/**
	 * @Description ����IDɾ���̼���Ϣ
	 * @time 2020��11��12�� ����9:16:42 
	 * @author ncq
	 */
	int deleteSeller(Seller seller);
	
	/**
	 * @Description �����̼���Ϣ�����п�ֵ�����NULL
	 * @time 2020��11��12�� ����9:16:45 
	 * @author ncq
	 */
	int insertSeller(Seller seller);
	
	/**
	 * @Description ����ID��ѯ�̼���Ϣ
	 * @time 2020��11��12�� ����9:14:27 
	 * @author ncq
	 */	
	ArrayList findSeller(Seller seller);
	/**
	 * @Description ����ĳ����Ϣ��ѯ�̼���Ϣ
	 * @time 2020��11��13�� ����9:07:42 
	 * @author ncq
	 */
	public ArrayList<Seller> findSellerBy(String sql,Object[] params);
}
