package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.dao.IDishDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description DishDAO�Ĳ����࣬���ڲ������еķ��� 
 * @time 2020��11��13�� ����9:39:24 
 * @author ����
 */
class DishDAOTest {
	IDishDAO dishDao;
	Dish dish;
	/**
	 * @Description ���ڲ��ԵĶ���Ĺ���
	 * @time 2020��11��13�� ����9:38:40 
	 * @author ����
	 */
	@BeforeEach
	void setUp() throws Exception {
		dishDao=(IDishDAO) DAOFactory.newInstance("IDishDAO");
		dish=new Dish();
	}

	/**
	 * @Description ����DishDAO��updateDish���� 
	 * @time 2020��11��13�� ����9:39:19 
	 * @author ����
	 */
	void testUpdateDish() {
		dish.setDishName("test");
		dish.setDishInfo("test");
		dish.setUnitPrice(new BigDecimal(3.8));
		dish.setDiscount(new BigDecimal(0.4));
		dish.setImg("null");
		dish.setLeftnum(3);
		dish.setDishId(1);
		assertEquals(1, dishDao.updateDish(dish));
	}

	
	/**
	 * @Description ����DishDAO��insertDish���� 
	 * @time 2020��11��13�� ����9:41:00 
	 * @author ����
	 */
	void testInsertDish() {
		dish.setDishName("test1");
		//INSERT INTO dish(dishname,dishinfo,unitprice,discount,img,sellerid,leftnum) VALUES ('Ƥ��������','��ζ�ɿ�!', '5.000','0.85','images/dish/500022.jpg',1,20);
		dish.setDishInfo("test1");
		dish.setUnitPrice(new BigDecimal(3.8));
		dish.setDiscount(new BigDecimal(0.4));
		dish.setImg("test1");
		dish.setSellerId(2);
		assertEquals(1, dishDao.insertDish(dish));
	}

	
	/**
	 * @Description ����DishDAO��deleteDish����  
	 * @time 2020��11��13�� ����9:41:32 
	 * @author ����
	 */
	void testDeleteDish() {
		dish.setDishId(19);
		assertEquals(1, dishDao.deleteDish(dish));
	}

	
	/**
	 * @Description ���Ը��ݴ���sql����ѯ��Ʒ 
	 * @time 2020��11��13�� ����9:43:00 
	 * @author ����
	 */
	void testFindDishBy() {
		String sql ="select * from dish where dishid=?";
		Object[] params = {2};
		//System.out.println(dishdao.findDishBy(sql, params));
		assertNotNull(dishDao.findDishBy(sql, params));
	}
	

	/**
	 * @Description ���Բ��Ҳ�Ʒ��¼�����ķ��� 
	 * @time 2020��11��13�� ����9:44:14 
	 * @author ����
	 */
	void testGetTotalDishRecords() {
		assertNotNull(dishDao.getTotalDishRecords());
	}
@Test
	/**
	 * @Description  ���Ը��ݵ�ǰ��Ʒ�Ĳ�ѯ���� 
	 * @time 2020��11��13�� ����9:43:18 
	 * @author ����
	 */
	void testFindDish() {
		dish.setDishId(7);
		assertNotNull(dishDao.findDish(dish));
	}

}
