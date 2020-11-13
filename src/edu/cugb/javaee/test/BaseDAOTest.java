package edu.cugb.javaee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.dao.IDishDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description ����BaseDAO�� 
 * @time 2020��11��13�� ����10:15:33 
 * @author ����
 */
class BaseDAOTest {
	IDishDAO dishDao = null;
	@BeforeEach
	/**
	 * @Description �������ڲ��ԵĶ��� 
	 * @time 2020��11��13�� ����10:16:36 
	 * @author ����
	 */
	void setUp() throws Exception {
		dishDao = (IDishDAO) DAOFactory.newInstance("IDishDAO");
	}

	@Test
	/**
	 * @Description  ����BaseDAO���getTotalDishRecords���� 
	 * @time 2020��11��13�� ����10:16:06 
	 * @author ����
	 */
	void testGetTotalRecords() {
		assertNotNull("test", dishDao.getTotalDishRecords());
	}

}
