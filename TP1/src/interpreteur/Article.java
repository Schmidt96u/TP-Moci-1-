package interpreteur;

public class Article extends Media {

    protected String texte ;

    public Article(String auteur,String texte){
        super(auteur);
        this.texte=texte;

    }
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    public void ajouterTexte(String texteEnPlus) {
        this.texte=this.texte.concat(" ");
        this.texte=this.texte.concat(texteEnPlus);
    }

    public int getNombredePhotos(){
        return(0);
    }
    public void getVideoMp4(){
        System.out.print("not a video");
    }
    public void getArticleAuteur(String auteur){
        if (this.auteur.equals(auteur)) {
            System.out.print(this.texte);
        }
    }
}


