package Entites;

import java.util.Date;

public class Assurance {
    private int id;
    private Date date;
    private Employe employe = new Employe();
    public Assurance()
    {

    }
    public Assurance(int id, Date date, Employe employe)
    {
        this.id=id;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
