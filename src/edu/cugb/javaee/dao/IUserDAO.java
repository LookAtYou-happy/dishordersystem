package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.User;

public interface IUserDAO {

	/**
	 * @Description �����û���Ϣ
	 * @time 2020��11��13�� ����3:58:52 
	 * @author �����
	 */
	int updateUser(User user);

	/**
	 * @Description  �����û���ĳ������Ϣ
	 * @time 2020��11��13�� ����4:10:21 
	 * @author �����
	 */
	int updateUserBy(String sql, Object[] params);

	/**
	 * @Description �����û���Ϣ
	 * @time 2020��11��13�� ����3:59:55 
	 * @author �����
	 */
	int insertUser(User user);

	/**
	 * @Description ɾ���û�
	 * @time 2020��11��13�� ����4:00:11 
	 * @author �����
	 */
	int deleteUser(User user);

	/**
	 * @Description ����ID��ѯ�û� 
	 * @time 2020��11��13�� ����4:00:34 
	 * @author �����
	 */
	ArrayList findUser(User user);

	/**
	 * @Description ����ĳ����Ϣ��ѯ�û���Ϣ
	 * @time 2020��11��12�� ����9:01:06 
	 * @author �����
	 */
	ArrayList<User> findUserBy(String sql, Object[] params);

	/**
	 * @Description  ��ѯ�û����� 
	 * @time 2020��11��13�� ����4:03:10 
	 * @author �����
	 */
	int getTotalUserRecords();

}