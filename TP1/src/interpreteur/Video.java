package interpreteur;

import java.util.Iterator;

public class Video extends Media {
    protected String nom ;
    public Video(String auteur,String nom){
        super(auteur);
        this.nom=nom;
    }

    @Override
    public String toString() {
        return "Vidéo{" +
                "auteur='" + auteur + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    public int getNombredePhotos(){
        return(0);
    }

    public void getVideoMp4(){
        if((this.nom.indexOf(".mp4"))>0){
            System.out.print(this.nom);
        }
    }
    public void getArticleAuteur(String Auteur){
        System.out.print("not a Article");
    }


}

