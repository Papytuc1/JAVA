package gestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Modele {

	public static Connection startConnection() {		
		String url = "jdbc:mysql://127.0.0.1/glossaire";
		String utilisateur = "root";
		String motDePasse = "";    
		Connection co = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			co = (Connection) DriverManager.getConnection(url, utilisateur, motDePasse);
			if (!co.isClosed()) {
				System.out.println(
						"Connexion au serveur... OK"
						);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Exception: " + e.getMessage());
		}
		return co;	    
	}
	public static void closeConnection(Connection co) {
		if (co != null) {
			try {
				co.close();
			} catch (SQLException e) {
				System.err.println("Erreur fermreture: " + e.getMessage());
			}
		}
	}
}
