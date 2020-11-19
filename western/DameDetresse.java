package western;

public class DameDetresse extends Humain implements VisagePale{
    
    //attributs

    String etat;
    String couleurRobe;

    //Contructeur
    public DameDetresse(String nom, String boissonFavorite, String etat, String couleurRobe){
        super(nom, boissonFavorite);
        this.etat = etat;
        this.couleurRobe = couleurRobe;
    }
    
    //Méthodes 

    public void seFaireEnlever(Brigand nomBrigand){
        this.etat="kidnappé";
        parle("Au secours!! Au secours!!");
        parle(nomBrigand+"lachez moi!!!");
        
    }

    public void seFaireLiberer(Cowboy nomCowboy){
        this.etat="liberé";
        parle("Merci infiniment Mr"+nomCowboy);
    }

    public void changerRobe(String couleur){
        this.couleurRobe=couleur;
        

    }

    public String quelEstTonNom(){
        return "Lady"+this.nom+this.couleurRobe;
         
    }

    public void sePresenter(){
        super.sePresenter();
        parle("Bonjour, je me presente"+this.nom+", et regardez ma jolie robe de couleur"+this.couleurRobe);

    }

	@Override
	public void ascalp(Indien nomIndien) {
		// TODO Auto-generated method stub
		
	}

}
