package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.User;

public interface IUserDAO {

	/**
	 * @Description 更新用户信息
	 * @time 2020年11月13日 下午3:58:52 
	 * @author 任星韬
	 */
	int updateUser(User user);

	/**
	 * @Description  更新用户的某几项信息
	 * @time 2020年11月13日 下午4:10:21 
	 * @author 任星韬
	 */
	int updateUserBy(String sql, Object[] params);

	/**
	 * @Description 插入用户信息
	 * @time 2020年11月13日 下午3:59:55 
	 * @author 任星韬
	 */
	int insertUser(User user);

	/**
	 * @Description 删除用户
	 * @time 2020年11月13日 下午4:00:11 
	 * @author 任星韬
	 */
	int deleteUser(User user);

	/**
	 * @Description 根据ID查询用户 
	 * @time 2020年11月13日 下午4:00:34 
	 * @author 任星韬
	 */
	ArrayList findUser(User user);

	/**
	 * @Description 根据某个信息查询用户信息
	 * @time 2020年11月12日 下午9:01:06 
	 * @author 任星韬
	 */
	ArrayList<User> findUserBy(String sql, Object[] params);

	/**
	 * @Description  查询用户总数 
	 * @time 2020年11月13日 下午4:03:10 
	 * @author 任星韬
	 */
	int getTotalUserRecords();

}