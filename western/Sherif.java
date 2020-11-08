package western;

public class Sherif extends Cowboy{

     //Attribut
     public int nbBrigandCoffre;
     
 
     //Constructeur
     public Sherif(int nbBrigandCoffreEmprisonne, int popularite, String adjectif, String nom, String boissonFavorite){
        super(popularite, adjectif,nom, boissonFavorite);
        this.nbBrigandCoffre = nbBrigandCoffre;
         
     }
 
     //Methode
 
     public void coffrer(Brigand nomBrigand){
      this.nbBrigandCoffre++;        

 
     }
 
     public void rechercher(Brigand nomBrigand){
        parle("Ce Brigand du nom"+nomBrigand+"est recherché");
        //photo du brigand ?
 
     }
 
     public String quelEstTonNom(){
      return "Sherif"+this.nom+this.nbBrigandCoffre;
     }

     public void sePresenter(){
      parle("Sherif"+this.name+"pour vous servir"+this.nbBrigandCoffre);
    }
}