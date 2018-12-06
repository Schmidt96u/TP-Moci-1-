package visiteur;

public interface Visitor {
    int visit(Album A);

    int visit(Photo P);

    int visit(Article Art);

    int visit(Video V);

    void visitTexte(Article Art, String auteur);

    void visitVideoMp4(Video V);
}