package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.bean.Admin;
import edu.cugb.javaee.dao.IAdminDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description AdminDAO测试类
 * @time 2020年11月13日 下午6:29:20
 * @author 任星韬
 */
class AdminDAOTest {
	IAdminDAO admindao = null;
	Admin admintest=null;
	
	@BeforeEach
	void setUp() throws Exception {
		admindao=(IAdminDAO) DAOFactory.newInstance("IAdminDAO");
		admintest=new Admin();
		admintest.setAdminId(2);
		admintest.setAdminPassword("test");
		admintest.setAdminName("sdxsd");
		admintest.setPhoneNumber("13362062697");
		admintest.setEmailAddress("address755");
		admintest.setRegDate(new Date(2000-20-12));
	}

	/**
	 * @Description 测试更新管理员信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	@Test
	void testUpdateAdmin() {
		assertEquals(1,admindao.updateAdmin(admintest));
	}

	/**
	 * @Description 测试更新管理员的某几项信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testUpdateAdminBy() {
		String[] arr ={admintest.getAdminName(),Integer.toString(admintest.getAdminId())};//存储到String数组中
		Object[] outputRow = new Object[arr.length];
		System.out.println(arr.length);
	    for(int i=0;i<arr.length;i++) {
	         outputRow[i] = arr[i];//转化为Object数组
	         System.out.println(outputRow[i] );
	    }
		assertEquals(1, admindao.updateAdminBy("update admin set adminname=? where adminid=?", outputRow));
	}

	/**
	 * @Description  测试插入管理员信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testInsertAdmin() {
		assertEquals(1, admindao.insertAdmin(admintest));
	}

	/**
	 * @Description 测试删除管理员
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testDeleteAdmin() {
		assertEquals(1, admindao.deleteAdmin(admintest));
	}

	/**
	 * @Description 测试根据ID查询管理员 
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testFindAdmin() {
		assertEquals(1, admindao.findAdmin(admintest).size());
	}

	/**
	 * @Description 测试根据某个信息查询管理员信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testFindAdminBy() {
	    String[] arr ={admintest.getAdminName()};
	  Object[] outputRow = new Object[arr.length];
	  for(int i=0;i<arr.length;i++) {
	       outputRow[i] = arr[i];
	  }
		assertEquals(1, admindao.findAdminBy("select * from admin where adminname=?",outputRow).size());
	}

	/**
	 * @Description 测试查询管理员总数
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testGetTotalAdminRecords() {
		assertNotNull(admindao.getTotalAdminRecords());
	}

}
