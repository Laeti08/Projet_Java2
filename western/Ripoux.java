package western;

public class Ripoux extends Sherif implements HorsLaLoi{
    //Attribut
    public int nbDamesEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;
    

    //Constructeur
    public Ripoux(int nbDamesEnlevees, int recompense, String look, Boolean estEnPrison,int nbBrigandCoffre,int popularite,String adjectif,String nom,String boissonFavorite){
    super(nbBrigandCoffre,popularite, adjectif,nom, boissonFavorite);
    this.nbDamesEnlevees=nbDamesEnlevees;
    this.recompense=recompense;
    this.look=look;
    this.estEnPrison=estEnPrison;
    }

    @Override
    public void seFaireEmprisonner() {
        // TODO Auto-generated method stub

    }

    @Override
    public void kidnapperDame() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getRecompense() {
        // TODO Auto-generated method stub
        return null;
    }

}