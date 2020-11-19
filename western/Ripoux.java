package western;

public class Ripoux extends Sherif implements HorsLaLoi{
    //Attribut
    public int nbDamesEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;
    

    //Constructeur
    public Ripoux(int nbDamesEnlevees, int recompense, String look, Boolean estEnPrison,int nbBrigandCoffre,int popularite,String adjectif,String nom,String boissonFavorite,Boolean estPrecis){
    super(nbBrigandCoffre,popularite, adjectif,nom, boissonFavorite,estPrecis);
    this.nbDamesEnlevees=nbDamesEnlevees;
    this.recompense=recompense;
    this.look=look;
    this.estEnPrison=estEnPrison;
    }

    @Override
    public void seFaireEmprisonner(Cowboy nomCowboy) {
        // TODO Auto-generated method stub

    }

    @Override
    public void kidnapperDame(DameDetresse nomDame) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getRecompense() {
        // TODO Auto-generated method stub
        return null;
    }

}