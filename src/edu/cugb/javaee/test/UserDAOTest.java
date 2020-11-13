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
 * @Description UserDAO������ 
 * @time 2020��11��13�� ����6:29:20
 * @author �����
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
	 * @Description ���Ը����û���Ϣ  
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testUpdateUser() {
		assertEquals(1,userdao.updateUser(usertest));
	}

	/**
	 * @Description ���Ը����û���ĳ������Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testUpdateUserBy() {
		String[] arr ={usertest.getUserName(),Integer.toString(usertest.getUserId())};//�洢��String������
		Object[] outputRow = new Object[arr.length];
		System.out.println(arr.length);
	    for(int i=0;i<arr.length;i++) {
	         outputRow[i] = arr[i];//ת��ΪObject����
	         System.out.println(outputRow[i] );
	    }
		assertEquals(1, userdao.updateUserBy("update user set username=? where userid=?", outputRow));
	}

	/**
	 * @Description ���Բ����û���Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	void testInsertUser() {
		assertEquals(1, userdao.insertUser(usertest));
	}

	/**
	 * @Description ����ɾ���û�
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	void testDeleteUser() {
		assertEquals(1, userdao.deleteUser(usertest));
	}

	/**
	 * @Description ���Ը���ID��ѯ�û� 
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	void testFindUser() {
		assertEquals(1, userdao.findUser(usertest).size());
	}

	/**
	 * @Description ���Ը���ĳ����Ϣ��ѯ�û���Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
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
	 * @Description ���Բ�ѯ�û����� 
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	@Test
	void testGetTotalUserRecords() {
		assertNotNull(userdao.getTotalUserRecords());
	}

}
