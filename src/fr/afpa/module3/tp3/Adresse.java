package fr.afpa.module3.tp3;

public class Adresse {
    private int numeroDeRue;
    private String complementNumero;
    private String mentionsComplementaires;
    private String rue;
    private int codePostal;
    private String commune;

    public Adresse(int numeroDeRue, String complementNumero, String mentionsComplementaires, String rue, int codePostal, String commune) {
        this.numeroDeRue = numeroDeRue;
        this.complementNumero = complementNumero;
        this.mentionsComplementaires = mentionsComplementaires;
        this.rue = rue;
        this.codePostal = codePostal;
        this.commune = commune;
    }

    public Adresse(int numeroDeRue, String complementNumero, String rue, int codePostal, String commune) {
        this.numeroDeRue = numeroDeRue;
        this.complementNumero = complementNumero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.commune = commune;
    }

    public int getNumeroDeRue() {
        return numeroDeRue;
    }

    public void setNumeroDeRue(int numeroDeRue) {
        this.numeroDeRue = numeroDeRue;
    }

    public String getComplementNumero() {
        return complementNumero;
    }

    public void setComplementNumero(String complementNumero) {
        this.complementNumero = complementNumero;
    }

    public String getMentionsComplementaires() {
        return mentionsComplementaires;
    }

    public void setMentionsComplementaires(String mentionsComplementaires) {
        this.mentionsComplementaires = mentionsComplementaires;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String afficher() {
        String mc = (this.mentionsComplementaires != null) ? ", mentionsComplementaires='" + mentionsComplementaires : "";
        /*if (this.mentionsComplementaires != null) {
            mc = ", mentionsComplementaires='" + mentionsComplementaires;
        } else {
            mc = "";
        }*/
        return "Adresse{" +
                "numeroDeRue=" + numeroDeRue +
                ", complementNumero='" + complementNumero + '\'' +
                mc +
                ", rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", commune='" + commune + '\'' +
                '}';
    }
}
