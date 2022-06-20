package fr.afpa.module6.tp6;

import java.time.LocalDate;

public class Velo extends Cycle {
    private int nbVitesse;
    private final float PRIX = 4.90f;

    public Velo(String marque, String modele, LocalDate dateAchat, Pilote pilote, int nbVitesse) throws NbVitesseException {
        super(marque, modele, dateAchat, pilote);
        this.setTarif(PRIX);
        this.nbVitesse = nbVitesse;
        if (nbVitesse < 0) {
            throw new NbVitesseException("Pas négatif");
        }
    }

    public int getNbVitesse() {
        return nbVitesse;
    }

    public void setNbVitesse(int nbVitesse) {
        this.nbVitesse = nbVitesse;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "marque=" + this.marque +
                ", nbVitesse=" + nbVitesse +
                '}';
    }
}
