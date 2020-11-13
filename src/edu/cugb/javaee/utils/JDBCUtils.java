package edu.cugb.javaee.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import edu.cugb.javaee.bean.User;

@SuppressWarnings("static-access")
public class JDBCUtils {
	static DataSource myds;
	private JDBCUtils() {
	}
	static {
		InputStream in = JDBCUtils.class.getClassLoader().
				getResourceAsStream("dbcpconfig.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			myds = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User users = null;
		try {		
//			return DriverManager.getConnection(url, user, pwd);
			return myds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void free(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
