public class Enemy {
    private static int dhealth;
    private static String name;
    private static int health;
    private static int damage;

    public Enemy(String ename, int ehealth, int edamage) {
        name = ename;
        health = ehealth;
        damage = edamage;
        dhealth = ehealth;
    }

    public Enemy() {
        name = "kobold sentry";
        health = 7;
        damage = 3;
        dhealth = 7;
    }
    
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void attack(Player player, Enemy enemy) {
        player.takedamage(enemy);
        System.out.println(name + " attacks.");
    }
    
    public void damage(Player player){
        health = health - player.getwd();
        System.out.println(name + " takes " + player.getwd() + " damage");
    }
    
    public void deatht(){
        if (health <= 0){
             die();
        }
    }
    
    public int gethealth() {
        return health;
    }

    public void sethealth(int health) {
        this.health = health;
    }
    
    public int getdamage() {
        return damage;
    }

    public void setdamage(int damage){
        this.damage = damage;
    }
    
    public void die(){
        System.out.println("You have slain " + name);
    }
    
    public void reset(){
        sethealth(dhealth);
    }
}