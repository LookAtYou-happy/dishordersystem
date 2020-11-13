package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.DishOrder;

public interface IDishOrderDAO {

	/**
	 * @Description  更新订单
	 * @time 2020年11月12日 下午7:44:29 
	 * @author 王瑞
	 */
	int updateDishOrder(DishOrder dish);

	/**
	 * @Description 插入订单
	 * @time 2020年11月12日 下午9:04:47 
	 * @author 王瑞
	 */
	int insertDishOrder(DishOrder dish);

	/**
	 * @Description  删除订单
	 * @time 2020年11月12日 下午10:59:59 
	 * @author 王瑞
	 */
	int deleteDishOrder(DishOrder dish);

	/**
	 * @Description 根据带参sql语句查询订单
	 * @time 2020年11月12日 下午7:44:50 
	 * @author 王瑞
	 */
	ArrayList<DishOrder> findDishOrderBy(String sql, Object[] params);

	/**
	 * @Description 查询订单总数
	 * @time 2020年11月12日 下午7:46:57 
	 * @author 王瑞
	 */
	int getTotalDishOrderRecords();

	/**
	 * @Description  查询指定订单
	 * @time 2020年11月12日 下午7:47:35 
	 * @author 王瑞
	 */
	ArrayList findDishOrder(DishOrder dish);

}