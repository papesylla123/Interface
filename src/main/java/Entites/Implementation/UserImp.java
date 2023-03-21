package Entites.Implementation;

import Entites.User;

import java.sql.ResultSet;

public class UserImp implements IUser {
    private DB db = new DB();
    @Override
    public User getConnexion(String email, String password) {
        User user = null;
        String sql ="SELECT * FROM user where email =? And password = ?";
        try {
            db.initPrepa(sql);
            db.getPreparedStatement().setString(1, email);
            db.getPreparedStatement().setString(2, password);
            ResultSet resultSet= db.excuteSelect();
            if (resultSet.next())
            {
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setEmail(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setEmploye(null);
                user.setClient(null);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }
}
