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
        this.nombre=0;
    }

    public void ajouter(Media... s) {
        for (Media sc : s) {
            this.als.add(sc);
            this.nombre++;
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
    public  int getNombreDePhotos() {
        return (nombre);
    }
}