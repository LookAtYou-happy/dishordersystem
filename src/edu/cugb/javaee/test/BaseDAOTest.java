package edu.cugb.javaee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.dao.IDishDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description 测试BaseDAO类 
 * @time 2020年11月13日 上午10:15:33 
 * @author 王瑞
 */
class BaseDAOTest {
	IDishDAO dishDao = null;
	@BeforeEach
	/**
	 * @Description 构造用于测试的对象 
	 * @time 2020年11月13日 上午10:16:36 
	 * @author 王瑞
	 */
	void setUp() throws Exception {
		dishDao = (IDishDAO) DAOFactory.newInstance("IDishDAO");
	}

	@Test
	/**
	 * @Description  测试BaseDAO类的getTotalDishRecords方法 
	 * @time 2020年11月13日 上午10:16:06 
	 * @author 王瑞
	 */
	void testGetTotalRecords() {
		assertNotNull("test", dishDao.getTotalDishRecords());
	}

}
