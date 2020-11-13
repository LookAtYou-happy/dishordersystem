package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.DishOrder;

/**
 * @Description �Զ���������ɾ�Ĳ�����ݿ�������� 
 * @time 2020��11��13�� ����10:01:00 
 * @author ����
 */
public class DishOrderDAO extends BaseDAO implements IDishOrderDAO{
	/**@Description ���¶��� 
	 * @time 2020��11��13�� ����10:03:59 
	 * @author ����
	 */
	@Override
	public int updateDishOrder(DishOrder dishOrder) {
		// TODO Auto-generated method stub
		String sql ="update dishorder set amount=?,orderdate=?,price=?,orderstatus=? where orderid=?";
		Object[] params = {dishOrder.getAmount(),dishOrder.getOrderDate(),dishOrder.getPrice(),dishOrder.getOrderStatus(),dishOrder.getOrderId()};
		return this.modifyObj(sql, params);
	}
	
	/**@Description ���붩�� 
	 * @time 2020��11��13�� ����10:03:59 
	 * @author ����
	 */
	@Override
	public int insertDishOrder(DishOrder dishOrder) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO dishorder(dishid,userid,amount,orderdate,price,orderstatus) VALUES (?,?,?,?,?,?);";
		Object[] params = {dishOrder.getDishId(),dishOrder.getUserId(),dishOrder.getAmount(),dishOrder.getOrderDate(),dishOrder.getPrice(),dishOrder.getOrderStatus()};
		return this.modifyObj(sql, params);
		
	}

	/**@Description ɾ������ 
	 * @time 2020��11��13�� ����10:03:59 
	 * @author ����
	 */
	@Override
	public int deleteDishOrder(DishOrder dishOrder) {
		// TODO Auto-generated method stub
		String sql ="delete from dishorder where orderid=?";
		Object[] params = {dishOrder.getOrderId()};
		return this.modifyObj(sql, params);
	}

	/**@Description ����sql����ѯ���� 
	 * @time 2020��11��13�� ����10:03:59 
	 * @author ���� 
	 */
	@Override
	public ArrayList<DishOrder> findDishOrderBy(String sql, Object[] params) {
		return this.findObjs(sql,params, Dish.class);
	}
	
	/**@Description  ��ѯ�������� 
	 * @time 2020��11��13�� ����10:03:59 
	 * @author ���� 
	 */
	@Override
	public int getTotalDishOrderRecords() {
		String strsql = "select count(*) from dishorder";
		return getTotalRecords(strsql);
		
	}
	
	/**@Description ���ݵ�ǰ������ѯ 
	 * @time 2020��11��13�� ����10:03:59 
	 * @author ����
	 */
	@Override
	public ArrayList findDishOrder(DishOrder dishOrder) {
		String sql = "select * from dishorder where orderid=?";
		Object[] params = {dishOrder.getOrderId()};
		return this.findObjs(sql, params, Dish.class);
	}

	
	
}
