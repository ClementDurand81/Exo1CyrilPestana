import java.text.SimpleDateFormat;
import java.util.Date;

public class Salaries {
    private String code;
    private String nom;
    private String pr�nom;
    private Date dateEmbauche;

    public Salaries(String code, String nom, String pr�nom, Date dateEmbauche) {
        this.code = code;
        this.nom = nom;
        this.pr�nom = pr�nom;
        this.dateEmbauche = dateEmbauche;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPr�nom() {
        return pr�nom;
    }

    public void setPr�nom(String pr�nom) {
        this.pr�nom = pr�nom;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        return "Code: " + code + " | Nom: " + nom + " | Pr�nom: " + pr�nom + " | Date d'embauche: " + date.format(dateEmbauche);
    }
}
