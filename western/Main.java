package western;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       // System.out.println("Quel personnage veut tu être ?");
       // System.out.println("Tu as le choix entre 8 personnages");
       // System.out.println("Brigand, Cowboy, (DameBrigand), Ripoux ou Sherif");
       
        /*System.out.println("Ecrit le nom du personnage que tu veux être");
        Scanner keyboard = new  Scanner(System.in);
        String text="";
        text=keyboard.nextLine();*/
        //Personnage Cowboy
        System.out.println("Ton but est de sauver les dames en detresse mais commençons par les presentations");
        System.out.println("Quel est ton nom ?");
        Scanner keyboard = new  Scanner(System.in);
        String text="";
        text=keyboard.nextLine();
        System.out.println("Ta boisson favorite ?");
        System.out.println("Tu as le choix entre ? boissons");

        System.out.println("Tu commence avec une popularite de 0, plus tu sauve de dame en detresse et plus ta popularite augmente");
        System.out.println("Definir adjectif ?");


        System.out.println("Bien maintenant le jeu peut vraiment commencer");

    }
}
