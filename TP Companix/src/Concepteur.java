import java.util.Date;

public class Concepteur extends Salaries {
    private int ann�esD�veloppement;

    public Concepteur(String code, String nom, String pr�nom, Date dateEmbauche, int ann�esD�veloppement) {
        super(code, nom, pr�nom, dateEmbauche);
        this.ann�esD�veloppement = ann�esD�veloppement;
    }

    public int getAnn�esD�veloppement() {
        return ann�esD�veloppement;
    }

    public void setAnn�esD�veloppement(int ann�esD�veloppement) {
        this.ann�esD�veloppement = ann�esD�veloppement;
    }

    @Override
    public String toString() {
        return super.toString() + "| Ann�es de d�veloppement: " + ann�esD�veloppement;
    }
}
