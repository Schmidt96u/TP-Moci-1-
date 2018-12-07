package visiteur;

public abstract class Media {
    protected int annee ;
    protected String nom ;
    protected String auteur;

    protected Media(int a, String nom) {
        this.annee = a;
        this.nom = nom;
    }

    protected Media( String auteur) {
        this.auteur = auteur;
    }

       abstract void accept(Visiteur V);
}
