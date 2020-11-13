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
 * DishOrderDAO������ 
 * @time 2020��11��13�� ����10:32:06 
 * @author ����
 */
class DishOrderDAOTest {
	DishOrderDAO dishOrderDao;
	DishOrder dishOrder;
	@BeforeEach
	/**
	 * @Description
	 * �����ڲ��ԵĶ�����й��� 
	 * @time 2020��11��13�� ����10:32:32 
	 * @author ����
	 */
	void setUp() throws Exception {
		dishOrderDao=(DishOrderDAO) DAOFactory.newInstance("IDishOrderDAO");
		dishOrder=new DishOrder();
	}

	
	/**
	 * @Description
	 * ���Ը��¶��� ����
	 * @time 2020��11��13�� ����10:32:52 
	 * @author ����
	 */
	void testUpdateDishOrder() {
		//update dishorder set amount=?,orderdate=?,price=?,orderstatus=? where orderid=?
		dishOrder.setAmount(6);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		dishOrder.setOrderDate(df.format(new Date()));
		dishOrder.setPrice(new BigDecimal(7.8));
		dishOrder.setOrderStatus("paid");
		dishOrder.setOrderId(1);
		assertEquals(1, dishOrderDao.updateDishOrder(dishOrder));
	}

	
	/**
	 * @Description
	 * ���Բ��붩������ 
	 * @time 2020��11��13�� ����10:33:36 
	 * @author ����
	 */
	void testInsertDishOrder() {
		dishOrder.setDishId(2);
		dishOrder.setUserId(2);
		dishOrder.setAmount(9);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		dishOrder.setOrderDate(df.format(new Date()));
		dishOrder.setPrice(new BigDecimal(19.8));
		dishOrder.setOrderStatus("nopay");
		assertEquals(1, dishOrderDao.insertDishOrder(dishOrder));
		
	}
	

	/**
	 * @Description
	 * ����ɾ���������� 
	 * @time 2020��11��13�� ����10:33:52 
	 * @author ����
	 */
	void testDeleteDishOrder() {
		dishOrder.setOrderId(5);
		assertEquals(1, dishOrderDao.deleteDishOrder(dishOrder));
	}
	

	/**
	 * @Description
	 * ���Ը���sql����ѯ�����ķ��� 
	 * @time 2020��11��13�� ����10:34:12 
	 * @author ����
	 */
	void testFindDishOrderBy() {
	String sql="select * from dishorder where orderid=?";
	Object[] params= {1};
	assertNotNull(dishOrderDao.findDishOrderBy(sql, params));
	
	}

	/**
	 * @Description
	 * ���Բ�ѯ���������ķ��� 
	 * @time 2020��11��13�� ����10:34:42 
	 * @author ����
	 */
	void testGetTotalDishOrderRecords() {
		assertNotNull(dishOrderDao.getTotalDishOrderRecords());
	}
	
@Test
	/**
	 * @Description
	 * ���Ը��ݵ�ǰ������ѯ�����ķ��� 
	 * @time 2020��11��13�� ����10:35:03 
	 * @author ����
	 */
	void testFindDishOrder() {
	dishOrder.setOrderId(1);
		assertNotNull(dishOrderDao.findDishOrder(dishOrder));
	}

}
