package com.example.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                // Chargement du driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Configuration de la connexion à la base de données
                String url = "jdbc:mysql://localhost:3306/ma_base_de_donnees";
                String user = "mon_utilisateur";
                String password = "mon_mot_de_passe";

                // Établissement de la connexion
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                System.out.println("Erreur lors du chargement du driver JDBC");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Erreur lors de l'établissement de la connexion à la base de données");
                e.printStackTrace();
                throw e;
            }
        }
        return connection;
    }
}
