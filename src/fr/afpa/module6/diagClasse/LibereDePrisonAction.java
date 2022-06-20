package fr.afpa.module6.diagClasse;

public class LibereDePrisonAction
        extends Action
        implements Detenable
{

    public LibereDePrisonAction(String libelle) {
        super(libelle);
    }

    @Override
    public void realiser(Joueur j) {
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
