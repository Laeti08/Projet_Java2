package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */
public class Ripoux extends Sherif implements HorsLaLoi{
    //Attribut
    public int nbDamesEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;
    
    /**
     * Constructeur du ripoux qui herite de la classe Sherif et qui est implemente dans l'interface HorsLaLoi
     * @param nbDamesEnlevees nombre de dames enlevées par le ripoux
     * @param recompense récompense sur la tête du ripoux
     * @param look look du ripoux
     * @param estEnPrison si le ripoux est en prison
     * @param nbBrigandCoffre nombre de brigands emprisonnés par le ripoux
     * @param popularite popularité du ripoux
     * @param adjectif1 attribut 1 du ripoux
     * @param adjectif2 attribut 2 du ripoux
     * @param nom nom du ripoux
     * @param boissonFavorite boisson favorite du ripoux
     * @param estPrecis si le ripoux est précis (même s'il est ripoux ça reste un cowboy)
     */
    //Constructeur
    public Ripoux(int nbDamesEnlevees, int recompense, String look, Boolean estEnPrison,int nbBrigandCoffre,int popularite,String adjectif1,String adjectif2,String nom,String boissonFavorite,Boolean estPrecis){
    super(nbBrigandCoffre,popularite, adjectif1,adjectif2,nom, boissonFavorite,estPrecis);
    this.nbDamesEnlevees=nbDamesEnlevees;
    this.recompense=recompense;
    this.look=look;
    this.estEnPrison=estEnPrison;
    }

    /**
     * Le ripoux peut se faire emprisonner tel un hors-la-loi
     * @param nomCoboy
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
    /**
     * Le ripoux peut kidnapper une dame tel un hors-la-loi
     * @param nomDame
     */
    //kidnapperDame
    @Override
    public void kidnapperDame(DameDetresse nomDame) {
        // TODO Auto-generated method stub
        
        this.recompense += 500;
        this.nbDamesEnlevees += 1;
        System.out.println(this.nom + " a kidnappé " + nomDame.nom + " ! " + " Sa récompense vient de monter à " + this.recompense + " dollars ! Le shérif désespère de voir " + this.nbDamesEnlevees + " sous le joug de ce brigand ! " );
    }

    /**
     * Le ripoux a une récompense sur sa tête, tel un hors-la-loi.
     */
    @Override
    public String getRecompense() {
        // TODO Auto-generated method stub
        System.out.println("En remettant " + this.nom + "au shérif, vous avez gagné une récompense de " + Integer.toString(this.recompense) + "dollars. Bien joué ! ");
        return Integer.toString(this.recompense);
        
    }

}