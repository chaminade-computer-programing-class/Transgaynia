

import java.util.Scanner;

import Story_Segmets.Opening;
import methods.*;


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
        boolean f;
        switch (s) {
            case 20:
            case 19:
            case 18:
                System.out.println("you see a dark cloud direcly in front of you wand a couple of dark sadows. " + 
                  "down the other path you only see one figure");
                System.out.println("you notice a small wellhiden opening in the thick brush to your left.");
                System.out.println("It seams to be a secrat path.");
                    f = true;
                break;
            case 17:
            case 16:
            case 15:
            case 14:
            case 13:
            case 12:
            case 11:
            case 10:
                System.out.println("you see a dark cloud direcly in front of you wand a couple of dark sadows. " + 
                    "down the other path you only see one figure");
                    f = false;
                break;
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("you think you see somthing down the middle path");
                    f = false;
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("You see jack shit");
                    f = false;
                break;
        
            default:
                System.out.println("You see jack shit");
                    f = false;
                break;
        }

        System.out.println("What path will you go down?");
        if (f == true){
            System.out.println("Middle(1) Right(2) left(3)");
        } else if (f == false){
            System.out.println("Middle(1) Right(2)");
        }
        int q;
        boolean h = false;
        while(h == true){
            q = ash.nextInt();
            ash.nextLine();
            switch (q){
                case 1:
                    //to fort seg
                    break;

                case 2:
                    //to ocupide town seg
                    h = false;
                    break;

                case 3:
                    // to tower seg
                    h = false;
                    break;
                
                default:
                    System.out.println("enter again dumbass!");
                    h = true;
                    break;
            }
    }



        
        
        










     }
}