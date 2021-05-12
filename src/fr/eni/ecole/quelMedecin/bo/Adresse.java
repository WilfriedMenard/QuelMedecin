package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente l'adresse d'un médecin généraliste
 * @version : 1.0
 * @author : Wilfried Menard
 */
public class Adresse {
    private String complementAdresse;
    private int numeroRue;
    private String complementNumero;
    private String nomRue;
    private int codePostal;
    private String nomVille;

    public Adresse(String complementAdresse, int numeroRue, String complementNumero, String nomRue, int codePostal, String nomVille) {
        this.complementAdresse = complementAdresse;
        this.numeroRue = numeroRue;
        this.complementNumero = complementNumero;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }

    public Adresse(int numeroRue, String complementNumero, String nomRue, int codePostal, String nomVille) {
        this.numeroRue = numeroRue;
        this.complementNumero = null;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }

    /**
     * Afficher sous la forme :
     * [Complément d'adresse]
     * Numero de rue Nom de rue
     * Code Postal Ville
     */
    public void afficher() {
        System.out.println(this.complementAdresse != null ? this.complementAdresse : "Aucun complément d'adresse");
        System.out.printf("%d %s%n"+"%05d %s%n",this.numeroRue, this.nomRue, this.codePostal, this.nomVille);
    }
}



