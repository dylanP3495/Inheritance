
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
    
    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "bludgeoning";
        if(roll >= 19){
            dmg = Dice.d4() + Dice.d4();
        }else{
            dmg = Dice.d4();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" "+dmgType+" damage. Congrats bud.");
    }
}
