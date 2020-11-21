package western;
/**
 * @author Baurens.Damien,Husson.Laetitia
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Boolean retour=true;
        Boolean retour1=true;
        Boolean tropBu=false;
        Boolean retour2=true;


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
        switch(Integer.parseInt(attribut1)){
            case 1:
                attribut1="estDiscret";
                break;
            case 2:
                attribut1="estCharismatique";
                break;
            case 3:
                attribut1="estPrecis";
                break;
            case 4:
                attribut1="estAthletique";
                break;
            case 5:
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
        switch(Integer.parseInt(attribut2)){
            case 1:
                attribut2="estDiscret";
                break;
            case 2:
                attribut2="estCharismatique";
                break;
            case 3:
                attribut2="estPrecis";
                break;
            case 4:
                attribut2="estAthletique";
                break;
            case 5:
                attribut2="estResistantAlcool";
                break;

        }
        System.out.println(attribut1+" "+attribut2);
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
        
        
        Indien Joe=new Indien(10,"aigle","Joe","the");
        personnage.add(new Indien(10,"aigle","Joe","the"));
        //Ripoux Wayne=new Ripoux(10,5000,"Confiant",false,3,10,"charismatique","Wayne","the",false);
        //personnage.add(new Ripoux(10,5000,"Confiant",false,3,10,"charismatique","Wayne","the",false));
        
        System.out.println("Le duel bat son plein. Vous avez traqué ce brigand pendant plusieurs semaines et le voilà enfin à l'autre bout de votre pistolet. Le saligaud tente tout pour vous rendre la vie dure. Il vous tire dessus, cours, se cache, mais rien n'y fait : Vous le suivez à la trace.");
        System.out.println("1 : vous lui tirez dessus");
        System.out.println("2 : vous tentez un plaquage");
        while(retour){
            String choix1="";
            choix1=keyboard.nextLine();
            System.out.println("Vous avez choisi :"+ choix1);
            System.out.println(joueur.adjectif1);
            if(choix1.equals("2")){
                if (Georges.estBlesse==false){
                    if(joueur.adjectif1.equals("estAthletique")|| joueur.adjectif2.equals("estAthletique")){
                        System.out.println("Étant l'homme le mieux bâti de l'Ouest, vous parvenez à esquiver les balles du malfrat et à lui coller le plaquage du millénaire. Le voilà à votre merci");
                        retour=false;
                    }
                

                    else{
                        System.out.println("N'écoutant que votre courage, vous vous élancez sur lui avec fureur et tentez le plaquage du millénaire. Malheureusement, il continue de vous tirer dessus, et même s'il manque de précision il parvient à vous tenir à distance.");
                        
                    }
                }
                else{
                    
                    System.out.println("Vous profitez du désarmement du brigand pour vous élancer vers lui et le plaquer au sol. Le voilà à votre merci.");
                    retour=false;
                }
            }
            else if(choix1.equals("1")){
                System.out.println("Sans autre forme de sommation, Vous décider qu'il est grand temps de lui faire arrêter sa cavale par le feu. vous tirez dans sa direction.");
                if(joueur.estPrecis==true){
                    System.out.println("Vous lui tirez précisément une balle dans la jambe et une dans le bras, ce qui le fait tomber et lâcher son arme. Le voilà à votre merci.");
                    retour=false;
                }
                else{
                    int chance=joueur.de100();
                    System.out.println(chance);
                    if(chance<=80){
                        if(Georges.estBlesse==true){
                            System.out.println("Cette fois, le brigand est touché à la jambe et s'effondre dans un cri de douleur. Le voilà à votre merci.");
                            
                            retour=false;
                            
                        }
                        else{
                            System.out.println("Vous le touchez et lui faites perdre son arme mais il cours toujours.");
                            Georges.estBlesse=true;
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
        Georges.getRecompense();
        Georges.seFaireEmprisonner(joueur);

        System.out.println("Que choisissez vous ? Etes vous partant ?");
        System.out.println("1 : Oui");
        System.out.println("2 : Non");

        String choix3="";
        choix3=keyboard.nextLine();
        System.out.println("Vous avez choisi :"+ choix3);
        if(choix3.equals("1")){
            if(joueur.adjectif2.equals("estResistantAlcool")){
                System.out.println("Un concours d'alcool ? C'est le moment rêvé pour démontrer que vous avez la meilleure descente de l'Ouest ! Vous enchaînez 5 verres sans aucune difficulté tandis que votre adversaire cale au bout du 4ème. Vous avez fièrement gagné, et les 100 dollars sont à vous. Vous reprenez votre repas avec un grand sourire.");
                System.out.println("La musique arrive. Les gens se mettent à chanter et à danser. Soudain, une dame se trémoussant près de vous trébuche et fait tomber votre repas.");
                System.out.println("Que voulez vous faire?");
                System.out.println("1: lui crier dessus en lui demandant de lui rembourser votre repas");
                System.out.println("2 : faire une blague pour dédramatiser la situation");
                System.out.println("3 : garder le silence");
                String choix6="";
                choix6=keyboard.nextLine();
                System.out.println("Vous avez choisi :"+ choix6);
                switch(choix6){
                    case "1":
                        System.out.println("La demoiselle s'exclame :<<Oh ça va ! Je me suis faite pousser, ça arrive, et en plus vous aviez presque fini ! >>. Le ton monte, et après vous avoir fusillé du regard, elle quitte l'auberge.");
                        DameBrigand Ellen=new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false);
                        personnage.add(new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false));
                        break;
                    case "2":
                        System.out.println("Votre blague permet de détendre la pauvre femme qui semble d'ailleurs s'être fait pousser. Elle vous adresse un sourire et repart danser.");
                        DameDetresse Ellene=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
                        personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
                        break;
                    case "3":
                        System.out.println("La demoiselle s'excuse platement. Vous voyant stoïque comme une pierre, elle en déduit que vous devez être trop ivre pour réaliser ce qui vous arrive et repart danser.");
                        DameDetresse Ellene1=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
                        personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
                        break;
                }
                System.out.println("Le reste de la soirée est plutôt calme. Après avoir payé votre chambre, vous allez vous coucher. Le lendemain, vous êtes convoqué par le shérif qui vous demande pour une mission importante, et surtout très bien payée. Vous vous rendez donc chez lui pour obtenir plus d'informations.");
                System.out.println("Le shérif vous attend dans son bureau. Il a l'air soucieux. Il prend la parole : <<Merci d'être venu. J'ai une mission de la plus haute importance à vous confier. Si vous y parvenez, vous êtes un homme riche.>>");
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
                    tropBu=true;
                    System.out.println("Vous sentez que vous approchez dangereusement de votre limite, mais votre fierté et les 100 dollars en jeu vous empêchent d'arrêter. Vous et votre adversaire buvez votre 4ème verre. Votre vue déjà trouble se rétrécit. Vous vous réveillez. Il fait à peine jour. Vous avez un mal de crâne terrible  Lorsque vous vous relevez et que vous inspectez les environ, vous vous trouvez dans une ruelle, près des déchets. Un frisson vous parcours : vous n'avez plus ni votre bourse, ni votre colt. Que voulez vous faire?");
                    System.out.println("1 : Partir à la recherche du buveur");
                    System.out.println("2 : Revenir à l'auberge pour chercher des incices");
                    System.out.println("3 : Aller voir le shérif");
                    while(retour1){
                        String choix5="";
                        choix5=keyboard.nextLine();
                        System.out.println("Vous avez choisi :"+ choix5);
                        switch(choix5){
                            case "1":
                                System.out.println("Vous partez à la recherche de votre adversaire. Après une à tourner en rond dans le village, vous vous rendez à l'évidence: l'homme à disparue");
                                
                                break;
                            case "2":
                                System.out.println("L'auberge ressemble à un champ de bataille. Des tables en chevauchent d'autres, i y a du verre brisé partout. En vous voyant, le barman, en train de nettoyer vous jette un regard noir et vous lance <<vous osez revenir après tout ce que vous avez fait ? Vous avez de la chance que mon fusil soit détruit ! Sortez d'ici et ne revenez plus !>>.\nVous sentez qu'aucune excuse ne parviendra à apaiser la situation, et vous décidez de sortir de l'auberge.");
                                break;
                            case "3":
                                System.out.println("Vous vous rendez chez le shérif. Après tout, c'est lui qui saura le mieux comment procéder pour vous faire retrouver vos biens.");
                                System.out.println("Le shérif vous accueille d'un air grave. Lorsque vous lui expliquez votre situation, il vous coupe et vous dit : << Ecoutez. Je n'ai pas le temps de vous aidez à récupérer vos bien, mais je peux vous dire que si vous m'aidez pour cette mission, je pourrais vous offrir une récompense qui compensera très largement vos pertes. Je peux aussi vous fournir un Colt pour remplacer le votre.>>");
                                retour1=false;
                                break;
                        }
                    }

                }
                else if(choix4.equals("2")){
                    System.out.println("Vous sentez vraiment que continuer serait une mauvaise idée. Ravalant votre fierté et faisant une croix sur vos 100 dollars, vous admettez votre défaite et reprenez votre repas, sous le regard amusé des spectateurs.");
                    System.out.println("La musique arrive. Les gens se mettent à chanter et à danser. Soudain, une dame se trémoussant près de vous trébuche et fait tomber votre repas.");
                    System.out.println("Que voulez vous faire?");
                    System.out.println("1: lui crier dessus en lui demandant de lui rembourser votre repas");
                    System.out.println("2 : faire une blague pour dédramatiser la situation");
                    System.out.println("3 : garder le silence");
                    String choix6="";
                    choix6=keyboard.nextLine();
                    System.out.println("Vous avez choisi :"+ choix6);
                    switch(choix6){
                        case "1":
                            System.out.println("La demoiselle s'exclame :<<Oh ça va ! Je me suis faite pousser, ça arrive, et en plus vous aviez presque fini ! >>. Le ton monte, et après vous avoir fusillé du regard, elle quitte l'auberge.");
                            DameBrigand Ellen=new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false);
                            personnage.add(new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false));
                            break;
                        case "2":
                            System.out.println("Votre blague permet de détendre la pauvre femme qui semble d'ailleurs s'être fait pousser. Elle vous adresse un sourire et repart danser.");
                            DameDetresse Ellene=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
                            personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
                            break;
                        case "3":
                            System.out.println("La demoiselle s'excuse platement. Vous voyant stoïque comme une pierre, elle en déduit que vous devez être trop ivre pour réaliser ce qui vous arrive et repart danser.");
                            DameDetresse Ellene1=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
                            personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
                            break;
                    }
                    System.out.println("Le reste de la soirée est plutôt calme. Après avoir payé votre chambre, vous allez vous coucher. Le lendemain, vous êtes convoqué par le shérif qui vous demande pour une mission importante, et surtout très bien payée. Vous vous rendez donc chez lui pour obtenir plus d'informations.");
                    System.out.println("Le shérif vous attend dans son bureau. Il a l'air soucieux. Il prend la parole : <<Merci d'être venu. J'ai une mission de la plus haute importance à vous confier. Si vous y parvenez, vous êtes un homme riche.>>");
                }
                else{
                    System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
                    choix4=keyboard.nextLine(); 
                }

            }
           
        }
        else if(choix3.equals("2")){
           
            System.out.println("Vous avez passé l'âge de ces concours d'alcool stupides. Vous déclinez et continuez tranquillement votre repas.");
            System.out.println("La musique arrive. Les gens se mettent à chanter et à danser. Soudain, une dame se trémoussant près de vous trébuche et fait tomber votre repas.");
            System.out.println("Que voulez vous faire?");
            System.out.println("1: lui crier dessus en lui demandant de lui rembourser votre repas");
            System.out.println("2 : faire une blague pour dédramatiser la situation");
            System.out.println("3 : garder le silence");
            String choix6="";
            choix6=keyboard.nextLine();
            System.out.println("Vous avez choisi :"+ choix6);
            switch(choix6){
                case "1":
                    System.out.println("La demoiselle s'exclame :<<Oh ça va ! Je me suis faite pousser, ça arrive, et en plus vous aviez presque fini ! >>. Le ton monte, et après vous avoir fusillé du regard, elle quitte l'auberge.");
                    DameBrigand Ellen=new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false);
                    personnage.add(new DameBrigand("Ellen","Vin blanc","libre","rouge",3,1500,"Malicieuse",false));
                    break;
                case "2":
                    System.out.println("Votre blague permet de détendre la pauvre femme qui semble d'ailleurs s'être fait pousser. Elle vous adresse un sourire et repart danser.");
                    DameDetresse Ellene=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
                    personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
                    break;
                case "3":
                    System.out.println("La demoiselle s'excuse platement. Vous voyant stoïque comme une pierre, elle en déduit que vous devez être trop ivre pour réaliser ce qui vous arrive et repart danser.");
                    DameDetresse Ellene1=new DameDetresse("Ellen","Vin blanc","kidnappe","blanc");
                    personnage.add(new DameDetresse("Ellen","Vin blanc","kidnappe","blanc"));
                    break;
            }
            System.out.println("Le reste de la soirée est plutôt calme. Après avoir payé votre chambre, vous allez vous coucher. Le lendemain, vous êtes convoqué par le shérif qui vous demande pour une mission importante, et surtout très bien payée. Vous vous rendez donc chez lui pour obtenir plus d'informations.");
            System.out.println("Le shérif vous attend dans son bureau. Il a l'air soucieux. Il prend la parole : <<Merci d'être venu. J'ai une mission de la plus haute importance à vous confier. Si vous y parvenez, vous êtes un homme riche.>>");
        }
        else{
            System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
            choix3=keyboard.nextLine(); 
        }
        System.out.println("Il vous montre un portrait d'une jeune femme : << Ce tableau que vous voyez est celui de la fille d'un homme d'affaire important. Je tiens de source sûre que cette damoiselle s'est faite enlever hier soir dans la nuit par un groupe d'indiens qui refusent de se plier à l'autorité de la ville. Votre mission est de la délivrer avant que ces sauvages ne la scalpent. Mes hommes vont vous escorter jusqu'à l'endroit où ils ont été vu pour la dernière fois. J'ai confiance en vous. Vous êtes e meilleur Cowbow de la ville.>>");
        if(tropBu=false){
            System.out.println("Vous vous rendez compte que cette demoiselle n'est autre que la danseuse qui a renversé votre plat.");

        }   
        
        System.out.println("Vous vous rendez bien vite compte que le shérif n'acceptera aucune autre réponse que l'affirmative. Vous vous voyez contraint d'accepter cette mission.\nVous partez donc avec 4 des hommes du shérif en direction de la piste des indiens. Cette dernière est plutôt fraiche et vous la suivez sans trop de difficulté jusqu'aux abords du camp indien,situé au bord du fleuve Colorado..\nComment procédez vous ?");
        System.out.println("1 : Vous tentez de vous infiltrer discrètement  dans le camp");
        System.out.println("2 : Vous tentez une approche diplomatique");
        System.out.println("3 : Vous attaquez de front");
        String choix7="";
        choix7=keyboard.nextLine();
        System.out.println("Vous avez choisi :"+ choix7);
        switch(choix7){
            case "1":
                if(joueur.adjectif1.equals("estDiscret")|| joueur.adjectif2.equals("estDiscret")){
                    System.out.println("ous attendez la nuit pour vous infiltré dans le camp. Ayant une discrétion à toute épreuve, vous déjouez sans problème la vigilance des gardes. Vous fouillez les tipies un par un. Lorsque vous arrivez au dernier, qui n'est autre que celui du grand chef, vous vous rendez à l'évidence : il n'y a aucune trace de la fille.\nRéveiller le grand chef pour le menacer n'y change rien. Appeuré, il n'a aucune idée de ce dont vous lui parlez. \nVous revenez bredouille mais indemne du camp");
                    
                }
                else{
                    System.out.println("Vous tentez de pénétrer dans le camp indien sans vous faire repérer. Malheureusement, la discrétion n'est pas votre fort et vous vous faites capturer au moment de pénétrer dans la tente du grand chef.\nCe dernier, sévère mais avant tout étonné, vous demande ce que vous faites là.");
                    System.out.println("Que voulez vous faire ?");
                    System.out.println("1: lui révéler ce que vous chercher");
                    System.out.println("2 : garder le silence");
                    String choix8="";
                    choix8=keyboard.nextLine();
                    System.out.println("Vous avez choisi :"+ choix8);
                    if(choix8.equals("1")){


                    }
                    else if(choix8.equals("2")){

                    }
                    else{
                        System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
                        choix8=keyboard.nextLine(); 
                    }
                }
                retour2=true;
                break;
            case "2":
                if(joueur.adjectif1.equals("estChrarismatique")|| joueur.adjectif2.equals("estCharismatique")){
                    System.out.println("Vous entrez en contact avec l'un des gardes et demandez respectueusement à parler au grand chef. Vous êtes autorisé à entrer, mais pas vos compagnons. Lorsque vous parlez de la demoiselle au grand chef, ce dernier hausse un sourcil :\n<<Je ne sais pas d'où vous tenez cette information, mais ma tribu n'a jamais enlevé de jeune fille. Ces méthodes déloyales appartiennent aux peaux blanches. Nous combattons fièrement pour mériter l'aval des dieux.>>\nA peine finit-il sa phrase que plusieurs coups de feux  retentissent dehors. Manifestement, les hommes du shérif en ont eu marre d'attendre et ils ont décidé d'attaquer ! Lorsque vous sortez du tippie, la stupeur vous frappe. Les hommes du shérif sont maintenant une vingtaine, et tirent absolument partout, notamment dans votre direction ! ");
                    System.out.println("Que voulez vous faire ?");
                    System.out.println("1 : Aider les indiens à repousser l'attaque");
                    System.out.println("2: vous enfuir");
                    String choix9="";
                    choix9=keyboard.nextLine();
                    System.out.println("Vous avez choisi :"+ choix9);
                    if(choix9.equals("1")){


                    }
                    else if(choix9.equals("2")){

                    }
                    else{
                        System.out.println("Vous ne pouvez choisir que l'option 1 ou l'option 2");
                        choix9=keyboard.nextLine(); 
                    }
                }
                else{
                    System.out.println("Surestimant votre charisme, vous vous avancez seul vers le camp et commencez un discours grandiloquant exortant les indiens de vous remettre la fille qu'ils ont lâchement enlevé.\nVous êtes instantanément ligoté et emmené dans la tente du grand chef pour vous faire juger.\nLe grand chef commence : <<Je ne sais pas d'où vous tenez ces inepties, mais ma tribu n'a jamais enlevé de jeune fille. Ces méthodes déloyales appartiennent aux peaux blanches. Nous combattons fièrement pour mériter l'aval des dieux.>>\nSoudain, coups de feu et cris retentissent. Manifestement, les hommes du shérif sont passé à l'attaque! Vous profitez de la situation pour vous enfuir, mais quelque chose cloche : vous aussi êtes la cible des balles qui fusent ! \nVous parvenez in-extremis à défaire vos liens et à vous jeter dans le fleuve avant de vous faire trouer la peau");
                }
                retour2=true;
                break;
            case "3":
                System.out.println("Vous vous rendez compte que vous n'êtes absolument pas assez nombreux lorsque vous voyez une quinzaine d'Indiens vous pointer avec vos arc. Avant même de pouvoir réagir, vous et vos compagnons êtes transpercés de flèches, et agonisez dans votre sang.\nRecharge de la partie :");
                
                break;
        }

        
    }
}
