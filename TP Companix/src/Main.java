import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Salaries> listeDesSalari�s = new ArrayList<>();

        while (true) {
            System.out.println("Faites votre choix (1, 2, 3, 4, 5, 6) :");
            System.out.println("1- Ajouter un Concepteur");
            System.out.println("2- Supprimer un Concepteur");
            System.out.println("3- Lister les salari�s existants");
            System.out.println("4- Ajouter un Analyste");
            System.out.println("5- Supprimer un Analyste");
            System.out.println("6- Lister les salari�s en fonction de Concepteur ou Analyste");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Saisir le code, nom, pr�nom, date d'embauche et nombre d'ann�e de d�veloppement :");
                    String saisie = scanner.nextLine();
                    String[] saisieSplit = saisie.split("-");
                    if (saisieSplit.length == 5) {
                        String code = saisieSplit[0];
                        String nom = saisieSplit[1];
                        String pr�nom = saisieSplit[2];
                        Date dateEmbauche = new SimpleDateFormat("dd/MM/yyyy").parse(saisieSplit[3]);
                        int ann�esD�veloppement = Integer.parseInt(saisieSplit[4]);
                        Concepteur concepteur = new Concepteur(code, nom, pr�nom, dateEmbauche, ann�esD�veloppement);
                        listeDesSalari�s.add(concepteur);
                        System.out.println("Concepteur a �t� ajout�.");
                    } else {
                        System.out.println("Saisie incorrecte.");
                    }
                    break;

                case 2:
                    System.out.println("Saisir le code du concepteur � supprimer :");
                    String codeASupprimer = scanner.nextLine();
                    boolean supprim� = false;
                    for (Salaries salari� : listeDesSalari�s) {
                        if (salari� instanceof Concepteur && salari�.getCode().equals(codeASupprimer)) {
                            listeDesSalari�s.remove(salari�);
                            supprim� = true;
                            System.out.println("Le Concepteur" +codeASupprimer+ " a �t� supprim�.");
                            break;
                        }
                    }
                    if (!supprim�) {
                        System.out.println("Aucun concepteur n'a �t� trouv� avec ce code.");
                    }
                    break;

                case 3:
                    for (Salaries salari� : listeDesSalari�s) {
                        System.out.println(salari�.toString());
                    }
                    break;
                
                case 4:
                	System.out.println("Saisir le code, nom, pr�nom, date d'embauche et nombre d�placements client :");
                    String saisie1 = scanner.nextLine();
                    String[] saisieSplit1 = saisie1.split("-");
                    if (saisieSplit1.length == 5) {
                        String code = saisieSplit1[0];
                        String nom = saisieSplit1[1];
                        String pr�nom = saisieSplit1[2];
                        Date dateEmbauche = new SimpleDateFormat("dd/MM/yyyy").parse(saisieSplit1[3]);
                        int d�placementsClient = Integer.parseInt(saisieSplit1[4]);
                        Analyste analyste = new Analyste(code, nom, pr�nom, dateEmbauche, d�placementsClient);
                        listeDesSalari�s.add(analyste);
                        System.out.println("Analyste a �t� ajout�.");
                    } else {
                        System.out.println("Saisie incorrecte.");
                    }
                    break;
                    
                case 5:
                	System.out.println("Saisir le code de l'analyste � supprimer :");
                    String codeASupprimer1 = scanner.nextLine();
                    boolean supprim�1 = false;
                    for (Salaries salari� : listeDesSalari�s) {
                        if (salari� instanceof Analyste && salari�.getCode().equals(codeASupprimer1)) {
                            listeDesSalari�s.remove(salari�);
                            supprim�1 = true;
                            System.out.println("L'Analyste" +codeASupprimer1+ " a �t� supprim�.");
                            break;
                        }
                    }
                    if (!supprim�1) {
                        System.out.println("Aucun Analyste trouv� avec ce code.");
                    }
                    break;
                    
                case 6:
                	for (Salaries salari� : listeDesSalari�s) {
                        if (salari� instanceof Concepteur) {
                        	System.out.println("Concepteur :" +salari�);
                        } else if (salari� instanceof Analyste) {
                        	System.out.println("Analyste :" +salari�);
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }
}
