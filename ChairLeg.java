
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
    
    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d4() + Dice.d4();
        }else{
            dmg = Dice.d4();
        }
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
