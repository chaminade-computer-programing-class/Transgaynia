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
        Enemy Light1 = new Enemy();
        Enemy medium1 = new Enemy("Kobold guard", 10, 5);
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
                + "Trans princess and prassed gender roll laws on the the kingdom");
        Thread.sleep(1000);
        System.out.println("You: He took my Sister! Tell me where he is and ill beat the crap out of him.");
        Thread.sleep(1000);
        System.out.println("Zargon: You cant just go barging in tothe castle with a stick for a weapon");
        Thread.sleep(1000);
        System.out.println("You look down at your belt and you see a twige in your scabered");
        Thread.sleep(1000);
        System.out.println("Zargon: Take these coins and got buy some gear");
        Thread.sleep(1000);
        player1.setpcoins(20);
        System.out.println("Coins: " + player1.getpcoins());
        Thread.sleep(1000);
        System.out.println("You walk out side");
        System.out.println();
        Thread.sleep(1000);

    }
}