package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */

public class DameBrigand extends DameDetresse implements HorsLaLoi{

    //attributs 
    public int nbDamesEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;
    /**
     * Constructeur de la classe DameBrigand
     * @param nom Nom de la Dame Brigand
     * @param boissonFavorite boisson favorite de la dame Brigand
     * @param etat Si la dame brigand est libre ou enlevée
     * @param couleurRobe couleur de la robe de la dame brigand
     * @param nbDameEnlevees nombre de dames enlevées par la dame Brigand
     * @param recompense récompense sur la tête de la dame brigand
     * @param look apparence de la dame brigand
     * @param estEnPrison renseigne si la dame brigand est en prison ou non
     */
    //constructeurs

    public DameBrigand(String nom, String boissonFavorite, String etat, String couleurRobe, int nbDameEnlevees, int recompense, String look, Boolean estEnPrison){
        super(nom,boissonFavorite,etat,couleurRobe);
        this.nbDamesEnlevees = nbDamesEnlevees;
        this.recompense = recompense;
        this.look = look;
        this.estEnPrison = estEnPrison;
    }
    
    /**
     * 
     */
    //seFaireEmprisonner
    @Override
    
    public void seFaireEmprisonner(Cowboy nomCowboy) {
        // TODO Auto-generated method stub
        this.estEnPrison = true ;
        this.nbDamesEnlevees = 0;
        this.getRecompense();
        this.recompense = 0;
        this.parle("Ne crois pas que " + this.nom + " a dit son dernier mot ! " + nomCowboy.nom +" ! Je te retrouverai, et ma vengeance sera terrible ! ");

    }

    @Override
    public void kidnapperDame(DameDetresse nomDame) {
        // TODO Auto-generated method stub
        this.recompense += 500;
        this.nbDamesEnlevees += 1;
        System.out.println(this.nom + " a kidnappé " + nomDame.nom + " ! " + " Sa récompense vient de monter à " + this.recompense + " dollars ! Le shérif désespère de voir " + this.nbDamesEnlevees + " sous le joug de ce brigand ! " );

    }

    @Override
    public String getRecompense() {
        // TODO Auto-generated method stub
        System.out.println("En remettant " + this.nom + "au shérif, vous avez gagné une récompense de " + Integer.toString(this.recompense) + "dollars. Bien joué ! ");
        return Integer.toString(this.recompense);
        
    }
}