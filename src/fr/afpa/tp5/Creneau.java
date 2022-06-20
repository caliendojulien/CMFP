package fr.afpa.tp5;

import java.time.LocalTime;

public class Creneau {
    private LocalTime heureDeDebut;
    private int duree; // En minutes
    private Medecin medecin;

    public Creneau(LocalTime heureDeDebut, int duree, Medecin medecin) {
        this.heureDeDebut = heureDeDebut;
        this.duree = duree;
        this.medecin = medecin;
    }
}
