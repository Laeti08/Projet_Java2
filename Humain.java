package western;

public abstract class Humain{
    
    //attributs
    String nom;
    String boissonFavorite;

    //constructeurs
    public Humain(String nom, String boissonFavorite){
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    //méthodes

    public abstract void parle(String){
        system.out.println(String);
    }

    public abstract void sePresenter(){
    }

    public abstract String quelEstTonNom(){

    }

    public abstract String getBoisson(){

    }
}