package com.vti.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	private Properties properties;
	private Connection connection;
	
	public JdbcUtils() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		properties = new Properties();
		properties.load(new FileInputStream("src\\main\\resource\\database.properties"));
		properties.load(new FileInputStream("src\\main\\resource\\message.properties"));
		connect();
	}
	
	public Connection connect() throws ClassNotFoundException, SQLException{
		if (connection != null && !connection.isClosed()) {
			return connection;
		}

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
