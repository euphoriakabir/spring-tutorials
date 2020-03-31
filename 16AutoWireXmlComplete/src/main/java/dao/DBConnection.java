package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import properties.PropertiesReader;

public class DBConnection {
	private BasicDataSource bds;
	private PropertiesReader pr;
	public DBConnection() {
	}
	public DBConnection(BasicDataSource bds, PropertiesReader pr) {
		super();
		this.bds = bds;
		this.pr = pr;
	}
	public BasicDataSource getBds() {
		return bds;
	}
	
	public void setBds(BasicDataSource bds) {
		this.bds = bds;
	}
	public PropertiesReader getPr() {
		return pr;
	}
	
	public void setPr(PropertiesReader pr) {
		this.pr = pr;
	}
	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		bds.setDriver((Driver) Class.forName(pr.getProp().getProperty("driver")).newInstance());
		bds.setUrl(pr.getProp().getProperty("url"));
		bds.setUsername(pr.getProp().getProperty("user"));
		bds.setPassword(pr.getProp().getProperty("password"));
		bds.setMaxIdle(10);
		bds.setMinIdle(5);
		return bds.getConnection();
	}
}
