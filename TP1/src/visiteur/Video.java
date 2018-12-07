package visiteur;

public class Video extends Media {
    protected String auteur ;
    public Video(String auteur,String nom){
        super(nom);
        this.auteur=auteur;
    }
    public String getAuteur(){
        return (this.auteur);
    }

    public String getNom(){
        return( this.nom);
    }
    public void accept(Visiteur v){
        v.visit(this);
    }
}

