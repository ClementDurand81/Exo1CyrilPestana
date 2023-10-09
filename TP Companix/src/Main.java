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
        List<Salaries> listeDesSalariés = new ArrayList<>();

        while (true) {
            System.out.println("Faites votre choix (1, 2, 3, 4, 5, 6) :");
            System.out.println("1- Ajouter un Concepteur");
            System.out.println("2- Supprimer un Concepteur");
            System.out.println("3- Lister les salariés existants");
            System.out.println("4- Ajouter un Analyste");
            System.out.println("5- Supprimer un Analyste");
            System.out.println("6- Lister les salariés en fonction de Concepteur ou Analyste");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Saisir le code, nom, prénom, date d'embauche et nombre d'année de développement :");
                    String saisie = scanner.nextLine();
                    String[] saisieSplit = saisie.split("-");
                    if (saisieSplit.length == 5) {
                        String code = saisieSplit[0];
                        String nom = saisieSplit[1];
                        String prénom = saisieSplit[2];
                        Date dateEmbauche = new SimpleDateFormat("dd/MM/yyyy").parse(saisieSplit[3]);
                        int annéesDéveloppement = Integer.parseInt(saisieSplit[4]);
                        Concepteur concepteur = new Concepteur(code, nom, prénom, dateEmbauche, annéesDéveloppement);
                        listeDesSalariés.add(concepteur);
                        System.out.println("Concepteur a été ajouté.");
                    } else {
                        System.out.println("Saisie incorrecte.");
                    }
                    break;

                case 2:
                    System.out.println("Saisir le code du concepteur à supprimer :");
                    String codeASupprimer = scanner.nextLine();
                    boolean supprimé = false;
                    for (Salaries salarié : listeDesSalariés) {
                        if (salarié instanceof Concepteur && salarié.getCode().equals(codeASupprimer)) {
                            listeDesSalariés.remove(salarié);
                            supprimé = true;
                            System.out.println("Le Concepteur" +codeASupprimer+ " a été supprimé.");
                            break;
                        }
                    }
                    if (!supprimé) {
                        System.out.println("Aucun concepteur n'a été trouvé avec ce code.");
                    }
                    break;

                case 3:
                    for (Salaries salarié : listeDesSalariés) {
                        System.out.println(salarié.toString());
                    }
                    break;
                
                case 4:
                	System.out.println("Saisir le code, nom, prénom, date d'embauche et nombre déplacements client :");
                    String saisie1 = scanner.nextLine();
                    String[] saisieSplit1 = saisie1.split("-");
                    if (saisieSplit1.length == 5) {
                        String code = saisieSplit1[0];
                        String nom = saisieSplit1[1];
                        String prénom = saisieSplit1[2];
                        Date dateEmbauche = new SimpleDateFormat("dd/MM/yyyy").parse(saisieSplit1[3]);
                        int déplacementsClient = Integer.parseInt(saisieSplit1[4]);
                        Analyste analyste = new Analyste(code, nom, prénom, dateEmbauche, déplacementsClient);
                        listeDesSalariés.add(analyste);
                        System.out.println("Analyste a été ajouté.");
                    } else {
                        System.out.println("Saisie incorrecte.");
                    }
                    break;
                    
                case 5:
                	System.out.println("Saisir le code de l'analyste à supprimer :");
                    String codeASupprimer1 = scanner.nextLine();
                    boolean supprimé1 = false;
                    for (Salaries salarié : listeDesSalariés) {
                        if (salarié instanceof Analyste && salarié.getCode().equals(codeASupprimer1)) {
                            listeDesSalariés.remove(salarié);
                            supprimé1 = true;
                            System.out.println("L'Analyste" +codeASupprimer1+ " a été supprimé.");
                            break;
                        }
                    }
                    if (!supprimé1) {
                        System.out.println("Aucun Analyste trouvé avec ce code.");
                    }
                    break;
                    
                case 6:
                	for (Salaries salarié : listeDesSalariés) {
                        if (salarié instanceof Concepteur) {
                        	System.out.println("Concepteur :" +salarié);
                        } else if (salarié instanceof Analyste) {
                        	System.out.println("Analyste :" +salarié);
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
