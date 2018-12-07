package visiteur;

public interface Visiteur {
    void visit(Album A);
    void visit(Photo P);
    void visit(Video V);
    void visit(Article Art);
}
