package visiteur;


import java.util.Iterator;

public class VisitNbPhotos implements Visiteur {
    protected int nbPhoto;
    VisitNbPhotos() {
        nbPhoto = 0;
    }


   public int getNombrePhoto(Media med){
       if(med instanceof Album){
            med.accept(this);
       }
       else if(med instanceof Photo){
           med.accept(this);
       }
       else{
           med.accept(this);
       }
       return(nbPhoto);
            

    }

    @Override
    public void visit(Album A) {
        Iterator<Media> i;
        i = A.iterator();
        while (i.hasNext()) {
            Media o = i.next();
            getNombrePhoto(o);
        }
    }

    public void visit(Photo photo){
        nbPhoto++;
    }


    public void visit(Video V){System.out.print("pas de photo ici");}
    public void visit(Article Art){System.out.print("pas de photo ici"); }

}

