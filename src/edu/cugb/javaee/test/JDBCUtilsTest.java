package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.utils.JDBCUtils;
/**
 * @Description
 * ����JDBCUtils�� 
 * @time 2020��11��13�� ����10:17:37 
 * @author ����
 */
class JDBCUtilsTest {

	
	@Test
	/**
	 * @Description
	 * ����JDBCUtils���getConnection���� 
	 * @time 2020��11��13�� ����10:17:58 
	 * @author ����
	 */
	void testGetConnection() {
		assertNotNull(JDBCUtils.getConnection());
	}


}
