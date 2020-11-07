package western;

public class DameDetresse extends Humain implements VisagePale{
    
    //attributs

    String etat;
    String couleurRobe;

    //Contructeur
    public DameDetresse(String nom, String boissonFavorite, String etat, String couleurRobe){
        super(nom, boissonFavorite);
        this.etat = etat;
        this.couleurRobe = couleurRobe;
    }
    
    //Méthodes 

    public void seFaireEnlever(Brigand){
        
    }

    public void seFaireLiberer(Cowboy){

    }

    public void changerRobe(String couleur){

    }

    void sePresenter(){

    }

}
