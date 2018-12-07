package visiteur;

public class VisitAuteurTxt implements Visiteur {

    protected String auteur;

    VisitAuteurTxt(String auteur) {
        this.auteur = auteur;
    }
    public void getAuteurTxt(Media med){

    }

    public void visit(Album A) {
                System.out.print("Not a Article");
    }

    public void visit(Photo P) {
        System.out.print("Not a Article");
    }

    public void visit(Video V) {
        System.out.print("Not a Article");
    }

    public void visit(Article Art) {
        if (Art.auteur.equals(auteur)) {
            System.out.print(Art.texte);
        }
        else{
            System.out.print("pas les mêmes auteurs");
        }
    }
}
