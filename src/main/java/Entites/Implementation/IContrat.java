package Entites.Implementation;

import Entites.Contrat;

import java.util.List;

public interface IContrat {
    public int add(Contrat contrat);
    public  int update(Contrat contrat);
    public  int delete(Contrat contrat);
    public List<Contrat> lister(int id);
}
