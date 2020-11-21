package western;

public class Joueur extends Cowboy {
    //attributs
    
    public Boolean estAthletique ;
    public Boolean estDiscret ;
    public Boolean estCharismatique ;
    public Boolean estResistantAlcool ;
    
    //constructeur
    public Joueur(int popularite, String adjectif1,String adjectif2,String nom, String boissonFavorite, Boolean estPrecis){
        
        super(popularite, boissonFavorite, nom, adjectif1,adjectif2, estPrecis);
        this.estAthletique = false;
        this.estDiscret = false;
        this.estResistantAlcool=false;
        this.estCharismatique = false;
    }
    
}