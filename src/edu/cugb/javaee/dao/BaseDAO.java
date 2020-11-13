package edu.cugb.javaee.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import edu.cugb.javaee.utils.JDBCUtils;
/**
 * @Description 所有dao的父类 
 * @time 2020年11月13日 上午9:37:19 
 * @author 王瑞
 */
public abstract class BaseDAO {
	/**
	 * @Description  查询操作，返回查到对象的集合
	 * @time 2020年11月13日 上午9:32:48 
	 * @author 王瑞
	 */
	public ArrayList findObjs(String sql,Object[] params, Class clazz) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList objList = null;
		try {
			conn = JDBCUtils.getConnection();
			// 创建statement对象
			ps = conn.prepareStatement(sql);
			if(null != params){
				ParameterMetaData pm = ps.getParameterMetaData();
				for (int i = 1; i <= pm.getParameterCount(); i++) {
					ps.setObject(i, params[i-1]);
				}
			}
			// 处理结果集
			rs = ps.executeQuery();
			objList = new ArrayList();
			while (rs.next()) {
				Object obj = MappingObj(rs, clazz);
				objList.add(obj);
			}
			return objList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
		return null;
	}

	/**
	 * @Description 将查询到的resultset根据类类型封装为该类型的对象 
	 * @time 2020年11月13日 上午9:34:30 
	 * @author 王瑞
	 */
	private Object MappingObj(ResultSet rs, Class clazz) throws SQLException {
		// 实例化对象
		Object obj = null;
		try {
			obj = clazz.newInstance();
			// 获取映射对象的方法集合
			Method[] methods = clazz.getMethods();
			// 获取结果集中元数据信息
			ResultSetMetaData meta = rs.getMetaData();
			// 按字段数目循环结果集中记录，进行对象映射
			int j = meta.getColumnCount();
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				// 构造当前列的set方法名称
				String colName = meta.getColumnLabel(i);
				String methodName = "set" + colName;
				// 循环查找同名方法，并通过反射调用该方法，设置属性值
				for (Method method : methods) {
					if (method.getName().equals(methodName)) {
						Object rsobj = rs.getObject(i);
						method.invoke(obj, rsobj);
						break;
					}
				}				
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * @Description 执行删除、更新、插入操作，返回影响语句条数 
	 * @time 2020年11月13日 上午9:35:48 
	 * @author 王瑞
	 */
	public int modifyObj(String sql, Object[] params) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			// 创建statement对象
			ps = conn.prepareStatement(sql);
			ParameterMetaData pm = ps.getParameterMetaData();
			for (int i = 1; i <= pm.getParameterCount(); i++) {
				ps.setObject(i, params[i-1]);
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
		return 0;
	}
	
	/**
	 * @Description 查询总条数 
	 * @time 2020年11月13日 上午9:36:45 
	 * @author 王瑞
	 */
	public int getTotalRecords(String sql){
		int count = 0;
		try {
			Connection conn = JDBCUtils.getConnection();
			
//			String sql = "select count(*) from dish ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
			}
			JDBCUtils.free(rs, ps, conn);
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return count;
	}
}
