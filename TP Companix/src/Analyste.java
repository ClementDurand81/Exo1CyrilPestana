import java.util.Date;

public class Analyste extends Salaries {
    private int d�placementsClient;

    public Analyste(String code, String nom, String pr�nom, Date dateEmbauche, int d�placementsClient) {
        super(code, nom, pr�nom, dateEmbauche);
        this.d�placementsClient = d�placementsClient;
    }

    public int getD�placementsClient() {
        return d�placementsClient;
    }

    public void setD�placementsClient(int d�placementsClient) {
        this.d�placementsClient = d�placementsClient;
    }

    @Override
    public String toString() {
        return super.toString() + "| D�placements clients: " + d�placementsClient;
    }
}
