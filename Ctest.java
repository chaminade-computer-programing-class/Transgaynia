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
        while(light1.gethealth() > 0 || medium1.gethealth() > 0){
            System.out.println("It is your turn");
            System.out.println("What do you do: (1)Attack the sentery " +
                                "(2)Attack guard (3)heal");
            q = ash.nextInt();
            ash.nextLine();
            if (q == 1){
                player1.pattack(light1, player1);
                System.out.println(1);
                System.out.println(light1.getname());
            } else if (q == 2){
                player1.pattack(medium1, player1);
                System.out.println(2);
            }else if (q == 3){
                player1.heal();
                System.out.println(3);
            }
            light1.deatht();
            medium1.deatht();
            holder1.enemyd(light1, medium1, player1);
            System.out.println("It is the gaurds turn");
            player1.takedamage(medium1);
            player1.deatht();
            System.out.println("It is your turn");
            System.out.println("What do you do: (1)Attack the sentery " +
                                "(2)Attack guard (3)heal");
            a = ash.nextInt();
            ash.nextLine();
            if (a == 1){
                player1.pattack(light1, player1);
            } else if (a == 2){
                player1.pattack(medium1, player1);
            }else if (a == 3){
                player1.heal();
            }
            light1.deatht();
            medium1.deatht();
            holder1.enemyd(light1, medium1, player1);
            System.out.println("It is the senteries turn");
            player1.takedamage(light1);
            player1.deatht();
                if (light1.gethealth() <= 0){
                    while (medium1.gethealth() > 0){
                    System.out.println("It is your turn");
                    System.out.println("What do you do: (1)Attack guard (2)heal");
                    q = ash.nextInt();
                    ash.nextLine();
                    if (q == 1){
                            player1.pattack(medium1, player1);
                        } else if (q == 2){
                        player1.heal();
                    }   
                    medium1.deatht();
                    System.out.println("It is the gaurds turn");
                    player1.takedamage(medium1);
                    player1.deatht();
                }   
            } else if(medium1.gethealth() <= 0){
               while(light1.gethealth() > 0){
                    System.out.println("It is your turn");
                    System.out.println("What do you do: (1)Attack the sentery (2)heal");
                    a = ash.nextInt();
                    ash.nextLine();
                    if (q == 1){
                        player1.pattack(light1, player1);
                    }else if (q == 2){
                        player1.heal();
                    }
                    light1.deatht();
                    System.out.println("It is the senteries turn");
                    player1.takedamage(light1);
                    player1.deatht();
               }
            }
        }
    }
}