package western;

public class Brigand extends Humain implements HorsLaLoi{
    //Attribut
    public int nbDamesEnlevees;
    public int recompense;
    public String look;
    public Boolean estEnPrison;
    public Boolean estblesse;
    

    // Constructeur
    public Brigand(int nbDamesEnlevees, int recompense, String look, Boolean estEnPrison, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbDamesEnlevees = nbDamesEnlevees;
        this.recompense = recompense;
        this.look=look;
        this.estEnPrison=estEnPrison;
        this.estblesse = false;
    }

    //Methode

    public String getRecompense(){
        system.out.println("En remettant " + this.nom + "au shérif, vous avez gagné une récompense de " + Integer.toString(this.recompense) + "dollars. Bien joué ! ");

    }

    public void kidnapperDame(Dame){
        this.recompense += 500;
        this.nbDamesEnlevees += 1;
        system.out.println(this.nom + " a kidnappé " + Dame.nom + " ! " + " Sa récompense vient de monter à " + this.recompense + " dollars ! Le shérif désespère de voir " + this.nbDamesEnlevees + " sous le joug de ce brigand ! " );

    }

    public void seFaireEmprisonner(Cowboy){
        this.estEnPrison = true ;
        this.nbDamesEnlevees = 0;
        this.getRecompense();
        this.recompense = 0;
        this.parle("Ne crois pas que " + this.nom + " a dit son dernier mot ! " + Cowboy.nom " ! Je te retrouverai, et ma vengeance sera terrible ! ");

    }

    public void echapper(){
        this.recompense += 400;
        system.out.println(" C'est une catastrophe ! " + this.nom + " s'est échappé de la prison ! Cet homme est un danger public, il faut le rattraper !");

    }


    public String quelEstTonNom(){
         
    }

    public void sePresenter(){
        parle("Mwé hé hé, bien le bonjour ! (Cet homme a l'air " + this.look + ", c'est sûrement un brigand !) On m'appelle " + this.nom + ". J'apprécie la bonne compagnie et croyez moi, il vaut mieux me compter au rang de ses amis qu'à celui de ces ennemis ! Je suis sûr que nous pouvons bien nous entendre ! ");
       
   }

}