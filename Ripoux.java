package western;

public class Ripoux extends Sherif implements HorsLaLoi{
    //Attribut
    int nbDamesEnlevees;
    int recompense;
    String look;
    Boolean estEnPrison;
    

    //Constructeur
    public Ripoux(int nbDamesKidnap, int award, String style, Boolean estInPrison,int nbBrigandEmprisonne,int popularity,String adj,String name,String FavoriteDrink){
        super(nbBrigandEmprisonne, popularity, adj, name, FavoriteDrink);
    nbDamesEnlevees=nbDamesKidnap;
    recompense=award;
    look=style;
    estEnPrison=estInPrison;
    }

}