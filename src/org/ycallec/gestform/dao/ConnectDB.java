package org.ycallec.gestform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.Statement;

public class ConnectDB {

	public static Connection getConnection () {
		//Connection à la base de donnée 
		String url = "jdbc:mysql://localhost/java";
		String login = "root";
		String passwd = "pouet";
		Connection cn =null;
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2 : récupération de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			return cn;
	}


}
