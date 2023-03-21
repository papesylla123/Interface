package Entites.Implementation;

import Entites.Assurance;

import java.util.List;

public interface IAssurance {

    public int add(Assurance assurance);
    public  int update(Assurance assurance);
    public  int delete(Assurance assurance);
    public List<Assurance> lister(int id);

}
