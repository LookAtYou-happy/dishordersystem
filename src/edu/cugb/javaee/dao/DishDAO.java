package edu.cugb.javaee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.User;
import edu.cugb.javaee.utils.JDBCUtils;
/**
 * @Description 对菜品进行增删改查等数据库操作
 * @time 2020年11月12日 下午7:42:39 
 * @author 王瑞
 */
public class DishDAO extends BaseDAO implements IDishDAO {
	/**
	 * @Description 更新菜品
	 * @time 2020年11月12日 下午7:44:29 
	 * @author 王瑞
	 */
	@Override
	public int updateDish(Dish dish) {
		// TODO Auto-generated method stub
		String sql ="update dish set dishname=?,dishinfo=?,unitprice=?,discount=?,img=?,leftnum=? where dishid=?";
		Object[] params = {dish.getDishName(),dish.getDishInfo(),dish.getUnitPrice(),dish.getDiscount(),dish.getImg(),dish.getLeftnum(),dish.getDishId()};
		return this.modifyObj(sql, params);
	}
	
	/**
	 * @Description 插入菜品 
	 * @time 2020年11月12日 下午9:04:47 
	 * @author 王瑞
	 */
	@Override
	public int insertDish(Dish dish) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO dish(dishname,dishinfo,unitprice,discount,img,sellerid,leftnum) VALUES (?,?,?,?,?,?,?);";
		Object[] params = {dish.getDishName(),dish.getDishInfo(),dish.getUnitPrice(),dish.getDiscount(),dish.getImg(),dish.getSellerId(),dish.getLeftnum()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description 删除菜品
	 * @time 2020年11月12日 下午10:59:59 
	 * @author 王瑞
	 */
	@Override
	public int deleteDish(Dish dish) {
		// TODO Auto-generated method stub
		String sql ="delete from dish where dishid=?";
		Object[] params = {dish.getDishId()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description 根据带参sql语句查询菜品
	 * @time 2020年11月12日 下午7:44:50 
	 * @author 王瑞
	 */
	@Override
	public ArrayList<Dish> findDishBy(String sql, Object[] params) {
		return this.findObjs(sql,params, Dish.class);
	}
	
	/**
	 * @Description 查询菜品总数
	 * @time 2020年11月12日 下午7:46:57 
	 * @author 王瑞
	 */
	@Override
	public int getTotalDishRecords() {
		String strsql = "select count(*) from dish";
		return getTotalRecords(strsql);
		
	}
	
	/**
	 * @Description 查询指定菜品
	 * @time 2020年11月12日 下午7:47:35 
	 * @author 王瑞
	 */
	@Override
	public ArrayList findDish(Dish dish) {
		String sql = "select * from dish where dishid=?";
		Object[] params = {dish.getDishId()};
		return this.findObjs(sql, params, Dish.class);
	}

	
}
