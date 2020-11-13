package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.Seller;

public interface ISellerDAO {
	/**
	 * @Description 更新商家所有的信息
	 * @time 2020年11月12日 下午9:13:47 
	 * @author ncq
	 */
	int updateSeller(Seller seller);
	/**
	 * @Description 更新商家的某几项信息
	 * @time 2020年11月13日 上午9:12:21 
	 * @author ncq
	 */
	int updateSellerBy(String sql,Object[] params);
	
	/**
	 * @Description 根据ID删除商家信息
	 * @time 2020年11月12日 下午9:16:42 
	 * @author ncq
	 */
	int deleteSeller(Seller seller);
	
	/**
	 * @Description 插入商家信息，若有空值则插入NULL
	 * @time 2020年11月12日 下午9:16:45 
	 * @author ncq
	 */
	int insertSeller(Seller seller);
	
	/**
	 * @Description 根据ID查询商家信息
	 * @time 2020年11月12日 下午9:14:27 
	 * @author ncq
	 */	
	ArrayList findSeller(Seller seller);
	/**
	 * @Description 根据某个信息查询商家信息
	 * @time 2020年11月13日 上午9:07:42 
	 * @author ncq
	 */
	public ArrayList<Seller> findSellerBy(String sql,Object[] params);
}
