package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
    private Creneau rdvCreneau;
    private Patient rdvPatient;
    private LocalDate rdvDate;

    public RendezVous(Creneau rdvCreneau, Patient rdvPatient, LocalDate rdvDate) {
        this.rdvCreneau = rdvCreneau;
        this.rdvPatient = rdvPatient;
        this.rdvDate = rdvDate;
    }

    public void afficher(){
        System.out.printf("Rendez-vous du %s ", this.rdvDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.rdvCreneau.afficher();
        System.out.printf("avec le Dr %s%n",this.rdvCreneau.getMedecinSurCreneau().getNom()); // Aller chercher le nom du medecin sur le bon creneau - ces infos sont toutes dans la classe Creneau
        this.rdvPatient.afficher();
    }
}
