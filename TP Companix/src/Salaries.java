import java.text.SimpleDateFormat;
import java.util.Date;

public class Salaries {
    private String code;
    private String nom;
    private String prénom;
    private Date dateEmbauche;

    public Salaries(String code, String nom, String prénom, Date dateEmbauche) {
        this.code = code;
        this.nom = nom;
        this.prénom = prénom;
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

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
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
        return "Code: " + code + " | Nom: " + nom + " | Prénom: " + prénom + " | Date d'embauche: " + date.format(dateEmbauche);
    }
}
