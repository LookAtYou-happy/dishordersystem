package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Dish;

public interface IDishDAO {
	/**
	 * @Description ���²�Ʒ
	 * @time 2020��11��12�� ����8:58:52 
	 * @author ����
	 */
	int updateDish(Dish dish);
	
	/**
	 * @Description �����Ʒ 
	 * @time 2020��11��12�� ����8:59:55 
	 * @author ����
	 */
	int insertDish(Dish dish);
	
	/**
	 * @Description  ɾ����Ʒ 
	 * @time 2020��11��12�� ����9:00:11 
	 * @author ����
	 */
	int deleteDish(Dish dish);
	
	/**
	 * @Description ���ҵ�ǰ��Ʒ 
	 * @time 2020��11��12�� ����9:00:34 
	 * @author ����
	 */
	ArrayList findDish(Dish dish);
	
	/**
	 * @Description ͨ������sql����ѯ��Ʒ 
	 * @time 2020��11��12�� ����9:01:06 
	 * @author ����
	 */
	public ArrayList<Dish> findDishBy(String sql,Object[] params);
	
	/**
	 * @Description  ��ѯ��Ʒ���� 
	 * @time 2020��11��12�� ����9:03:10 
	 * @author ����
	 */
	public int getTotalDishRecords();
}
