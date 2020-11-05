package western;

public class Indien extends Humain{
    //Attribut
    int nbPlumes;
    String totem;

    //Constructeur
    public Indien(int nbFeathers, String totems,String name, String FavoriteDrink){
        super(name, FavoriteDrink);
        this.nbPlumes = nbFeathers;
        this.totem =totems;
    }

    //Methode
    public void parle(String){

    }

    public void sePresenter(){

    }

}