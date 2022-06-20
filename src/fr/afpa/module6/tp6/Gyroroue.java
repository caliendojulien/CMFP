package fr.afpa.module6.tp6;

import java.time.LocalDate;

public class Gyroroue extends Electrique{
    public Gyroroue(String marque, String modele, LocalDate dateAchat, Pilote pilote, int autonomie) {
        super(marque, modele, dateAchat, pilote, autonomie);
    }

    @Override
    public String toString() {
        return "Gyroroue{}";
    }
}
