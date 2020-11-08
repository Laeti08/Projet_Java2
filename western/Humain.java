package western;

public class Humain{
    
    //attributs
    String nom;
    String boissonFavorite;

    //constructeurs
    public Humain(String nom, String boissonFavorite){
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    //méthodes

    public void parle(String phrase){
        System.out.println(phrase);
    }

    public void sePresenter(){

    }

    public String quelEstTonNom(){

    }

    public String getBoisson(){

    }
}