package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.bean.User;
import edu.cugb.javaee.dao.IUserDAO;
import edu.cugb.javaee.utils.DAOFactory;
/**
 * @Description UserDAO测试类 
 * @time 2020年11月13日 下午6:29:20
 * @author 任星韬
 */
class UserDAOTest {
	IUserDAO userdao = null;
	User usertest=null;
	
	@BeforeEach
	void setUp() throws Exception {
		userdao=(IUserDAO) DAOFactory.newInstance("IUserDAO");
		usertest=new User();
		usertest.setUserId(2);
		usertest.setUserImg("test");
		usertest.setUserPassword("test");
		usertest.setUserName("lisi");
		usertest.setPhoneNumber("13362062697");
		usertest.setEmailAddress("address755");
		usertest.setRegDate(new Date(2000-20-12));
	}

	/**
	 * @Description 测试更新用户信息  
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testUpdateUser() {
		assertEquals(1,userdao.updateUser(usertest));
	}

	/**
	 * @Description 测试更新用户的某几项信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	//@Test
	void testUpdateUserBy() {
		String[] arr ={usertest.getUserName(),Integer.toString(usertest.getUserId())};//存储到String数组中
		Object[] outputRow = new Object[arr.length];
		System.out.println(arr.length);
	    for(int i=0;i<arr.length;i++) {
	         outputRow[i] = arr[i];//转化为Object数组
	         System.out.println(outputRow[i] );
	    }
		assertEquals(1, userdao.updateUserBy("update user set username=? where userid=?", outputRow));
	}

	/**
	 * @Description 测试插入用户信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	void testInsertUser() {
		assertEquals(1, userdao.insertUser(usertest));
	}

	/**
	 * @Description 测试删除用户
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	void testDeleteUser() {
		assertEquals(1, userdao.deleteUser(usertest));
	}

	/**
	 * @Description 测试根据ID查询用户 
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	void testFindUser() {
		assertEquals(1, userdao.findUser(usertest).size());
	}

	/**
	 * @Description 测试根据某个信息查询用户信息
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	void testFindUserBy() {
	    String[] arr ={usertest.getUserName()};
	  Object[] outputRow = new Object[arr.length];
	  for(int i=0;i<arr.length;i++) {
	       outputRow[i] = arr[i];
	  }
		assertEquals(1, userdao.findUserBy("select * from user where username=?",outputRow).size());
	}

	/**
	 * @Description 测试查询用户总数 
	 * @time 2020年11月13日 下午6:29:20
	 * @author 任星韬
	 */
	@Test
	void testGetTotalUserRecords() {
		assertNotNull(userdao.getTotalUserRecords());
	}

}
