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
 * @Description ����dao�ĸ��� 
 * @time 2020��11��13�� ����9:37:19 
 * @author ����
 */
public abstract class BaseDAO {
	/**
	 * @Description  ��ѯ���������ز鵽����ļ���
	 * @time 2020��11��13�� ����9:32:48 
	 * @author ����
	 */
	public ArrayList findObjs(String sql,Object[] params, Class clazz) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList objList = null;
		try {
			conn = JDBCUtils.getConnection();
			// ����statement����
			ps = conn.prepareStatement(sql);
			if(null != params){
				ParameterMetaData pm = ps.getParameterMetaData();
				for (int i = 1; i <= pm.getParameterCount(); i++) {
					ps.setObject(i, params[i-1]);
				}
			}
			// ��������
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
	 * @Description ����ѯ����resultset���������ͷ�װΪ�����͵Ķ��� 
	 * @time 2020��11��13�� ����9:34:30 
	 * @author ����
	 */
	private Object MappingObj(ResultSet rs, Class clazz) throws SQLException {
		// ʵ��������
		Object obj = null;
		try {
			obj = clazz.newInstance();
			// ��ȡӳ�����ķ�������
			Method[] methods = clazz.getMethods();
			// ��ȡ�������Ԫ������Ϣ
			ResultSetMetaData meta = rs.getMetaData();
			// ���ֶ���Ŀѭ��������м�¼�����ж���ӳ��
			int j = meta.getColumnCount();
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				// ���쵱ǰ�е�set��������
				String colName = meta.getColumnLabel(i);
				String methodName = "set" + colName;
				// ѭ������ͬ����������ͨ��������ø÷�������������ֵ
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
	 * @Description ִ��ɾ�������¡��������������Ӱ��������� 
	 * @time 2020��11��13�� ����9:35:48 
	 * @author ����
	 */
	public int modifyObj(String sql, Object[] params) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			// ����statement����
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
	 * @Description ��ѯ������ 
	 * @time 2020��11��13�� ����9:36:45 
	 * @author ����
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
