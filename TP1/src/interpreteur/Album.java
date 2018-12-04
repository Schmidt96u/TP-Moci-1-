package interpreteur;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Album extends Media implements Iterable<Media>{
    protected ArrayList<Media> als ;
    protected int nombre;
    public Album(int d, String nom) {
        super(d, nom);
        this.als = new ArrayList<>(10);
    }

    public void ajouter(Media... s) {
        for (Media sc : s) {
            this.als.add(sc);
        }
    }

    @Override
    public String toString() {
        return "Album{" +
                "als=" + als +
                '}';
    }

    @Override
    public Iterator<Media> iterator() {
        return this.als.iterator();
    }
    @Override
    public  int getNombredePhotos() {
        Iterator test = als.iterator();
        int a;
        a=0;

        while(test.hasNext()){
         a += ((Photo)(test.next())).getNombredePhotos();

        }
        return(a);
    }
}