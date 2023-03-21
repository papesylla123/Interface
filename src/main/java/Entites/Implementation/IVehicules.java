package Entites.Implementation;

import Entites.User;

import java.util.List;

public interface IVehicules {
    public int add(User user);
    public  int update(User user);
    public  int delete(User user);
    public List<User> lister(int id);
}
