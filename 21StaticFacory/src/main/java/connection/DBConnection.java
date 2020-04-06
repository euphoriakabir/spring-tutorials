package connection;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBConnection {
	private DBConnection() {
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	private static BasicDataSource bds;

	public static void setBds(BasicDataSource bds) {
		DBConnection.bds = bds;
	}
	public static Connection getConnection() {
		Connection conn=null;
		try {
			conn=bds.getConnection();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
