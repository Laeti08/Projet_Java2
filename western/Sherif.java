package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */

public class Sherif extends Cowboy{

     //Attribut
     public int nbBrigandCoffre;
     
 
     //Constructeur
     public Sherif(int nbBrigandCoffreEmprisonne, int popularite, String adjectif1,String adjectif2, String nom, String boissonFavorite,Boolean estPrecis){
        super(popularite,adjectif1,adjectif2,nom,boissonFavorite,estPrecis);
      
        this.nbBrigandCoffre = nbBrigandCoffre;
         
     }
 
     //Methode
 
     public void coffrer(Brigand nomBrigand){
      this.nbBrigandCoffre++;        

 
     }
 
     public void rechercher(Brigand nomBrigand){
        parle("Ce Brigand du nom de "+nomBrigand+" est recherché");
        //photo du brigand ?
 
     }
 
     public String quelEstTonNom(){
         return "Sherif"+this.nom+this.nbBrigandCoffre;
     }

     public void sePresenter(){
      parle("Sherif"+this.nom+"pour vous servir"+this.nbBrigandCoffre);
     }
}