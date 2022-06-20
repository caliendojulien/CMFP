package fr.afpa.module6.diagClasse;

public abstract class Propriete
    extends Case
    implements Detenable
{
    private int prixAchat;
    protected int txComplGroupe;
    private boolean hypotheque;
    private Groupe groupe;

    public Propriete(String nom) {
        super(nom);
    }

    public Propriete(String nom, int prixAchat, Groupe groupe) {
        super(nom);
        this.prixAchat = prixAchat;
        this.groupe = groupe;
    }

    public boolean isHypotheque() {
        return hypotheque;
    }

    @Override
    public boolean joueurPart(Joueur j) {
        return false;
    }

    @Override
    public void joueurPasse(Joueur j) {

    }

    @Override
    public void joueurArrive(Joueur j) {

    }

    @Override
    public Joueur getProprio() {
        return null;
    }

    @Override
    public void setProprio(Joueur j) {

    }

    @Override
    public int getValeur() {
        return 0;
    }
}
