package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */

public class Joueur extends Cowboy {
    //attributs
    
    public Boolean estAthletique ;
    public Boolean estDiscret ;
    public Boolean estCharismatique ;
    public Boolean estResistantAlcool ;
    /**
     * Constructeur de la classe joueur qui herite de la classe Humain
     * @param popularite popularité du joueur
     * @param adjectif1 premier attribut du joueur (sert pour la partie)
     * @param adjectif2 second attribut du joueur (sert pour la partie)
     * @param nom nom du joueur
     * @param boissonFavorite boisson favorite du joueur
     * @param estPrecis attribut inhérent à tout cowboy
     */
    //constructeur
    public Joueur(int popularite, String adjectif1,String adjectif2,String nom, String boissonFavorite, Boolean estPrecis){
        
        super(popularite, adjectif1,adjectif2,nom, boissonFavorite,  estPrecis);
        this.estAthletique = false;
        this.estDiscret = false;
        this.estResistantAlcool=false;
        this.estCharismatique = false;
    }
    
}