
/**
 * Abstract class ChairLeg - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class ChairLeg extends impWeapon
{
    String name = "Chair leg";
    int dmg = 4;
    public ChairLeg(int dmg){
        super (dmg);
    }
    
    public void chairLegAttack(){
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
