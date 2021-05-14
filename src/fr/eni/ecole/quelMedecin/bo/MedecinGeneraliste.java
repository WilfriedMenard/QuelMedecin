package fr.eni.ecole.quelMedecin.bo;

import java.util.Locale;
import java.time.LocalTime;

/**
 * Classe qui représente les coordonnées d'un médecin généraliste
 * @version : 1.0
 * @author : Wilfried Menard
 */
public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numTelephone;
    private Adresse adresseMedecin;
    private Creneau[] listeCreneaux = new Creneau[15];
    private static int tarif = 25;

    // Constructeur
    public MedecinGeneraliste(String nom, String prenom , String numTelephone, Adresse adresseMedecin, Creneau[] listeCreneaux) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTelephone = numTelephone;
        this.adresseMedecin = adresseMedecin;
        this.listeCreneaux = listeCreneaux;
    }

    public MedecinGeneraliste(String nom, String prenom,  String numTelephone, Adresse adresseMedecin) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTelephone = numTelephone;
        this.adresseMedecin = adresseMedecin;
    }
    // Les getter et setter
    public String getNom() { return nom; }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    /**
     * Afficher sous la forme :
     * NOM Prenom
     * Téléphone : XXXXXXXXXX
     * Tarif : XX€
     * Adresse :
     * [Complément d'adresse]
     * Numero de rue Nom de rue
     * Code Postal Ville
     */

    // L'affichage
    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %S%nTarif : %d€%nAdresse :%n",this.nom.toUpperCase(), this.prenom, this.numTelephone, MedecinGeneraliste.tarif);
        this.adresseMedecin.afficher();
        for (int i = 0; i < this.listeCreneaux.length; i++) {
            this.listeCreneaux[i].afficher();
        }
    }

    // Creation du tableau en association bidirectionnelle avec la classe Creneau
    public void ajouterCreneau(Creneau ajoutDeCreneau) {
        for (int i = 0; i < this.listeCreneaux.length; i++) {
            if (this.listeCreneaux[i] == null) {
                this.listeCreneaux[i] = ajoutDeCreneau;
            break;
            }
        }
    }
}
