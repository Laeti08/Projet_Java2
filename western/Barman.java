package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */
public class Barman extends Humain{
    //Attribut
    public String nomBar;
    /**
     * Constructeur de la Barman qui herite de la humain
     * @param nomBar le nom du bar ou il travail
     * @param nom le nom du barman
     * @param boissonFavorite la boisson favorite du barman
     */
    //Constructeur
    public Barman(String nomBar,String nom, String boissonFavorite){
        super(nom, boissonFavorite);
        this.nomBar = nomBar;
        
    }


    /**
     * 
     * @param nomHumain
     */
    //Methode
    public void sert(Humain nomHumain){
        parle("Tiens " + nomHumain.nom + ", voici " + nomHumain.boissonFavorite + "." );

    }

    public void parle(String phrase){
        System.out.println(phrase);

    }

    public void sePresenter(){
        parle("Bienvenue au bar " + this.nomBar + ". Je suis " + this.nom + ", et je suis le barman. Si vous comptez m'offrir à boire, offrez moi " + this.boissonFavorite + ".");
    }

}