package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */

public class Brigand extends Humain implements HorsLaLoi{
    //Attribut
    public int nbDamesEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;
    public Boolean estBlesse;
    
    /**
     * Constructeur de la classe Brigand qui herite de la classe humain et qui est implemente dans l'interface HorsLaLoi
     * @param nbDamesEnlevees le nombre de dames enlevees
     * @param recompense la recompense qui est fixe sur la tete du brigand
     * @param look le style que le brigand adopte
     * @param nom le nom du brigand
     * @param boissonFavorite la boisson favorite du brigand
     */
    // Constructeur
    public Brigand(int nbDamesEnlevees, int recompense, String look, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbDamesEnlevees = nbDamesEnlevees;
        this.recompense = recompense;
        this.look=look;
        this.estEnPrison=false;
        this.estBlesse = false;
    }

    //Methode

    public String getRecompense(){
        System.out.println("En remettant " + this.nom + "au shérif, vous avez gagné une récompense de " + Integer.toString(this.recompense) + "dollars. Bien joué ! ");
        return Integer.toString(this.recompense);
    }


    public void echapper(){
        this.recompense += 400;
        System.out.println(" C'est une catastrophe ! " + this.nom + " s'est échappé de la prison ! Cet homme est un danger public, il faut le rattraper !");

    }


    public String quelEstTonNom(){
        return this.nom;
    }

    public void sePresenter(){
        parle("Mwé hé hé, bien le bonjour ! (Cet homme a l'air " + this.look + ", c'est sûrement un brigand !) On m'appelle " + this.nom + ". J'apprécie la bonne compagnie et croyez moi, il vaut mieux me compter au rang de ses amis qu'à celui de ces ennemis ! Je suis sûr que nous pouvons bien nous entendre ! ");
       
   }

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

   
   

   
   

}