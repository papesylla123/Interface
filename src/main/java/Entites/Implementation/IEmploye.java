package Entites.Implementation;

import Entites.Employe;

import java.util.List;

public interface IEmploye {
    public int add(Employe employe);
    public  int update(Employe employe);
    public  int delete(Employe employe);
    public List<Employe> lister(int id);
    public Employe get(int id);
}
