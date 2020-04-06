import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.FactoryBean;

public class DBConnection implements FactoryBean<Connection> {
	private BasicDataSource bds;
	public void setBds(BasicDataSource bds) {
		this.bds = bds;
	}

	@Override
	public Connection getObject() throws Exception {
		return bds.getConnection();
	}

	@Override
	public Class<Connection> getObjectType() {
		return Connection.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
