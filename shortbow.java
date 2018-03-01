
/**
 * Write a description of class shortBow here.
 *
 * @author Dylan Palafox
 * @version 2.28.18
 */

public class shortbow extends ranged
{
    String name = "Shortbow";

    public shortbow(int dmg){
        super (dmg);
    }
    
        public void shortbowAttack(){
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}