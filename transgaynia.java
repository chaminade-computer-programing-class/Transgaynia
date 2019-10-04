import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class test4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class transgaynia {
    public static void main(String[] args) throws InterruptedException {
        Player player1 = new Player();
        Enemy Light1 = new Enemy("Kolbold scout", 3,3);
        Enemy light1 = new Enemy("Kobold scout", 3, 3);
        MethodHolder holder1 = new MethodHolder();
        Scanner ash = new Scanner(System.in);
        System.out.println("you see a old shamble tavern. Its walls are covered by graffiti. You enter");
        Thread.sleep(1000);
        System.out.println("Hagor: welcome to my tavern great adventurer. What is your name.");
        player1.setpname(ash.nextLine());
        System.out.println("You: The name's " + player1.getpname());
        Thread.sleep(1000);
        System.out.println(" Hagor: Nice to meet you " + player1.getpname() + ". may I ask you gender and sexuality?");
        Thread.sleep(1000);
        System.out.println("Gender: ");
        player1.setpgender(ash.nextLine());
        System.out.println("Sexuality: ");
        player1.setpsexuality(ash.nextLine());
        System.out.println("You: Im a " + player1.getpsexuality() + " " + player1.getpgender());
        Thread.sleep(1000);
        System.out.println("Hagor: Ah, good your not a phobe are you wound outa here.");
        Thread.sleep(1000);
        System.out.println("Hagor: can get you a drink?");
        Thread.sleep(1000);
        System.out.println("1: Gayderaid 2: The tea");
        Thread.sleep(1000);
        int q = ash.nextInt();
        ash.nextLine();
        if (q == 1) {
            System.out.println("You: Gayderade please");
        } else if (q == 2) {
            System.out.println("You: The Tea plaese");
        } else {
            System.out.println("Invalade imput");
        }
        Thread.sleep(1000);
        System.out.println("Hagor: Coming right up");
        Thread.sleep(1000);
        System.out.println("You: Hay, what is a phobe?");
        Thread.sleep(1000);
        System.out.println(
                "Hagor: you don't know! We got invaded by phodes! They hate out kind, like the oppiset of allies!");
        Thread.sleep(1000);
        System.out.println("Hagor: You need to get to the police station right away so they can fill you in");
        Thread.sleep(1000);
        System.out.println("You: Ok Thanks");
        Thread.sleep(2000);
        System.out.println("You walk in to the station and you see a large bear behind the desk");
        Thread.sleep(1000);
        System.out.println("Zargon: Thank you for coming " + player1.getpname() + ",  because we need your help");
        Thread.sleep(1000);
        System.out.println("Zargon: The King of the phobes, Mike Pentce, has Kidnaped our"
                + "Trans princess, Ashley, and prassed gender roll laws on the the kingdom");
        Thread.sleep(1000);
        System.out.println("You: He took my Sister! Tell me where he is and ill beat the crap out of him.");
        Thread.sleep(1000);
        System.out.println("Zargon: You cant just go barging in to the castle with a stick for a weapon");
        Thread.sleep(1000);
        System.out.println("You look down at your belt and you see a twige in your scabered");
        Thread.sleep(1000);
        System.out.println("Zargon: Take these coins and got buy some gear");
        Thread.sleep(1000);
        player1.setpcoins(40);
        System.out.println("Coins =  " + player1.getpcoins());
        Thread.sleep(1000);
        System.out.println("You walk out side");
        System.out.println("you see a sighn that says \" Doors weapon emporium\"" );
        Thread.sleep(1000);
        System.out.println("Door: Ellow I am door, Welcome to my shop. how my I elp you?");
        Thread.sleep(1000);
        System.out.println("You: Hello door, I would like to buy a weapon");
        Thread.sleep(1000);
        System.out.println("Door: yes, I ave many items of the weapon");
        Thread.sleep(1000);
        System.out.println("I have (1)long sword (2)war hammer (3)battle axe (4)dual daggers");
        System.out.println("take you pick");
        boolean loop = false;
        int w = ash.nextInt();
        ash.nextLine();
        if (w == 1){
            System.out.println("Door: here your long sword");
            player1.setwn("Long sword");
            player1.setwd(10);
            loop = true;
        }
        else if (w == 2){
            System.out.println("Door: here your War Hammer");
            player1.setwn("war Hammer");
            player1.setwd(10);
            loop = true;
        }
        else if (w == 3){
            System.out.println("Door: here your battle axe");
            player1.setwn("battle axe");
            player1.setwd(10);
            loop = true;
        }
        else if (w == 4){
            System.out.println("Door: here your dual daggers");
            player1.setwn("dual daggers");
            player1.setwd(10);
            loop = true;
        }
        else {
            System.out.println("Door: i have no idea what you are talking about so here is a slighty stonger stick");
            player1.setwn("hard stick");
            pplayer1.setwd(4);
        }










     }
}