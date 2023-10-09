import java.util.Date;

public class Analyste extends Salaries {
    private int déplacementsClient;

    public Analyste(String code, String nom, String prénom, Date dateEmbauche, int déplacementsClient) {
        super(code, nom, prénom, dateEmbauche);
        this.déplacementsClient = déplacementsClient;
    }

    public int getDéplacementsClient() {
        return déplacementsClient;
    }

    public void setDéplacementsClient(int déplacementsClient) {
        this.déplacementsClient = déplacementsClient;
    }

    @Override
    public String toString() {
        return super.toString() + "| Déplacements clients: " + déplacementsClient;
    }
}
