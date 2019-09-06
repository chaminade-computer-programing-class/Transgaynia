import java.util.Scanner;
/**
 * Write a description of class MethodHolder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MethodHolder
{
    public void combat2(Enemy enemy1, Enemy enemy2, Player player){
        
    }
    int a;
    int q;
    Scanner ash = new Scanner(System.in);
    public MethodHolder(){
        
    }
    
    public void enemyd(Enemy enemy1, Enemy enemy2, Player player) {
        
        if (enemy1.gethealth() <= 0){
            while (enemy2.gethealth() > 0){
                System.out.println("It is your turn");
                System.out.println("What do you do: (1)Attack guard (2)heal");
                q = ash.nextInt();
                ash.nextLine();
                if (q == 1){
                    player.pattack(enemy2, player);
                } else if (q == 2){
                    player.heal();
                }
                enemy2.deatht();
                System.out.println("It is the gaurds turn");
                player.takedamage(enemy2);
                player.deatht();
            }   
        } else if(enemy2.gethealth() <= 0){
           while(enemy1.gethealth() > 0){
                System.out.println("It is your turn");
                System.out.println("What do you do: (1)Attack the sentery (2)heal");
                a = ash.nextInt();
                ash.nextLine();
                if (q == 1){
                    player.pattack(enemy1, player);
                }else if (q == 2){
                    player.heal();
                }
                enemy1.deatht();
                System.out.println("It is the senteries turn");
                player.takedamage(enemy1);
                player.deatht();
           }
        }
    }
}
