package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */
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
    public void parle(String phrase){
        System.out.println(phrase);
    }

    public void sePresenter(){
        super.sePresenter();
        parle("J'ai "+this.nbPlumes+" et "+this.totem);

    }

}