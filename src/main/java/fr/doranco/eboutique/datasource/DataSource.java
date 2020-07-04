package fr.doranco.eboutique.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSource {

	private static DataSource instance;
	
	private DataSource() {
	}

	public static DataSource getInstance() {
		
		if (instance == null) {
			return new DataSource();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		
		Connection connection = null;
		ResourceBundle rb = ResourceBundle.getBundle("fr.doranco.eboutique.bdd.dbfile");
		String url = rb.getString("url");
		String login = rb.getString("login");
		String password = rb.getString("mdp");

		try {
			connection = DriverManager.getConnection(url, login, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}


}
