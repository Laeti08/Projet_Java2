package western;

public class Cowboy extends Humain{
    //Attribut
    public int popularite;
    public String adjectif;

    //Constructeur
    public Cowboy(int popularite, String adjectif,String nom, String boissonFavorite){
        super(nom, boissonFavorite);
        this.popularite = popularite;
        this.adjectif = adjectif;
    }

    //Methode

    public void tirer(Brigand){

    }

    public void libererDame(Dame){

    }

    public void sePresenter(){

    }



}