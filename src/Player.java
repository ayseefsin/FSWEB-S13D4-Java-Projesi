public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon ){
        this.name =name;
        this.healthPercentage = healthPercentage;
        healthControl(healthPercentage);
        this.weapon=weapon;
    }
    private void healthControl (int healthPercentage){
        if(healthPercentage<0){
            this.healthPercentage=0;
        }
        if(healthPercentage>100){
            this.healthPercentage=100;
        }
    }
    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
       int healthRemain = healthPercentage- damage;
       // if(healthPercentage<0){System.out.printIn(this.name + " player has been knocked out of game");}
        healthPercentage=healthRemain;
        healthControl(healthPercentage);
    }
    public void restoreHealth(int healthPotion){
       this.healthPercentage+=healthPotion;
        healthControl(healthPercentage);
    }

    @java.lang.Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
