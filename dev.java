



abstract public class Etudiant{

    private static int compt = 0;
    private int id = 0;
    private String matricule;
    private String nom;
    private String prenom;
    private String dateNaiss;


    public static void main(String args[]) 
    { 
        
    } 
    

    private Etudiant[] etudiants;

    //Max etudiants
    private final static int  MAXEtudiants = 10000;

    public Etudiant(String matricule, String nom, String prenom, String dateNaiss){

        Etudiant.compt += 1;
        this.id = Etudiant.compt;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateNaiss = dateNaiss;
    }

    public void affiche() {

        System.out.println("Nom de l'etudiant :" + this.nom);
        System.out.println("Prenom de l'etudiant" + this.prenom);
        System.out.println("Adresse de l'etudiant" + this.addresse);
    }


    public void EnregistrerEtudiant(Etudiant Etudiant){

        if (this.id <= MAXEtudiants) {

            etudiants[MAXEtudiants - 1] = Etudiant;

        } else {

            System.out.println("Pas plus de " + MAXEtudiants + " Etudiants");
        }

    }


    public void afficheBoursiers(){

        for(Etudiant e : etudiants){

            if(e instanceof Boursier){

                e.affiche();
            }
        }
    }

    public void afficheNonBoursiers(){

        for(Etudiant e : etudiants){

            if(e instanceof NonBoursier){

                e.affiche();
            }
        }
    }

}

class Boursier extends Etudiant{

    private String matricule;
    private double montant;
    

    public Boursier(String matricule, String nom, String prenom, String dateNaiss, String type, double nomtant){

        super(String matricule, String nom, String prenom, String dateNaiss);
        this.type = type;
        this.montant = montant;
    }

    public void affiche() {

        println("Etudiants boursiers: ");
        super.affiche();
    }
}

class NonBoursier extends Etudiant{

    private final static double AIDE = 60000;
    private String addresse;

    public nonBoursier(String matricule, String nom, String prenom, String dateNaiss, String addresse){

        super(String matricule, String nom, String prenom, String dateNaiss);
        this.addresse = addresse;
    }

    public void affiche() {

        println("Etudiants non boursiers: ");
        super.affiche();
    }

}

class Nonloge extends Etudiant{

    private String addresse;

    public nonLoge(String matricule, String nom, String prenom, String dateNaiss, String addresse){

        super(String matricule, String nom, String prenom, String dateNaiss);
        this.addresse = addresse;
    }

    public void affiche() {

        println("Etudiants non boursiers: ");
        super.affiche();
    }
    
    
}