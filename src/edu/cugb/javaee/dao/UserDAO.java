package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.User;

public class UserDAO extends BaseDAO implements IUserDAO{
	/**@Description �����û���Ϣ
	 * @time 2020��11��13�� ����9:23:12 
	 * @author �����
	 */
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		String sql ="update User set username=?,userpassword=?,phonenumber=?,emailaddress=?,userimg=?,regdate=? where userid=?";
		Object[] params = {user.getUserName(),user.getUserPassword(),user.getPhoneNumber(),user.getEmailAddress(),user.getUserImg(),user.getRegDate(),user.getUserId()};
		return this.modifyObj(sql, params);
	}
	
	/**@Description �����û�������Ϣ
	 * @time 2020��11��13�� ����9:23:12 
	 * @author ����� 
	 */
	@Override
	public int updateUserBy(String sql,Object[] params){
		// TODO Auto-generated method stub
		return this.modifyObj(sql, params);
	}
	
	/**@Description �����û���Ϣ
	 * @time 2020��11��13�� ����9:23:12 
	 * @author ����� 
	 */
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO User(username,userpassword,phonenumber,emailaddress,userimg,regdate) VALUES (?,?,?,?,?,?);";
		Object[] params = {user.getUserName(),user.getUserPassword(),user.getPhoneNumber(),user.getEmailAddress(),user.getUserImg(),user.getRegDate()};
		return this.modifyObj(sql, params);
	}

	/**@Description ɾ���û���Ϣ
	 * @time 2020��11��13�� ����9:23:12 
	 * @author ����� 
	 */
	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		String sql ="delete from User where userid=?";
		Object[] params = {user.getUserId()};
		return this.modifyObj(sql, params);
	}
	
	/**@Description ����ID��ѯ�û�
	 * @time 2020��11��13�� ����9:23:12 
	 * @author ����� 
	 */
	@Override
	public ArrayList findUser(User user) {
		String sql = "select * from User where userid=?";
		Object[] params = {user.getUserId()};
		return this.findObjs(sql, params, User.class);
	}
	
	/**@Description ����ĳ����Ϣ��ѯ�û�
	 * @time 2020��11��13�� ����9:23:12 
	 * @author ����� 
	 */
	@Override
	public ArrayList<User> findUserBy(String sql, Object[] params) {
		return this.findObjs(sql,params, User.class);
	}
	
	/**@Description ��ѯ�û�����
	 * @time 2020��11��13�� ����9:23:12 
	 * @author ����� 
	 */
	@Override
	public int getTotalUserRecords() {
		String strsql = "select count(*) from User";
		return getTotalRecords(strsql);
		
	}
	
}
