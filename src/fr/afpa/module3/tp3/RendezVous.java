package fr.afpa.module3.tp3;

import java.time.LocalDate;

public class RendezVous {
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;

    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "creneau=" + creneau +
                ", patient=" + patient +
                ", date=" + date +
                '}';
    }
}
