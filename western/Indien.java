package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */
public class Indien extends Humain{
    //Attribut
    public int nbPlumes;
    public String totem;
    
    /**
     * Constructeur de la classe indien
     * @param nbPlumes
     * @param totem
     * @param nom
     * @param boissonFavorite
     */
    //Constructeur
    public Indien(int nbPlumes, String totem,String nom, String boissonFavorite){
        super(nom, boissonFavorite);
        this.nbPlumes = nbPlumes;
        this.totem =totem;
    }
    
    //méthodes
    
    /**
     * Fait parler l'indien
     */
    //parle
    public void parle(String phrase){
        System.out.println(phrase);
    }

    /**
     * Fait se présenter l'indien
     */
    //sePresenter
    public void sePresenter(){
        super.sePresenter();
        parle("J'ai "+this.nbPlumes+" et "+this.totem);

    }

}