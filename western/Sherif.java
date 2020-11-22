package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */

public class Sherif extends Cowboy{

     //Attribut
     public int nbBrigandCoffre;
     /**
      * Constructeur de la classe Sherif qui  herite de la classe Cowboy
      * @param nbBrigandCoffreEmprisonne nombre de brigand coffre/emprisonne par le sherif
      * @param popularite popularite du sherif
      * @param adjectif1 premier adjectif qui defini le sherif
      * @param adjectif2 deuxieme adjectif qui defini le sherif
      * @param nom nom du sherif
      * @param boissonFavorite boisson favorite du sherif
      * @param estPrecis permet de savoir si le sherif est precis ou non (pour les futur combat qu'il menera)
      */
     
 
     //Constructeur
     public Sherif(int nbBrigandCoffreEmprisonne, int popularite, String adjectif1,String adjectif2, String nom, String boissonFavorite,Boolean estPrecis){
        super(popularite,adjectif1,adjectif2,nom,boissonFavorite,estPrecis);
      
        this.nbBrigandCoffre = nbBrigandCoffre;
         
     }
     /**
      * Methode qui permet de coffrer le brigand 
      * @param nomBrigand
      */
     //Methode
 
     public void coffrer(Brigand nomBrigand){
        nomBrigand.estBlesse=true;
         this.nbBrigandCoffre++;        

 
     }
     /**
      * Methode qui permet d'emettre un avis de recherche sur un brigand
      * @param nomBrigand
      */
 
     public void rechercher(Brigand nomBrigand){
        parle("Ce Brigand du nom de "+nomBrigand+" est recherché");
        
 
     }
     /**
     * Renvoie le nom du sherif
     */
     public String quelEstTonNom(){
         return "Sherif"+this.nom+this.nbBrigandCoffre;
     }

     /**
     * Cette méthode fait se présenter le barman
     */

     public void sePresenter(){
      parle("Sherif"+this.nom+"pour vous servir"+this.nbBrigandCoffre);
     }
}