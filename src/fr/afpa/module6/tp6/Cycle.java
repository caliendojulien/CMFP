package fr.afpa.module6.tp6;

import java.time.LocalDate;

public abstract class Cycle {
    protected String marque;
    private String modele;
    private LocalDate dateAchat;
    private float tarif;
    private Pilote pilote;

    public Cycle(String marque, String modele, LocalDate dateAchat, Pilote pilote) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
        this.pilote = pilote;
    }

    /**
     * Calcule l'age du vélo en nombres d'années
     *
     * @return l'age du vélo
     * @author CaliendoJulien
     */
    public int getAge() {
        return dateAchat.until(LocalDate.now()).getYears();
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", dateAchat=" + dateAchat +
                ", tarif=" + tarif +
                ", pilote=" + pilote +
                '}';
    }
}
