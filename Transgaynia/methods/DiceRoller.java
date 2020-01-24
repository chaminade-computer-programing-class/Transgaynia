package Transgaynia.methods;

import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Diceroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceRoller {
    private int dice;
        Random rn = new Random();

    public void roll(int size){
        dice = rn.nextInt(size) + 1;
        System.out.println("You role a" + dice + "on a D" + size);
    }

    public void getdice(){
        return dice;
    }


    
}

