package western;

public class DameBrigand extends DameDetresse implements HorsLaLoi{

    //attributs 
    public int nbDameEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;

    //constructeurs

    public DameBrigand(String nom, String boissonFavorite, String etat, String couleurRobe, int nbDameEnlevees, int recompense, String look, Boolean estEnPrison){
        super(nom,boissonFavorite,etat,couleurRobe);
        this.nbDameEnlevees = nbDameEnlevees;
        this.recompense = recompense;
        this.look = look;
        this.estEnPrison = estEnPrison;
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