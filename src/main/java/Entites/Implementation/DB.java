package Entites.Implementation;

import java.sql.*;

public class DB {
    // Pour la connexion
    private Connection connexion;
    // Pour les resultats de requetes de type select
    private ResultSet resultSet;
    // Pour les requetes preparees
    private PreparedStatement preparedStatement;
    // Pour les requetes de type (insert, update, delete)
    private int ok;
    public void getConnexion()
    {
        String url = "jdbc:mysql://localhost:3306/interface";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void initPrepa(String sql)
    {
        try {
            getConnexion();
            preparedStatement = connexion.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet excuteSelect() {
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    public int Maj()
    {
        try{
            ok = preparedStatement.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ok;
    }
    public void closeConnexion()
    {
        try{
            if(connexion!=null)
                connexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public PreparedStatement getPreparedStatement() throws SQLException
    {
        return preparedStatement;
    }
}
