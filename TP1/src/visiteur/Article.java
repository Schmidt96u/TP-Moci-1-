package visiteur;

public class Article extends Media {

    protected String texte;

    public Article(String auteur, String texte) {
        super(auteur);
        this.texte = texte;
    }

    public void ajouterTexte(String texteEnPlus) {
        this.texte = this.texte.concat(" ");
        this.texte = this.texte.concat(texteEnPlus);
    }

    public int accept(Visitor v) {
        return (v.visit(this));
    }
}