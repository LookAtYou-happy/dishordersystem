package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.bean.DishOrder;

public interface IDishOrderDAO {

	/**
	 * @Description  ���¶���
	 * @time 2020��11��12�� ����7:44:29 
	 * @author ����
	 */
	int updateDishOrder(DishOrder dish);

	/**
	 * @Description ���붩��
	 * @time 2020��11��12�� ����9:04:47 
	 * @author ����
	 */
	int insertDishOrder(DishOrder dish);

	/**
	 * @Description  ɾ������
	 * @time 2020��11��12�� ����10:59:59 
	 * @author ����
	 */
	int deleteDishOrder(DishOrder dish);

	/**
	 * @Description ���ݴ���sql����ѯ����
	 * @time 2020��11��12�� ����7:44:50 
	 * @author ����
	 */
	ArrayList<DishOrder> findDishOrderBy(String sql, Object[] params);

	/**
	 * @Description ��ѯ��������
	 * @time 2020��11��12�� ����7:46:57 
	 * @author ����
	 */
	int getTotalDishOrderRecords();

	/**
	 * @Description  ��ѯָ������
	 * @time 2020��11��12�� ����7:47:35 
	 * @author ����
	 */
	ArrayList findDishOrder(DishOrder dish);

}