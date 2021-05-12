package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Classe qui représente les coordonnées d'un patient
 * @version : 1.0
 * @author : Wilfried Menard
 */
public class Patient {
    private String prenom;
    private String nom;
    private String numTelephone;
    private char sexe;
    private long numSecuSociale;
    private LocalDate dateNaissance;
    private String commentaires = null;
    private Adresse adressePatient;

    public Patient(String prenom, String nom, String numTelephone, char sexe, long numSecuSociale, LocalDate dateNaissance, String commentaires, Adresse adressePatient) {
        this.prenom = prenom;
        this.nom = nom;
        this.numTelephone = numTelephone;
        this.sexe = sexe;
        this.numSecuSociale = numSecuSociale;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
        this.adressePatient = adressePatient;
    }

    /**
     * Afficher sous la forme :
     * NOM Prenom
     * Téléphone : XXXXXXXXXX
     * Sexe : Féminin ou Masculin
     * Numéro de Sécurité sociale : XXXXXXXXXXXXXXXX
     * Date de Naissance : XXXX-XX-XX
     * Commentaires : ...
     */
    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %s%nSexe : %s%nNuméro de Sécurité sociale : %d%nDate de Naissance : %s%nCommentaires : %s%nAdresse :%n"
                , this.nom.toUpperCase(), this.prenom, this.numTelephone, this.sexe == 'F' ? "Féminin" : "Masculin", this.numSecuSociale
                , this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), this.commentaires == null ? "Aucun commentaire" : this.commentaires);
        this.adressePatient.afficher();
    }
}