package org.sheikh.itech.dal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public final class Utility {

	private static Connection connection = null;

	private Utility() {

	}

	static {
		try {

			Properties properties = new Properties();
			properties.load(Utility.class.getClassLoader().getResourceAsStream("db.properties"));

			Class.forName(properties.getProperty("driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),
					properties.getProperty("pass"));
			 //System.out.println("done");

		} catch (ClassNotFoundException e) {
			 System.out.println("CNFEx:" + e);
		} catch (SQLException e) {
			 System.out.println("SQLEx:" + e);
		} catch (IOException e) {
			System.out.println("IOEx:" + e);
		}
	}

	public static Connection getConnection() {

		return connection;
	}

	public static void close(PreparedStatement ps, ResultSet rs) {
        try {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
        }
    }

/*
  public static void main(String [] args) throws SQLException {
	  
  }
*/
}
