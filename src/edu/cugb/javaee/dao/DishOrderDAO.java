package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.DishOrder;

/**
 * @Description 对订单进行增删改查等数据库操作的类 
 * @time 2020年11月13日 上午10:01:00 
 * @author 王瑞
 */
public class DishOrderDAO extends BaseDAO implements IDishOrderDAO{
	/**@Description 更新订单 
	 * @time 2020年11月13日 上午10:03:59 
	 * @author 王瑞
	 */
	@Override
	public int updateDishOrder(DishOrder dishOrder) {
		// TODO Auto-generated method stub
		String sql ="update dishorder set amount=?,orderdate=?,price=?,orderstatus=? where orderid=?";
		Object[] params = {dishOrder.getAmount(),dishOrder.getOrderDate(),dishOrder.getPrice(),dishOrder.getOrderStatus(),dishOrder.getOrderId()};
		return this.modifyObj(sql, params);
	}
	
	/**@Description 插入订单 
	 * @time 2020年11月13日 上午10:03:59 
	 * @author 王瑞
	 */
	@Override
	public int insertDishOrder(DishOrder dishOrder) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO dishorder(dishid,userid,amount,orderdate,price,orderstatus) VALUES (?,?,?,?,?,?);";
		Object[] params = {dishOrder.getDishId(),dishOrder.getUserId(),dishOrder.getAmount(),dishOrder.getOrderDate(),dishOrder.getPrice(),dishOrder.getOrderStatus()};
		return this.modifyObj(sql, params);
		
	}

	/**@Description 删除订单 
	 * @time 2020年11月13日 上午10:03:59 
	 * @author 王瑞
	 */
	@Override
	public int deleteDishOrder(DishOrder dishOrder) {
		// TODO Auto-generated method stub
		String sql ="delete from dishorder where orderid=?";
		Object[] params = {dishOrder.getOrderId()};
		return this.modifyObj(sql, params);
	}

	/**@Description 带参sql语句查询订单 
	 * @time 2020年11月13日 上午10:03:59 
	 * @author 王瑞 
	 */
	@Override
	public ArrayList<DishOrder> findDishOrderBy(String sql, Object[] params) {
		return this.findObjs(sql,params, Dish.class);
	}
	
	/**@Description  查询订单总数 
	 * @time 2020年11月13日 上午10:03:59 
	 * @author 王瑞 
	 */
	@Override
	public int getTotalDishOrderRecords() {
		String strsql = "select count(*) from dishorder";
		return getTotalRecords(strsql);
		
	}
	
	/**@Description 根据当前订单查询 
	 * @time 2020年11月13日 上午10:03:59 
	 * @author 王瑞
	 */
	@Override
	public ArrayList findDishOrder(DishOrder dishOrder) {
		String sql = "select * from dishorder where orderid=?";
		Object[] params = {dishOrder.getOrderId()};
		return this.findObjs(sql, params, Dish.class);
	}

	
	
}
