
/**
 * Write a description of class shortsword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shortsword extends oneHand
{
    String name = "ShortSword";
    public shortsword(){
        super (Dice.d6());
    }

    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "piercing";
        if(roll >= 19){
            dmg = Dice.d6() + Dice.d6();
        }else{
            dmg = Dice.d6();
        }
        System.out.println("You hit them with your"+ name +". You did "+ dmg +" "+ dmgType +"damage. Congrats bud.");
    }
}
