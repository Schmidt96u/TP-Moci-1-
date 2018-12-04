package visiteur;

public interface Visitor {
    void visite(Album A);
    void visite(Photo P);
}
