import java.util.Scanner;
import java.util.Random;
import transgaynia.MethodHolder;
import transgaynia.Story_Segments.Opening;
import transgaynia.methods.Combat;
import transgaynia.methods.Enter;
import transgaynia.methods.DiceRoller;

public class transgaynia {
    public static void main(String[] args) throws InterruptedException {
        Player player1 = new Player();
        Enemy Light1 = new Enemy("Kolbold scout", 3,3);
        Enemy light1 = new Enemy("Kobold scout", 3, 3);
        Scanner ash = new Scanner(System.in);

       //story 
        Opening.opening();
        System.out.println("you leave the town. who knows if you will ever be back.");
            Enter.enter();
        System.out.println("you come to a 3 way fork");
        System.out.println("roling perseption")
            thread.sleep(4000);
        DiceRoller.roll(20);
            Enter.enter();
        switch (DiceRoller.getdice()) {
            case 20:
            case 19:
            case 18:
                System.out.println("you see a dark cloud direcly in front of you wand a couple of dark sadows.
                \n down the other paths you only see one figure");
                break;
            case 17:
            case 16:
            case 16:
            case 15:
            case 14:
            case 13:
            case 12:
            case 11:
            case 10:
                System.out.println("you see a dark clowd over the middle path");
                break;
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("you think you see somthing down the middle path");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("You see jack shit");
                break;
        
            default:
                System.out.println("You see jack shit");
                break;
        }
        
        










     }
}