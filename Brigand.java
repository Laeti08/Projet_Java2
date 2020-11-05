package western;

public class Brigand extends Humain{
    //Attribut
    int nbDamesEnlevees;
    int recompense;
    String look;
    Boolean estEnPrison;
    private int award;

    // Constructeur
    public Brigand(int nbDamesEnlevees, int recompense, String look, Boolean estEnPrison, String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.nbDamesEnlevees = nbDamesEnlevees;
        this.recompense = recompense;
        this.look=look;
        this.estEnPrison=estEnPrison;
    }

    //Methode

    public String getRecompense(){

    }

    public void kidnapperDame(Dame){

    }

    public void seFaireEmprisonner(Cowboy){

    }

    public void echapper(){

    }


    public String quelEstTonNom(){
         
    }

    public void sePresenter(){
       
   }

}