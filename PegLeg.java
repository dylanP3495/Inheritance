
/**
 * Write a description of class PegLeg here.
 *
 * @author Dylan Palafox
 * @version 2.14.18
 */
public class PegLeg extends impWeapon{
    String name = "PegLeg";
    public PegLeg(int dmg){
        super (dmg);
    }
    
    public void pegLegAttack(){
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
