package fr.afpa.module3.tp3;

public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private static int tarifConsultation;

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public static int getTarifConsultation() {
        return tarifConsultation;
    }

    public static void setTarifConsultation(int tarifConsultation) {
        MedecinGeneraliste.tarifConsultation = tarifConsultation;
    }
}
