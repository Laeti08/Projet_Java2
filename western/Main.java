package western;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Création de personnage : Vous êtes un Cowboy exerçant dans le Colorado en 1850. Choisissez 2 traits qui vous caractérisent parmis les 5 suivants :");
        System.out.println("1: Vous êtes discret");
        System.out.println("2 : Vous êtes charismatique");
        System.out.println("3 : Vous êtes précis");
        System.out.println("4 : Vous êtes athlétique");
        System.out.println("5 Vous tenez l'alcool.");

        Scanner keyboard = new  Scanner(System.in);
        String attribut1="a";
        String attribut2="b";
        
        while (!attribut1.equals("0")&& !attribut1.equals("1")&& !attribut1.equals("2")&& !attribut1.equals("3")&& !attribut1.equals("4")&& !attribut1.equals("5")&& !attribut1.equals("6")&& !attribut1.equals("7")&& !attribut1.equals("8")&&!attribut1.equals("9")){
            System.out.println("Selectionnez votre premier attribut");
            attribut1=keyboard.nextLine();
           
        }
        switch(attribut1){
            case "1":
                attribut1="estDiscret";
                break;
            case "2":
                attribut1="estCharismatique";
                break;
            case "3":
                attribut1="estPrecis";
                break;
            case "4":
                attribut1="estAthlétique";
                break;
            case "5":
                attribut1="estResistantAlcool";
                break;

        }
        System.out.println("Vous venez de selectionner votre premier attribut : "+attribut1);
        System.out.println("Maintenant selectionnez le deuxieme.");
        //attribut2=attribut1;
        

        while(!attribut2.equals("0")&& !attribut2.equals("1")&& !attribut2.equals("2")&& !attribut2.equals("3")&& !attribut2.equals("4")&& !attribut2.equals("5")&& !attribut2.equals("6")&& !attribut2.equals("7")&& !attribut2.equals("8")&&!attribut2.equals("9")){
            attribut2=keyboard.nextLine();
            if (attribut2.equals(attribut1)){
                System.out.println("Vous avez deja choisi cette attribut, veuillez en choisir un autre");
                attribut2=keyboard.nextLine();
            }
            
        }
        switch(attribut2){
            case "1":
                attribut2="estDiscret";
                break;
            case "2":
                attribut2="estCharismatique";
                break;
            case "3":
                attribut2="estPrecis";
                break;
            case "4":
                attribut2="estAthlétique";
                break;
            case "5":
                attribut2="estResistantAlcool";
                break;

        }
        System.out.println("Vous venez de selectionner vos deux attribut :"+attribut1+" et "+attribut2);
        System.out.println("Veuillez entrer votre nom");
        String nom="";
        nom=keyboard.nextLine();

        ArrayList<Humain> personnage = new ArrayList<Humain>();
        Barman Bob=new Barman("Le coyote","Bob","Eau");
        personnage.add(new Barman("Le coyote","Bob","Eau"));
        Brigand Georges=new Brigand(1,500,"Sadique","Georges","Biere");
        personnage.add(new Brigand(1,500,"Sadique","Georges","Biere"));
        Joueur joueur=new Joueur(2,attribut1,attribut2,nom,"boissonFav",false);
        personnage.add(new Joueur(2,attribut1,attribut2,nom,"boissonFav",false));//Joueur 
        DameBrigand Ellen=new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false);
        personnage.add(new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false));
        DameDetresse Ellen=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
        personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
        Indien Joe=new Indien(10,"aigle","Joe","the");
        personnage.add(new Indien(10,"aigle","Joe","the"));
        Ripoux Wayne=new Ripoux(10,5000,"Confiant",false,3,10,"charismatique","Wayne","the",false);
        personnage.add(new Ripoux(10,5000,"Confiant",false,3,10,"charismatique","Wayne","the",false));
        
        System.out.println("Le duel bat son plein. Vous avez traqué ce brigand pendant plusieurs semaines et le voilà enfin à l'autre bout de votre pistolet. Le saligaud tente tout pour vous rendre la vie dure. Il vous tire dessus, cours, se cache, mais rien n'y fait : Vous le suivez à la trace.");
        System.out.println("1 : vous lui tirez dessus");
        System.out.println("2 : vous tentez un plaquage");
        String choix1="";
        choix1=keyboard.nextLine();
        System.out.println("Vous avez choisi :"+ choix1);

        if(choix1.equals("1")){
            if (Georges.estBlesse==true){
                if(joueur.adjectif1.equals("estAthlétique")|| joueur.adjectif2.equals("estAthlétique")){
                    System.out.println("Étant l'homme le mieux bâti de l'Ouest, vous parvenez à esquiver les balles du malfrat et à lui coller le plaquage du millénaire. Le voilà à votre merci");
                   
                }
            }

            else{
                System.out.println("N'écoutant que votre courage, vous vous élancez sur lui avec fureur et tentez le plaquage du millénaire. Malheureusement, il continue de vous tirer dessus, et même s'il manque de précision il parvient à vous tenir à distance.");
            }
        }
        else if(choix1.equals("2")){
            System.out.println("Sans autre forme de sommation, Vous décider qu'il est grand temps de lui faire arrêter sa cavale par le feu. vous tirez dans sa direction.");
            if(joueur.estPrecis==true){
                System.out.println("Vous lui tirez précisément une balle dans la jambe et une dans le bras, ce qui le fait tomber et lâcher son arme. Le voilà à votre merci.");
            }
            else{
                if(Georges.estBlesse==true){
                    if(Georges.estBlesse==true){
                        System.out.println("Vous le touchez et lui faites perdre son arme mais il cours toujours.");
                    }
                    else{
                        System.out.println("Cette fois, le brigand est touché à la jambe et s'effondre dans un cri de douleur. Le voilà à votre merci.");
                    }
                }
                else{
                    System.out.println("La balle frôle le brigand, qui esquive comme il peut. Il est toujours en fuite.");
                }
            }
        }
        else{
            System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
            choix1=keyboard.nextLine(); 
        }

        System.out.println("Que voulez vous faire ?");
        System.out.println("1 : Le tuer");
        System.out.println("2 : Le capturer vivant");
        String choix2="";
        choix2=keyboard.nextLine();
        System.out.println("Vous avez choisi :"+ choix2);
        if(choix2.equals("1")){
            System.out.println("Sans autre forme de procès, vous tuez le bandit. Après tout, il était bel et bien affiché <<mort ou vif>>");
        }
        else if(choix2.equals("2")){
            System.out.println("Vous épargnez la vie du trublion mais pensez à bien l'attacher comme il faut.");
        }
        else{
            System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
            choix2=keyboard.nextLine(); 
        }
        System.out.println("Vous livrez le bandit au shérif (getrecompense). Il vous remercie. C'est le soir. Vous êtes fatigué, assoiffé et affamé. Vous rentrez à l'unique auberge du village, et vous commandez à manger ainsi que votre boisson préférée. Pendant que vous mangez au bar, un habitué arrive et vous dit :");
        System.out.println("Je vois que vous avez bon goût ! nous avons la même boisson préférée ! Que diriez vous de savoir lequel de nous 2 la tient mieux ? Je parie 100 dollars que c'est moi ! Alors, partant ?");
        //Cowboy.getrecompense();

        System.out.println("Que choisissez vous ? Etes vous partant ?");
        System.out.println("1 : Oui");
        System.out.println("2 : Non");

        String choix3="";
        choix3=keyboard.nextLine();
        System.out.println("Vous avez choisi :"+ choix3);
        if(choix3.equals("1")){
            if(joueur.adjectif2.equals("estResistantAlcool")){

            }
            else{
                System.out.println("Le concours commence, vous videz votre premier verre, votre concurrent en fait de même. Avec enthousiasme, il commande une deuxième fournée, avalée aussi vite que la première. A la troisième fournée, tous les regards sont sur vous deux. Votre troisième verre vidé, vous sentez que votre lucidité décline, mais vous voyez que celle de votre adversaire également.");
                System.out.println("Voulez vous continuer ?");
                System.out.println("1 : Oui");
                System.out.println("2 : Non");

                String choix4="";
                choix4=keyboard.nextLine();
                System.out.println("Vous avez choisi :"+ choix4);
                if(choix4.equals("1")){
                    System.out.println("Vous sentez que vous approchez dangereusement de votre limite, mais votre fierté et les 100 dollars en jeu vous empêchent d'arrêter. Vous et votre adversaire buvez votre 4ème verre. Votre vue déjà trouble se rétrécit. Vous vous réveillez. Il fait à peine jour. Vous avez un mal de crâne terrible  Lorsque vous vous relevez et que vous inspectez les environ, vous vous trouvez dans une ruelle, près des déchets. Un frisson vous parcours : vous n'avez plus ni votre bourse, ni votre colt. Que voulez vous faire?");
                    System.out.println("1 : Partir à la recherche du buveur");
                    System.out.println("2 : Revenir à l'auberge pour chercher des incices");
                    System.out.println("3 : Aller voir le shérif");
                    String choix5="";
                    choix5=keyboard.nextLine();
                    System.out.println("Vous avez choisi :"+ choix5);
                    switch(choix5){
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                    }
                }
                else if(choix4.equals("2")){
                    System.out.println("");
                }
                else{
                    System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
                    choix4=keyboard.nextLine(); 
                }

            }
           
        }
        else if(choix3.equals("2")){
           
            System.out.println("");
        }
        else{
            System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
            choix3=keyboard.nextLine(); 
        }

    }
}
