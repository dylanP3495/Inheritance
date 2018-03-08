
/**
 * Write a description of class BatLeth here.
 *
 * @author Dylan
 * @version (a version number or a date)
 */
public class BatLeth extends twoHand
{
    String name = "Bat'leth";

    public BatLeth(){
        super(Dice.d20());
    }

    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "annihilation";
        if(roll >= 19){
            dmg = Dice.d20() + Dice.d20() + Dice.d20() + Dice.d20();
        }else{
            dmg = Dice.d20()+ Dice.d20();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" "+dmgType+" damage. Congrats bud.");
    }
}
