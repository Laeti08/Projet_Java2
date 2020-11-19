package western;

public class Cowboy extends Humain{
    //Attribut
    public int popularite;
    public String adjectif;
    public Boolean estprecis;

    //Constructeur
    public Cowboy(int popularite, String adjectif,String nom, String boissonFavorite, Boolean estprecis){
        super(nom, boissonFavorite);
        this.popularite = popularite;
        this.adjectif = adjectif;
        this.
    }

    //Methode
    public int de100(){
        return rand.nextInt(100-1+1)+1;
    }

    public void tirer(Brigand Brigand){
        system.out.println(this.nom +" " +  this.adjectif + " tire sur " + Brigand.nom + " ! ce gredin l'a bien mérité de toute façon ! ");
        jetdes = de100();
        
        if((jetdes <= 20 && this.estprecis == true) || jetdes <= 10){
            system.out.println(Brigand.nom + "est touché de plein fouet ! Il ne s'en remettra pas avant un bon moment !");
        }
        
        else if((jetdes <= 80 && this.estprecis == true) || jetdes <= 65){
            
            if(Brigand.estblesse == false){
                system.out.println(Brigand.nom + "est salement touché mais n'est pas pas encore hors d'état de nuire ! Encore une comme ça et son compte sera réglé !");
                Brigand.estblesse = true;
            }
            else{
                system.out.println(Brigand.nom + "est touché et s'effondre ! Il est hors d'état de nuire ! ");
                Brigand.estblesse = false;
            }
            
        }
        else{
            system.out.println(" C'est raté ! " + Brigand.nom + "est décidément très agile ! ");
        }            

    }

    public void libererDame(DameDetresse Dame){
        system.out.println(this.nom + " libère la pauvre " + Dame.nom + ".");
        Dame.seFaireLiberer(this.nom);

    }

    public void sePresenter(){
        this.parle("Je suis " + this.nom );
        
    }



}