package Entites;

public class Employe {
    private int id;
    private String fonction;
    public Employe()
    {

    }
    public  Employe(int id, String fonction)
    {
        this.fonction=fonction;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
