package src;

import java.util.Scanner;

import src.Story_Segmets.Opening;
import src.methods.DiceRoller;
import src.methods.Enter;

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
        System.out.println("roling perseption");
            Thread.sleep(4000);
        DiceRoller.roll(20);
            Enter.enter();
            DiceRoller.roll(20);
        int s = DiceRoller.getdice();
        switch (s) {
            case 20:
            case 19:
            case 18:
                System.out.println("you see a dark cloud direcly in front of you wand a couple of dark sadows. " + 
                  "down the other paths you only see one figure");
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

        System.out.println("What path will you go down?");
        System.out.println("Left(1) Middle(2) Right(3)");
        int q = ash.nextInt();
        ash.nextLine();

        switch (q){
            case 1:
                //to tower seg
                break;

            case 2:
                //to fort seg
                break;

            case 3:
                // to ocupide town seg
                break;
            
            default:
                // enter again dumbass
                break;
        }


        
        
        










     }
}