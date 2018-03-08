
/**
 * Write a description of class maul here.
 *
 * @author Dylan
 * @version 3.8.18
 */
public class maul extends oneHand
{
    String name = "Maul";
    public maul(){
        super (Dice.d6());
    }

    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "bludgeoning";
        if(roll >= 19){
            dmg = Dice.d6() + Dice.d6();
        }else{
            dmg = Dice.d6();
        }
        System.out.println("You hit them with your"+ name +". You did "+ dmg +" "+ dmgType +"damage. Congrats bud.");
    }
}
