package western;

public class Ripoux extends Sherif implements HorsLaLoi{
    //Attribut
    int nbDamesEnlevees;
    int recompense;
    String look;
    Boolean estEnPrison;
    

    //Constructeur
    public Ripoux(int nbDamesEnlevees, int recompense, String look, Boolean estEnPrison,int nbBrigandCoffre,int popularite,String adjectif,String nom,String boissonFavorite){
    super(nbBrigandCoffre,popularite, adjectif,nom, boissonFavorite);
    this.nbDamesEnlevees=nbDamesEnlevees;
    this.recompense=recompense;
    this.look=look;
    this.estEnPrison=estEnPrison;
    }

}