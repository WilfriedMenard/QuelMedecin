package fr.eni.ecole.quelMedecin.bo;

import java.util.Locale;

/**
 * Classe qui représente les coordonnées d'un médecin généraliste
 * @version : 1.0
 * @author : Wilfried Menard
 */
public class MedecinGeneraliste {
        private String prenom;
        private String nom;
        private String numTelephone;
        private static int tarif = 25;

        public MedecinGeneraliste(String nom, String prenom, String numTelephone) {
            this.nom = nom;
            this.prenom = prenom;
            this.numTelephone = numTelephone;
    }

    public String getNom() {
        return nom;
    }

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
     */
    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %S%nTarif : %d€%n",this.nom.toUpperCase(), this.prenom, this.numTelephone, MedecinGeneraliste.tarif);
    }
}
