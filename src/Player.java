

public class Player extends Friendly{
   private String pname;
   private String pgender;
   private String psexuality;
   private String wn;
   private int wd;
   private int phealth;
   private int phealthp;
   private int pcoins;
   private int plevel;
   public static String[] inventory = new String[20];

   public Player() {
      pname = "zargon";
      wn = "stick";
      wd = 5;
      phealth = 15;
      phealthp = 5;
      pcoins = 10;
      plevel = 1;
   }

   public String getpname() {
      return pname;
   }

   public void setpname(String pname) {
      this.pname = pname;
   }

   public String getpgender() {
      return pgender;
   }

   public void setpgender(String pgender) {
      this.pgender = pgender;
   }

   public String getpsexuality() {
      return psexuality;
   }

   public void setpsexuality(String psexuality) {
      this.psexuality = psexuality;
   }

   public String getwn() {
      return wn;
   }

   public void setwn(String wn) {
      this.wn = wn;
   }

   public int getwd() {
      return wd;
   }

   public void setwd(int wd) {
      this.wd = wd;
   }

   public int getphealth() {
      return phealth;
   }

   public void setphealth(int phealth) {
      this.phealth = phealth;
   }

   public int getphealthp() {
      return phealthp;
   }

   public void setphealthp(int phealthp) {
      this.phealthp = phealthp;
   }

   public int getpcoins() {
      return pcoins;
   }

   public void setpcoins(int pcoins) {
      this.pcoins = this.pcoins + pcoins;
   }

   public int getplevel() {
      return plevel;
   }

   public void setplevel(int plevel) {
      this.plevel = plevel;
   }

   public void pattack(Enemy enemy, Player player) {
       System.out.println("You attake " + enemy.getname());
       enemy.damage(player);
   }

   public void takedamage(Enemy enemy) {
       phealth = phealth - enemy.getdamage();
       System.out.println("you take " + enemy.getdamage());
       System.out.println("health: " + phealth);
   }

   public void heal() {
      phealth = phealth + 5;
      phealthp--;
      System.out.println("You now have " + phealth + "HP");
   }
   
   public void deatht(){
       if(phealth <= 0){
           die();
        }
   }
   
   public void die() {
       System.out.println("You have been slain.");
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("GAME OVER");
       throw new IllegalArgumentException();
    }
   }
