package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.User;

public class UserDAO extends BaseDAO implements IUserDAO{
	/**@Description 更新用户信息
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬
	 */
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		String sql ="update User set username=?,userpassword=?,phonenumber=?,emailaddress=?,userimg=?,regdate=? where userid=?";
		Object[] params = {user.getUserName(),user.getUserPassword(),user.getPhoneNumber(),user.getEmailAddress(),user.getUserImg(),user.getRegDate(),user.getUserId()};
		return this.modifyObj(sql, params);
	}
	
	/**@Description 更新用户部分信息
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬 
	 */
	@Override
	public int updateUserBy(String sql,Object[] params){
		// TODO Auto-generated method stub
		return this.modifyObj(sql, params);
	}
	
	/**@Description 插入用户信息
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬 
	 */
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO User(username,userpassword,phonenumber,emailaddress,userimg,regdate) VALUES (?,?,?,?,?,?);";
		Object[] params = {user.getUserName(),user.getUserPassword(),user.getPhoneNumber(),user.getEmailAddress(),user.getUserImg(),user.getRegDate()};
		return this.modifyObj(sql, params);
	}

	/**@Description 删除用户信息
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬 
	 */
	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		String sql ="delete from User where userid=?";
		Object[] params = {user.getUserId()};
		return this.modifyObj(sql, params);
	}
	
	/**@Description 根据ID查询用户
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬 
	 */
	@Override
	public ArrayList findUser(User user) {
		String sql = "select * from User where userid=?";
		Object[] params = {user.getUserId()};
		return this.findObjs(sql, params, User.class);
	}
	
	/**@Description 根据某个信息查询用户
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬 
	 */
	@Override
	public ArrayList<User> findUserBy(String sql, Object[] params) {
		return this.findObjs(sql,params, User.class);
	}
	
	/**@Description 查询用户总数
	 * @time 2020年11月13日 下午9:23:12 
	 * @author 任星韬 
	 */
	@Override
	public int getTotalUserRecords() {
		String strsql = "select count(*) from User";
		return getTotalRecords(strsql);
		
	}
	
}
