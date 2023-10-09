import java.util.Date;

public class Concepteur extends Salaries {
    private int annéesDéveloppement;

    public Concepteur(String code, String nom, String prénom, Date dateEmbauche, int annéesDéveloppement) {
        super(code, nom, prénom, dateEmbauche);
        this.annéesDéveloppement = annéesDéveloppement;
    }

    public int getAnnéesDéveloppement() {
        return annéesDéveloppement;
    }

    public void setAnnéesDéveloppement(int annéesDéveloppement) {
        this.annéesDéveloppement = annéesDéveloppement;
    }

    @Override
    public String toString() {
        return super.toString() + "| Années de développement: " + annéesDéveloppement;
    }
}
