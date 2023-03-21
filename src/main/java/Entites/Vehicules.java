package Entites;

public class Vehicules {
    private int id, kilometrage;
    private String type, modele, couleur, marque, image;
    private User user = new User();
    public Vehicules()
    {

    }
    public Vehicules(int id, int kilometrage, String type, String modele, String couleur, String marque, String image)
    {
        this.id=id;
        this.kilometrage=kilometrage;
        this.type=type;
        this.modele=modele;
        this.couleur=couleur;
        this.marque=marque;
        this.image=image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
