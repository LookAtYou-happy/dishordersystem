package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.bean.Dish;
import edu.cugb.javaee.dao.IDishDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description DishDAO的测试类，用于测试其中的方法 
 * @time 2020年11月13日 上午9:39:24 
 * @author 王瑞
 */
class DishDAOTest {
	IDishDAO dishDao;
	Dish dish;
	/**
	 * @Description 用于测试的对象的构造
	 * @time 2020年11月13日 上午9:38:40 
	 * @author 王瑞
	 */
	@BeforeEach
	void setUp() throws Exception {
		dishDao=(IDishDAO) DAOFactory.newInstance("IDishDAO");
		dish=new Dish();
	}

	/**
	 * @Description 测试DishDAO的updateDish方法 
	 * @time 2020年11月13日 上午9:39:19 
	 * @author 王瑞
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
	 * @Description 测试DishDAO的insertDish方法 
	 * @time 2020年11月13日 上午9:41:00 
	 * @author 王瑞
	 */
	void testInsertDish() {
		dish.setDishName("test1");
		//INSERT INTO dish(dishname,dishinfo,unitprice,discount,img,sellerid,leftnum) VALUES ('皮蛋瘦肉粥','美味可口!', '5.000','0.85','images/dish/500022.jpg',1,20);
		dish.setDishInfo("test1");
		dish.setUnitPrice(new BigDecimal(3.8));
		dish.setDiscount(new BigDecimal(0.4));
		dish.setImg("test1");
		dish.setSellerId(2);
		assertEquals(1, dishDao.insertDish(dish));
	}

	
	/**
	 * @Description 测试DishDAO的deleteDish方法  
	 * @time 2020年11月13日 上午9:41:32 
	 * @author 王瑞
	 */
	void testDeleteDish() {
		dish.setDishId(19);
		assertEquals(1, dishDao.deleteDish(dish));
	}

	
	/**
	 * @Description 测试根据带参sql语句查询菜品 
	 * @time 2020年11月13日 上午9:43:00 
	 * @author 王瑞
	 */
	void testFindDishBy() {
		String sql ="select * from dish where dishid=?";
		Object[] params = {2};
		//System.out.println(dishdao.findDishBy(sql, params));
		assertNotNull(dishDao.findDishBy(sql, params));
	}
	

	/**
	 * @Description 测试查找菜品记录总数的方法 
	 * @time 2020年11月13日 上午9:44:14 
	 * @author 王瑞
	 */
	void testGetTotalDishRecords() {
		assertNotNull(dishDao.getTotalDishRecords());
	}
@Test
	/**
	 * @Description  测试根据当前菜品的查询方法 
	 * @time 2020年11月13日 上午9:43:18 
	 * @author 王瑞
	 */
	void testFindDish() {
		dish.setDishId(7);
		assertNotNull(dishDao.findDish(dish));
	}

}
