package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Admin;
import edu.cugb.javaee.bean.Admin;

public class AdminDAO extends BaseDAO implements IAdminDAO {
	/**
	 * @Description ���¹���Ա��Ϣ
	 * @time 2020��11��13�� ����3:58:52 
	 * @author �����
	 */
	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql ="update Admin set adminname=?,adminpassword=?,phonenumber=?,emailaddress=?,regdate=? where adminid=?";
		Object[] params = {admin.getAdminName(),admin.getAdminPassword(),admin.getPhoneNumber(),admin.getEmailAddress(),admin.getRegDate(),admin.getAdminId()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description  ���¹���Ա��ĳ������Ϣ
	 * @time 2020��11��13�� ����4:10:21 
	 * @author �����
	 */
	@Override
	public int updateAdminBy(String sql, Object[] params) {
		// TODO Auto-generated method stub
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description  �������Ա��Ϣ
	 * @time 2020��11��13�� ����3:59:55 
	 * @author �����
	 */
	@Override
	public int insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO Admin(adminname,adminpassword,phonenumber,emailaddress,regdate) VALUES (?,?,?,?,?);";
		Object[] params = {admin.getAdminName(),admin.getAdminPassword(),admin.getPhoneNumber(),admin.getEmailAddress(),admin.getRegDate()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description  ɾ������Ա
	 * @time 2020��11��13�� ����4:00:11 
	 * @author �����
	 */
	@Override
	public int deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql ="delete from Admin where adminid=?";
		Object[] params = {admin.getAdminId()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description ����ID��ѯ����Ա 
	 * @time 2020��11��13�� ����4:00:34 
	 * @author �����
	 */
	@Override
	public ArrayList findAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql = "select * from Admin where adminid=?";
		Object[] params = {admin.getAdminId()};
		return this.findObjs(sql, params, Admin.class);
	}

	/**
	 * @Description ����ĳ����Ϣ��ѯ����Ա��Ϣ
	 * @time 2020��11��12�� ����9:01:06 
	 * @author �����
	 */
	@Override
	public ArrayList<Admin> findAdminBy(String sql, Object[] params) {
		// TODO Auto-generated method stub
		return this.findObjs(sql,params, Admin.class);
	}

	/**
	 * @Description ��ѯ����Ա���� 
	 * @time 2020��11��13�� ����4:03:10 
	 * @author �����
	 */
	@Override
	public int getTotalAdminRecords() {
		// TODO Auto-generated method stub
		String strsql = "select count(*) from admin";
		return getTotalRecords(strsql);
	}

}
