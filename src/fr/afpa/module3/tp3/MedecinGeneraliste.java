package fr.afpa.module3.tp3;

import java.time.LocalTime;

public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;
    private Creneau[] creneaux;

    private static int tarifConsultation;


    public MedecinGeneraliste() {
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        this.creneaux = new Creneau[15];
    }

    public void ajouterCreneau(LocalTime heureDeDebut, int leTpsDuCreneau) {
        // Si l'heure c'est 09h et les minutes c'est 00
        // alors c'est la premiere case du tableau
        int caseDuTableau = 0;
        if (heureDeDebut.getHour() == 9 && heureDeDebut.getMinute() == 0) {
            caseDuTableau = 0;
        }
        if (heureDeDebut.getHour() == 10) {
            caseDuTableau = 4;
        }
        if (heureDeDebut.getHour() == 11) {
            caseDuTableau = 6;
        }
        if (heureDeDebut.getHour() == 14) {
            caseDuTableau = 9;
        }
        if (heureDeDebut.getHour() == 15) {
            caseDuTableau = 11;
        }
        if (heureDeDebut.getHour() == 16) {
            caseDuTableau = 13;
        }
        // Je créé un nouveau creneau
        Creneau leCreneauAajouter  = new Creneau(heureDeDebut, leTpsDuCreneau, this);
        // Que j'ajoute au tableau de creneaux du medecin
        this.creneaux[caseDuTableau] = leCreneauAajouter;
    }
}