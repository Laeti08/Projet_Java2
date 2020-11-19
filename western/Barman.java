package western;

public class Barman extends Humain{
    //Attribut
    public String nomBar;

    //Constructeur
    public Barman(String nomBar,String nom, String boissonFavorite){
        super(nom, boissonFavorite);
        this.nomBar = nomBar;
        
    }



    //Methode
    public void sert(Humain nomHumain){
        parle("Tiens " + nomHumain.nom + ", voici " + nomHumain.boissonFavorite + "." );

    }

    public void parle(String phrase){
        System.out.println(phrase);

    }

    public void sePresenter(){
        parle("Bienvenue au bar " + this.nomBar + ". Je suis " + this.nom + ", et je suis le barman. Si vous comptez m'offrir à boire, offrez moi " + this.boissonFavorite + ".");
    }

}