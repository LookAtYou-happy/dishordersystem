package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.utils.JDBCUtils;
/**
 * @Description
 * 测试JDBCUtils类 
 * @time 2020年11月13日 上午10:17:37 
 * @author 王瑞
 */
class JDBCUtilsTest {

	
	@Test
	/**
	 * @Description
	 * 测试JDBCUtils类的getConnection方法 
	 * @time 2020年11月13日 上午10:17:58 
	 * @author 王瑞
	 */
	void testGetConnection() {
		assertNotNull(JDBCUtils.getConnection());
	}


}
