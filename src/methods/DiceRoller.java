package methods;

import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Diceroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceRoller {
    private static int dice;
    static Random rn = new Random();

    public static void roll(int size){
        dice = rn.nextInt(size) + 1;
        System.out.println("You role a" + dice + "on a D" + size);
    }

    public static int getdice(){
        return dice;
    }


    
}

