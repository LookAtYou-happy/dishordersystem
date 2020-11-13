package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.bean.DishOrder;
import edu.cugb.javaee.dao.DishOrderDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description
 * DishOrderDAO测试类 
 * @time 2020年11月13日 上午10:32:06 
 * @author 王瑞
 */
class DishOrderDAOTest {
	DishOrderDAO dishOrderDao;
	DishOrder dishOrder;
	@BeforeEach
	/**
	 * @Description
	 * 对用于测试的对象进行构造 
	 * @time 2020年11月13日 上午10:32:32 
	 * @author 王瑞
	 */
	void setUp() throws Exception {
		dishOrderDao=(DishOrderDAO) DAOFactory.newInstance("IDishOrderDAO");
		dishOrder=new DishOrder();
	}

	
	/**
	 * @Description
	 * 测试更新订单 方法
	 * @time 2020年11月13日 上午10:32:52 
	 * @author 王瑞
	 */
	void testUpdateDishOrder() {
		//update dishorder set amount=?,orderdate=?,price=?,orderstatus=? where orderid=?
		dishOrder.setAmount(6);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		dishOrder.setOrderDate(df.format(new Date()));
		dishOrder.setPrice(new BigDecimal(7.8));
		dishOrder.setOrderStatus("paid");
		dishOrder.setOrderId(1);
		assertEquals(1, dishOrderDao.updateDishOrder(dishOrder));
	}

	
	/**
	 * @Description
	 * 测试插入订单方法 
	 * @time 2020年11月13日 上午10:33:36 
	 * @author 王瑞
	 */
	void testInsertDishOrder() {
		dishOrder.setDishId(2);
		dishOrder.setUserId(2);
		dishOrder.setAmount(9);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		dishOrder.setOrderDate(df.format(new Date()));
		dishOrder.setPrice(new BigDecimal(19.8));
		dishOrder.setOrderStatus("nopay");
		assertEquals(1, dishOrderDao.insertDishOrder(dishOrder));
		
	}
	

	/**
	 * @Description
	 * 测试删除订单方法 
	 * @time 2020年11月13日 上午10:33:52 
	 * @author 王瑞
	 */
	void testDeleteDishOrder() {
		dishOrder.setOrderId(5);
		assertEquals(1, dishOrderDao.deleteDishOrder(dishOrder));
	}
	

	/**
	 * @Description
	 * 测试根据sql语句查询订单的方法 
	 * @time 2020年11月13日 上午10:34:12 
	 * @author 王瑞
	 */
	void testFindDishOrderBy() {
	String sql="select * from dishorder where orderid=?";
	Object[] params= {1};
	assertNotNull(dishOrderDao.findDishOrderBy(sql, params));
	
	}

	/**
	 * @Description
	 * 测试查询订单总数的方法 
	 * @time 2020年11月13日 上午10:34:42 
	 * @author 王瑞
	 */
	void testGetTotalDishOrderRecords() {
		assertNotNull(dishOrderDao.getTotalDishOrderRecords());
	}
	
@Test
	/**
	 * @Description
	 * 测试根据当前订单查询订单的方法 
	 * @time 2020年11月13日 上午10:35:03 
	 * @author 王瑞
	 */
	void testFindDishOrder() {
	dishOrder.setOrderId(1);
		assertNotNull(dishOrderDao.findDishOrder(dishOrder));
	}

}
