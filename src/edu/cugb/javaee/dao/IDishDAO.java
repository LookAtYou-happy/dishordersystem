package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;

public interface IDishDAO {
	/**
	 * @Description 更新菜品
	 * @time 2020年11月12日 下午8:58:52 
	 * @author 王瑞
	 */
	int updateDish(Dish dish);
	
	/**
	 * @Description 插入菜品 
	 * @time 2020年11月12日 下午8:59:55 
	 * @author 王瑞
	 */
	int insertDish(Dish dish);
	
	/**
	 * @Description  删除菜品 
	 * @time 2020年11月12日 下午9:00:11 
	 * @author 王瑞
	 */
	int deleteDish(Dish dish);
	
	/**
	 * @Description 查找当前菜品 
	 * @time 2020年11月12日 下午9:00:34 
	 * @author 王瑞
	 */
	ArrayList findDish(Dish dish);
	
	/**
	 * @Description 通过带参sql语句查询菜品 
	 * @time 2020年11月12日 下午9:01:06 
	 * @author 王瑞
	 */
	public ArrayList<Dish> findDishBy(String sql,Object[] params);
	
	/**
	 * @Description  查询菜品总数 
	 * @time 2020年11月12日 下午9:03:10 
	 * @author 王瑞
	 */
	public int getTotalDishRecords();
}
