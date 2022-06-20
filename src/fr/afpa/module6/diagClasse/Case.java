package fr.afpa.module6.diagClasse;

public abstract class Case {
    protected String nom;

    public Case(String nom) {
        this.nom = nom;
    }

    public abstract boolean joueurPart(Joueur j);

    public abstract void joueurPasse(Joueur j);

    public abstract void joueurArrive(Joueur j);

    @Override
    public String toString() {
        return "Case{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
