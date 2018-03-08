
/**
 * What's up david.
 *
 * @author Dylan 
 * @version 3.6.18
 */
public class sling extends ranged
{
    String name = "Sling";
    public sling(){
        super(Dice.d4());
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
        System.out.println("You hit them with your"+ name +". You did "+ dmg +" "+dmgType+"damage. Congrats bud.");
    }
}
