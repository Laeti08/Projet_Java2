package western;

public class Brigand extends Humain{
    //Attribut
    int nbDamesEnlevees;
    int recompense;
    String look;
    Boolean estEnPrison;
    private int award;

    // Constructeur
    public Brigand(int nbDamesKidnap, int award, String style, Boolean estInPrison, String name, String FavoriteDrink) {
        super(name, FavoriteDrink);
        this.nbDamesEnlevees = nbDamesKidnap;
        this.award = award;
        this.recompense=award;
        this.look=style;
        this.estEnPrison=estInPrison;
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