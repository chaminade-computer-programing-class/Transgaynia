
package Transgaynia.methods;

import Transgaynia.Enemy;
import Trangaynia.Friendly;
public class Combat{

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
}
