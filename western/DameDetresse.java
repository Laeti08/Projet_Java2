package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */
public class DameDetresse extends Humain implements VisagePale{
    
    //attributs

    String etat;
    String couleurRobe;
    
    /**
     * Constructeur de l'objet DameDetresse qui herite de la classe Humain et qui est implemente dans l'interface VisagePale
     * @param nom
     * @param boissonFavorite
     * @param etat
     * @param couleurRobe
     */
    //Contructeur
    public DameDetresse(String nom, String boissonFavorite, String etat, String couleurRobe){
        super(nom, boissonFavorite);
        this.etat = etat;
        this.couleurRobe = couleurRobe;
    }
    //Méthodes 
   
    /**
     * La dame se fait enlever par le brigand dont le nom est en paramètre
     * @param nomBrigand
     */
    //seFaireEnlever

    public void seFaireEnlever(Brigand nomBrigand){
        this.etat="kidnappé";
        parle("Au secours!! Au secours!!");
        parle(nomBrigand+"lachez moi!!!");
        
    }
    
    /**
     * La dame se fait libérer par le cowboy dont le nom est en paramètres
     * @param nomCowboy
     */
    //seFaireLiberer
    public void seFaireLiberer(String nomCowboy){
        this.etat="liberé";
        parle("Merci infiniment Mr"+nomCowboy);
    }
    /**
     * La dame change de robe, et en met une dont la couleur est en paramètres
     * @param couleur
     */
    //changerRobe
    public void changerRobe(String couleur){
        this.couleurRobe=couleur;
        

    }
    /**
     * Renvoie le nom de la Dame
     */
    //quelEstTonNom
    public String quelEstTonNom(){
        return "Lady"+this.nom+this.couleurRobe;
         
    }
    /** La dame se présente */
    public void sePresenter(){
        super.sePresenter();
        parle("Bonjour, je me presente"+this.nom+", et regardez ma jolie robe de couleur"+this.couleurRobe);

    }
    
    @Override
    /**
     * La dame se fait scalper par l'indien dont le nom est en paramètre
     */
    //ascalp
	public void ascalp(Indien nomIndien) {
		// TODO Auto-generated method stub
		
	}

}
