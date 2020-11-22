package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */

import java.util.Random;

public abstract class Humain {
    
    //attributs
    protected String nom;
    String boissonFavorite;

    /**
     * Constructeur de la classe Humain, un humain ne peut etre cree sans un nom et une boisson favorite.
     * @param nom le nom du personnage 
     * @param boissonFavorite la boisson favorite du personnage
     */

    //constructeurs
    public Humain(String nom, String boissonFavorite){
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    //méthodes

    /**
     * renvoie un entier aléatoire entre 1 et 100
     * @return
     */
    //de100
    public static int de100(){
        Random rand = new Random();
        return rand.nextInt(100 - 1 + 1) + 1;
    }
    
    /**
     * Methode qui permet au personnage de parle
     * @param phrase ce que le personnage dit
     */
    public void parle(String phrase){
        System.out.println(this.nom + " : " +phrase);
    }
    /**
     * Methode 
     */
    public void sePresenter(){
        parle("Bonjour, je me presente, je suis"+nom);
    }
    /**
     * Accesseur de l'attribut nom 
     * @return le nom du personnage
     */
    protected String quelEstTonNom(){
        return this.nom;
    }
    /**
     * Accesseur de l'attribut boisson favorite 
     * @return la boisson favorite du personnage
     */
    public String getBoisson(){
        return this.boissonFavorite;
    }
}