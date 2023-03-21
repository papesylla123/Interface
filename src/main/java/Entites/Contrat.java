package Entites;

public class Contrat {
    private int id;
    private String intitule;
    private User user = new User();
    public Contrat()
    {

    }
    public Contrat(int id, String intitule, User user)
    {
        this.id=id;
        this.intitule=intitule;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
