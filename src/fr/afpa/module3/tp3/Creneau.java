package fr.afpa.module3.tp3;

import java.time.LocalTime;

public class Creneau {
    private LocalTime heureDeDebut;
    private int duree; // En minutes
    private MedecinGeneraliste medecin;

    public Creneau(LocalTime heureDeDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDeDebut = heureDeDebut;
        this.duree = duree;
        this.medecin = medecin;
    }
}
