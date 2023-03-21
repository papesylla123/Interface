package Entites;

public class User {
    private int id, telephone;
    private String nom, prenom, adresse, password, email;
    private Client client= new Client();
    private Employe employe= new Employe();
    public User()
    {

    }
    public User(int id, int telephone, String nom, String prenom, String adresse, String password, Client client, Employe employe,String email)
    {
        this.email=email;
        this.client= client;
        this.employe= employe;
        this.adresse=adresse;
        this.id=id;
        this.prenom=prenom;
        this.nom=nom;
        this.password=password;
        this.telephone=telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
