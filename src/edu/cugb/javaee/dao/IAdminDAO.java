package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Admin;

public interface IAdminDAO {
	/**
	 * @Description ���¹���Ա��Ϣ
	 * @time 2020��11��13�� ����3:58:52 
	 * @author �����
	 */
	int updateAdmin(Admin admin);
	/**
	 * @Description  ���¹���Ա��ĳ������Ϣ
	 * @time 2020��11��13�� ����4:10:21 
	 * @author �����
	 */
	int updateAdminBy(String sql,Object[] params);
	/**
	 * @Description �������Ա��Ϣ
	 * @time 2020��11��13�� ����3:59:55 
	 * @author �����
	 */
	int insertAdmin(Admin admin);
	
	/**
	 * @Description ɾ������Ա
	 * @time 2020��11��13�� ����4:00:11 
	 * @author �����
	 */
	int deleteAdmin(Admin admin);
	
	/**
	 * @Description ����ID��ѯ����Ա 
	 * @time 2020��11��13�� ����4:00:34 
	 * @author �����
	 */
	ArrayList findAdmin(Admin admin);
	
	/**
	 * @Description ����ĳ����Ϣ��ѯ����Ա��Ϣ
	 * @time 2020��11��12�� ����9:01:06 
	 * @author �����
	 */
	public ArrayList<Admin> findAdminBy(String sql,Object[] params);
	
	/**
	 * @Description ��ѯ����Ա���� 
	 * @time 2020��11��13�� ����4:03:10 
	 * @author �����
	 */
	public int getTotalAdminRecords();
}
