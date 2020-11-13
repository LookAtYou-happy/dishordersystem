package edu.cugb.javaee.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DAOFactory {
	static String daoimplname;
	static Properties prop;

	private DAOFactory() {

	}

	static {
		JDBCUtils.class.getClassLoader();
		InputStream in = DAOFactory.class.getClassLoader().
				getResourceAsStream("daoconfig.properties");
		prop = new Properties();
		try {
			prop.load(in);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static Object newInstance(String daoname) {		
		try {
			daoimplname = prop.getProperty(daoname);
			return Class.forName(daoimplname).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

