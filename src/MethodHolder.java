package src;

import java.util.Scanner;
/**
 * Write a description of class MethodHolder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MethodHolder
{
    int a;
    int q;
    Scanner ash = new Scanner(System.in);
    
    public MethodHolder() {
    }
    
    
    public void combat2(Enemy enemy1, Enemy enemy2, Player player, MethodHolder holder){

        while(enemy1.gethealth() > 0 || enemy2.gethealth() > 0){
            System.out.println("It is your turn");
            System.out.println("What do you do: (1)Attack the sentery " +
                                "(2)Attack guard (3)heal");
            q = ash.nextInt();
            ash.nextLine();
            if (q == 1){
                player.pattack(enemy1, player);
                System.out.println(1);
                System.out.println(enemy1.getname());
            } else if (q == 2){
                player.pattack(enemy2, player);
                System.out.println(2);
            }else if (q == 3){
                player.heal();
                System.out.println(3);
            }
            enemy1.deatht();
            enemy2.deatht();
            holder.enemyd2(enemy1, enemy2, player);
            System.out.println("It is the gaurds turn");
            player.takedamage(enemy2);
            player.deatht();
            System.out.println("It is your turn");
            System.out.println("What do you do: (1)Attack the sentery " +
                                "(2)Attack guard (3)heal");
            a = ash.nextInt();
            ash.nextLine();
            if (a == 1){
                player.pattack(enemy1, player);
            } else if (a == 2){
                player.pattack(enemy2, player);
            }else if (a == 3){
                player.heal();
            }
            enemy1.deatht();
            enemy2.deatht();
            holder.enemyd2(enemy1, enemy2, player);
            player.deatht();
        }
    }

    public void enemyd2(Enemy enemy1, Enemy enemy2, Player player) {
        
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
