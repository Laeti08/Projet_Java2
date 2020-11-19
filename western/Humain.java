package western;

public abstract class Humain{
    
    //attributs
    protected String nom;
    String boissonFavorite;

    //constructeurs
    public Humain(String nom, String boissonFavorite){
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    //méthodes

    public void parle(String phrase){
        System.out.println(this.nom + " : " + phrase);
    }

    public void sePresenter(){
        parle("");
    }

    protected String quelEstTonNom(){
        return this.nom;
    }

    public String getBoisson(){
        return this.boissonFavorite;
    }
}