package edu.cugb.javaee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.cugb.javaee.bean.Seller;
import edu.cugb.javaee.dao.ISellerDAO;
import edu.cugb.javaee.utils.DAOFactory;

class SellerDAOTest {
	ISellerDAO sellerdao = null;
	Seller sellertest=null;
	
	@BeforeEach
	void setUp() throws Exception {
		sellerdao = (ISellerDAO) DAOFactory.newInstance("ISellerDAO");
		/**
		 * 测试用的商家类
		 */
		sellertest=new Seller();
		sellertest.setSellerId(1);
		sellertest.setSellerName("xx00345");
		sellertest.setPhonenumber("up474.png");
		sellertest.setSelleraddress("address755");
		sellertest.setSellerImg("1.png");
		sellertest.setScore(2);
		
		
	}

	@Test
	void testUpdateSeller() {
		//assertEquals(1, sellerdao.updateSeller(sellertest));
	}

	@Test
	void testUpdateSellerBy() {	
//		String[] arr ={sellertest.getSellerName(),Integer.toString(sellertest.getSellerId())};//存储到String数组中
//		Object[] outputRow = new Object[arr.length];
//		System.out.println(arr.length);
//	    for(int i=0;i<arr.length;i++) {
//	         outputRow[i] = arr[i];//转化为Object数组
//	         System.out.println(outputRow[i] );
//	    }
//		assertEquals(1, sellerdao.updateSellerBy("update seller set sellername=? where sellerid=?", outputRow));
	}

	@Test
	void testDeleteSeller() {
		//assertEquals(1, sellerdao.deleteSeller(sellertest));
	}

	@Test
	void testInsertSeller() {
		//assertEquals(1, sellerdao.insertSeller(sellertest));
	}

	@Test
	void testFindSeller() {
		//assertEquals(1, sellerdao.findSeller(sellertest).size());
	}

	@Test
	void testFindSellerBy() {
	    //String[] arr ={sellertest.getSellerName()};
       // Object[] outputRow = new Object[arr.length];
        //for(int i=0;i<arr.length;i++) {
         //    outputRow[i] = arr[i];
        //}
		//assertEquals(1, sellerdao.findSellerBy("select * from seller where sellername=?",outputRow).size());
	}

}
