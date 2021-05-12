package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {
    private LocalTime heureDebut;
    private int dureeCreneau;
    private MedecinGeneraliste medecinSurCreneau;

    public Creneau(LocalTime heureDebut, int dureeCreneau, MedecinGeneraliste medecinSurCreneau) {
        this.heureDebut = heureDebut;
        this.dureeCreneau = dureeCreneau;
        this.medecinSurCreneau = medecinSurCreneau;
        this.medecinSurCreneau.ajouterCreneau(this);
    }

    public MedecinGeneraliste getMedecinSurCreneau() {
        return medecinSurCreneau;
    }

    public void afficher(){
        System.out.printf("%s - %s (%d minutes)%n", this.heureDebut, this.heureDebut.plusMinutes(this.dureeCreneau), this.dureeCreneau);
    }

}
