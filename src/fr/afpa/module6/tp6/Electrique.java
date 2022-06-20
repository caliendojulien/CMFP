package fr.afpa.module6.tp6;

import java.time.LocalDate;

public abstract class Electrique extends Cycle {
    private int autonomie;

    public Electrique(String marque, String modele, LocalDate dateAchat, Pilote pilote, int autonomie) {
        super(marque, modele, dateAchat, pilote);
        this.autonomie = autonomie;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }

    @Override
    public String toString() {
        return "Electrique{" +
                "autonomie=" + autonomie +
                '}';
    }
}
