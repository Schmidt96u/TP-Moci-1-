package visiteur;



public class VisitNbPhotos implements Visitor{
    public int visit(Album A){
        int a=0;
        for (Media element : A) {
          a+=element.accept(this);

           }
        return (a);

    }
    @Override
    public int visit(Photo P){
        return(1);
    }
    @Override
    public int visit(Video V){
        return(0);
    }
    @Override
    public int visit(Article Art){
        return(0);
    }

    @Override
    public void visitTexte(Article Art, String auteur) {
        if (Art.auteur.equals(auteur)) {
            System.out.print(Art.texte);
        }
    }
     public void visitVideoMp4(Video v){
            if((v.nom.indexOf(".mp4"))>0){
                System.out.print(v.nom);
            }
        }
    }

