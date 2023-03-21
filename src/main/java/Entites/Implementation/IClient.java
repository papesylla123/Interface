package Entites.Implementation;

import Entites.Client;

import java.util.List;

public interface IClient {
    public int add(Client client);
    public  int update(Client client);
    public  int delete(Client client);
    public List<Client> lister(int id);
    public Client get(int id);
}
