package com.awc.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;
@Component
public class DBConnection {
	static Properties prop;
	static BasicDataSource bds;
	public static void setProp(Properties prop) {
		DBConnection.prop = prop;
	}
	public static void setBds(BasicDataSource bds) {
		DBConnection.bds = bds;
	}
	public Connection getConnection() {
		Connection conn=null;
		try {
			bds.setDriver((Driver)Class.forName(prop.getProperty("driver")).newInstance());
			bds.setUrl(prop.getProperty("url"));
			bds.setUsername(prop.getProperty("user"));
			bds.setPassword(prop.getProperty("password"));
			conn=bds.getConnection();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
