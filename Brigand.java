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
        nbDamesEnlevees = nbDamesKidnap;
        this.award = award;
    recompense=award;
    look=style;
    estEnPrison=estInPrison;
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