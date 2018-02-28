
/**
 * Write a description of class ProstheticLimb here.
 *
 * @author Dylan
 * @version 2.27.18
 */
public class ProstheticArm extends impWeapon
{
    String name = "Prosthetic Arm";
    public ProstheticArm(int dmg){
        super (dmg);
    }
    
    public void ProstheticArmAttack(){
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
