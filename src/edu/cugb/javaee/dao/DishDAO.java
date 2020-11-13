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
 * @Description �Բ�Ʒ������ɾ�Ĳ�����ݿ����
 * @time 2020��11��12�� ����7:42:39 
 * @author ����
 */
public class DishDAO extends BaseDAO implements IDishDAO {
	/**
	 * @Description ���²�Ʒ
	 * @time 2020��11��12�� ����7:44:29 
	 * @author ����
	 */
	@Override
	public int updateDish(Dish dish) {
		// TODO Auto-generated method stub
		String sql ="update dish set dishname=?,dishinfo=?,unitprice=?,discount=?,img=?,leftnum=? where dishid=?";
		Object[] params = {dish.getDishName(),dish.getDishInfo(),dish.getUnitPrice(),dish.getDiscount(),dish.getImg(),dish.getLeftnum(),dish.getDishId()};
		return this.modifyObj(sql, params);
	}
	
	/**
	 * @Description �����Ʒ 
	 * @time 2020��11��12�� ����9:04:47 
	 * @author ����
	 */
	@Override
	public int insertDish(Dish dish) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO dish(dishname,dishinfo,unitprice,discount,img,sellerid,leftnum) VALUES (?,?,?,?,?,?,?);";
		Object[] params = {dish.getDishName(),dish.getDishInfo(),dish.getUnitPrice(),dish.getDiscount(),dish.getImg(),dish.getSellerId(),dish.getLeftnum()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description ɾ����Ʒ
	 * @time 2020��11��12�� ����10:59:59 
	 * @author ����
	 */
	@Override
	public int deleteDish(Dish dish) {
		// TODO Auto-generated method stub
		String sql ="delete from dish where dishid=?";
		Object[] params = {dish.getDishId()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description ���ݴ���sql����ѯ��Ʒ
	 * @time 2020��11��12�� ����7:44:50 
	 * @author ����
	 */
	@Override
	public ArrayList<Dish> findDishBy(String sql, Object[] params) {
		return this.findObjs(sql,params, Dish.class);
	}
	
	/**
	 * @Description ��ѯ��Ʒ����
	 * @time 2020��11��12�� ����7:46:57 
	 * @author ����
	 */
	@Override
	public int getTotalDishRecords() {
		String strsql = "select count(*) from dish";
		return getTotalRecords(strsql);
		
	}
	
	/**
	 * @Description ��ѯָ����Ʒ
	 * @time 2020��11��12�� ����7:47:35 
	 * @author ����
	 */
	@Override
	public ArrayList findDish(Dish dish) {
		String sql = "select * from dish where dishid=?";
		Object[] params = {dish.getDishId()};
		return this.findObjs(sql, params, Dish.class);
	}

	
}
