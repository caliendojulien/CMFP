package fr.afpa.module3.tp3;

import java.time.LocalDate;

public class Patient {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numeroDeSecuriteSocial;
    private LocalDate naissance;
    private String commentaires;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroDeSecuriteSocial, LocalDate naissance, String commentaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numeroDeSecuriteSocial = numeroDeSecuriteSocial;
        this.naissance = naissance;
        this.commentaires = commentaires;
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

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public long getNumeroDeSecuriteSocial() {
        return numeroDeSecuriteSocial;
    }

    public void setNumeroDeSecuriteSocial(long numeroDeSecuriteSocial) {
        this.numeroDeSecuriteSocial = numeroDeSecuriteSocial;
    }

    public LocalDate getNaissance() {
        return naissance;
    }

    public void setNaissance(LocalDate naissance) {
        this.naissance = naissance;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public void afficher() {
        System.out.println("Patient{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroDeTelephone='" + numeroDeTelephone + '\'' +
                ", sexe=" + sexe +
                ", numeroDeSecuriteSocial=" + numeroDeSecuriteSocial +
                ", naissance=" + naissance +
                ", commentaires='" + commentaires + '\'' +
                '}');
    }
}
