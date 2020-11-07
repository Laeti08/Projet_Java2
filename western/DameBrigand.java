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
}