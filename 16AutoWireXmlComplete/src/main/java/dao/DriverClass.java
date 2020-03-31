package dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("constructor.xml");
		DBConnection dbconn=(DBConnection)ctx.getBean("dbconn");
		for(int i=0;i<20;i++) {
			System.out.println(dbconn.getConnection());
		}
	}

}
