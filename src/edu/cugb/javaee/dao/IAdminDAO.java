package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Admin;

public interface IAdminDAO {
	/**
	 * @Description 更新管理员信息
	 * @time 2020年11月13日 下午3:58:52 
	 * @author 任星韬
	 */
	int updateAdmin(Admin admin);
	/**
	 * @Description  更新管理员的某几项信息
	 * @time 2020年11月13日 下午4:10:21 
	 * @author 任星韬
	 */
	int updateAdminBy(String sql,Object[] params);
	/**
	 * @Description 插入管理员信息
	 * @time 2020年11月13日 下午3:59:55 
	 * @author 任星韬
	 */
	int insertAdmin(Admin admin);
	
	/**
	 * @Description 删除管理员
	 * @time 2020年11月13日 下午4:00:11 
	 * @author 任星韬
	 */
	int deleteAdmin(Admin admin);
	
	/**
	 * @Description 根据ID查询管理员 
	 * @time 2020年11月13日 下午4:00:34 
	 * @author 任星韬
	 */
	ArrayList findAdmin(Admin admin);
	
	/**
	 * @Description 根据某个信息查询管理员信息
	 * @time 2020年11月12日 下午9:01:06 
	 * @author 任星韬
	 */
	public ArrayList<Admin> findAdminBy(String sql,Object[] params);
	
	/**
	 * @Description 查询管理员总数 
	 * @time 2020年11月13日 下午4:03:10 
	 * @author 任星韬
	 */
	public int getTotalAdminRecords();
}
