package western;
import java.util.Random;

public class Cowboy extends Humain{
    //Attribut
    public int popularite;
    public String adjectif1;
    public String adjectif2;
    public Boolean estPrecis;

    //Constructeur
    public Cowboy(int popularite, String adjectif1,String adjectif2,String nom, String boissonFavorite, Boolean estprecis){
        super(nom, boissonFavorite);
        this.popularite = popularite;
        this.adjectif1 = adjectif1;
        this.adjectif2 = adjectif2;
        this.estPrecis=estPrecis;
    }

    //Methode
    public int de100(){
        Random rand = new Random();
        return rand.nextInt(100 - 1 + 1) + 1;
    }

    public void tirer(Brigand Brigand){
        System.out.println(this.nom +" " +  this.adjectif1 + " tire sur " + Brigand.nom + " ! ce gredin l'a bien mérité de toute façon ! ");
        int jetdes = de100();
        
        if((jetdes <= 20 && this.estPrecis == true) || jetdes <= 10){
            System.out.println(Brigand.nom + "est touché de plein fouet ! Il ne s'en remettra pas avant un bon moment !");
        }
        
        else if((jetdes <= 80 && this.estPrecis == true) || jetdes <= 65){
            
            if(Brigand.estBlesse == false){
                System.out.println(Brigand.nom + "est salement touché mais n'est pas pas encore hors d'état de nuire ! Encore une comme ça et son compte sera réglé !");
                Brigand.estBlesse = true;
            }
            else{
                System.out.println(Brigand.nom + "est touché et s'effondre ! Il est hors d'état de nuire ! ");
                Brigand.estBlesse = false;
            }
            
        }
        else{
            System.out.println(" C'est raté ! " + Brigand.nom + "est décidément très agile ! ");
        }            

    }

    public void libererDame(DameDetresse Dame){
        System.out.println(this.nom + " libère la pauvre " + Dame.nom + ".");
        Dame.seFaireLiberer(this.nom);

    }

    public void sePresenter(){
        this.parle("Je suis " + this.nom );
        
    }



}