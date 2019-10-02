import java.util.Scanner;
/**
 * Write a description of class Ctest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ctest{
    static void main(String[] args)throws InterruptedException{
        Player player1 = new Player();
        Enemy light1 = new Enemy("Kolbold sentry", 7,3);
        Enemy medium1 = new Enemy("Kobold guard", 10, 5);
        MethodHolder holder1 = new MethodHolder();
        Scanner ash = new Scanner(System.in);
        light1.setname("Kolbold Sentry");
        System.out.println(light1.getname() + medium1.getname());
        int q;
        int a;
        System.out.println("you face two kolbols, a sentry and a gaurd");
        holder1.combat2(light1, medium1, player1, holder1);
    }
}