package fr.afpa.module6.tp6;

import java.time.LocalDate;

public class Gyropode extends Electrique {
    private int tailleMin;

    public Gyropode(String marque, String modele, LocalDate dateAchat, Pilote pilote, int autonomie, int tailleMin) {
        super(marque, modele, dateAchat, pilote, autonomie);
        this.tailleMin = tailleMin;
    }

    @Override
    public String toString() {
        return "Gyropode{" +
                "tailleMin=" + tailleMin +
                '}';
    }
}
