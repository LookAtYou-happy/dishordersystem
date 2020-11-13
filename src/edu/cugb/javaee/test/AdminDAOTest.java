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
 * @Description AdminDAO������
 * @time 2020��11��13�� ����6:29:20
 * @author �����
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
	 * @Description ���Ը��¹���Ա��Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	@Test
	void testUpdateAdmin() {
		assertEquals(1,admindao.updateAdmin(admintest));
	}

	/**
	 * @Description ���Ը��¹���Ա��ĳ������Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testUpdateAdminBy() {
		String[] arr ={admintest.getAdminName(),Integer.toString(admintest.getAdminId())};//�洢��String������
		Object[] outputRow = new Object[arr.length];
		System.out.println(arr.length);
	    for(int i=0;i<arr.length;i++) {
	         outputRow[i] = arr[i];//ת��ΪObject����
	         System.out.println(outputRow[i] );
	    }
		assertEquals(1, admindao.updateAdminBy("update admin set adminname=? where adminid=?", outputRow));
	}

	/**
	 * @Description  ���Բ������Ա��Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testInsertAdmin() {
		assertEquals(1, admindao.insertAdmin(admintest));
	}

	/**
	 * @Description ����ɾ������Ա
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testDeleteAdmin() {
		assertEquals(1, admindao.deleteAdmin(admintest));
	}

	/**
	 * @Description ���Ը���ID��ѯ����Ա 
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testFindAdmin() {
		assertEquals(1, admindao.findAdmin(admintest).size());
	}

	/**
	 * @Description ���Ը���ĳ����Ϣ��ѯ����Ա��Ϣ
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
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
	 * @Description ���Բ�ѯ����Ա����
	 * @time 2020��11��13�� ����6:29:20
	 * @author �����
	 */
	//@Test
	void testGetTotalAdminRecords() {
		assertNotNull(admindao.getTotalAdminRecords());
	}

}
