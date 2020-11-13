package edu.cugb.javaee.dao;

import java.util.ArrayList;

import edu.cugb.javaee.bean.Admin;
import edu.cugb.javaee.bean.Admin;

public class AdminDAO extends BaseDAO implements IAdminDAO {
	/**
	 * @Description 更新管理员信息
	 * @time 2020年11月13日 下午3:58:52 
	 * @author 任星韬
	 */
	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql ="update Admin set adminname=?,adminpassword=?,phonenumber=?,emailaddress=?,regdate=? where adminid=?";
		Object[] params = {admin.getAdminName(),admin.getAdminPassword(),admin.getPhoneNumber(),admin.getEmailAddress(),admin.getRegDate(),admin.getAdminId()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description  更新管理员的某几项信息
	 * @time 2020年11月13日 下午4:10:21 
	 * @author 任星韬
	 */
	@Override
	public int updateAdminBy(String sql, Object[] params) {
		// TODO Auto-generated method stub
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description  插入管理员信息
	 * @time 2020年11月13日 下午3:59:55 
	 * @author 任星韬
	 */
	@Override
	public int insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO Admin(adminname,adminpassword,phonenumber,emailaddress,regdate) VALUES (?,?,?,?,?);";
		Object[] params = {admin.getAdminName(),admin.getAdminPassword(),admin.getPhoneNumber(),admin.getEmailAddress(),admin.getRegDate()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description  删除管理员
	 * @time 2020年11月13日 下午4:00:11 
	 * @author 任星韬
	 */
	@Override
	public int deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql ="delete from Admin where adminid=?";
		Object[] params = {admin.getAdminId()};
		return this.modifyObj(sql, params);
	}

	/**
	 * @Description 根据ID查询管理员 
	 * @time 2020年11月13日 下午4:00:34 
	 * @author 任星韬
	 */
	@Override
	public ArrayList findAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql = "select * from Admin where adminid=?";
		Object[] params = {admin.getAdminId()};
		return this.findObjs(sql, params, Admin.class);
	}

	/**
	 * @Description 根据某个信息查询管理员信息
	 * @time 2020年11月12日 下午9:01:06 
	 * @author 任星韬
	 */
	@Override
	public ArrayList<Admin> findAdminBy(String sql, Object[] params) {
		// TODO Auto-generated method stub
		return this.findObjs(sql,params, Admin.class);
	}

	/**
	 * @Description 查询管理员总数 
	 * @time 2020年11月13日 下午4:03:10 
	 * @author 任星韬
	 */
	@Override
	public int getTotalAdminRecords() {
		// TODO Auto-generated method stub
		String strsql = "select count(*) from admin";
		return getTotalRecords(strsql);
	}

}
