package interpreteur;

public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    public Photo(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }
    @Override
    public int getNombredePhotos(){
        return(1);
    }
    public void getVideoMp4(){
        System.out.print("not a video");
    }
    public void getArticleAuteur(String Auteur){
        System.out.print("not a Article");
    }
}
