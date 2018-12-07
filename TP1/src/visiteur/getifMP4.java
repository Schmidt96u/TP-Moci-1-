package visiteur;

public class getifMP4 implements Visiteur {
    void getifMP4(){}

    public  void getMP4(Media m){
        if(m instanceof Album){
            m.accept(this);
        }
        else if(m instanceof Video){
            m.accept(this);

        }
        else if(m instanceof Article){
            m.accept(this);
        }
        else if(m instanceof Photo){
            m.accept(this);
        }
    }

    public void visit(Album A){
        System.out.print("Not a Video");
    };
    public void visit(Photo P){
        System.out.print("Not a Video");

    };
    public  void visit(Video V) {
        if ((V.getNom().indexOf(".mp4")) > 0) {
            System.out.print(V.getNom());
        }
    }
    public  void visit(Article Art){
        System.out.print("Not a Video");

    }
}

