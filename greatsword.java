
/**
 * Write a description of class greatsword here.
 *
 * @author Dylan
 * @version 3.7.18
 */
public class greatsword extends twoHand
{
    String name = "Greatsword";

    public greatsword(){
        super(Dice.d6());
    }

    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d6()+ Dice.d6() + Dice.d6()+ Dice.d6();
        }else{
            dmg = Dice.d6()+ Dice.d6();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" damage. Congrats bud.");
    }
}
