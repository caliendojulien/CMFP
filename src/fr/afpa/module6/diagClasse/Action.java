package fr.afpa.module6.diagClasse;

public abstract class Action {
    private String libelle;

    public Action(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public abstract void realiser(Joueur j);

    @Override
    public String toString() {
        return "Action{" +
                "libelle='" + libelle + '\'' +
                '}';
    }
}
