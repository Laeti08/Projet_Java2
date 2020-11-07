package western;

public class Indien extends Humain{
    //Attribut
    public int nbPlumes;
    public String totem;

    //Constructeur
    public Indien(int nbPlumes, String totem,String nom, String boissonFavorite){
        super(nom, boissonFavorite);
        this.nbPlumes = nbPlumes;
        this.totem =totem;
    }

    //Methode
    public void parle(String){

    }

    public void sePresenter(){

    }

}