package western;

public class Cowboy extends Humain{
    //Attribut
    int popularite;
    String adjectif;

    //Constructeur
    public Cowboy(int popularity, String adj,String name, String FavoriteDrink){
        super(name, FavoriteDrink);
        this.popularite = popularity;
        this.adjectif = adj;
    }

    //Methode

    public void tirer(Brigand){

    }

    public void libererDame(Dame){

    }

    public void sePresenter(){

    }



}