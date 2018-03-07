
/**
 * Write a description of class pike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pike extends twoHand
{
    String name = "Pike";

    public pike(){
        super(Dice.d10());
    }
    
        public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d10() + Dice.d10();
        }else{
            dmg = Dice.d10();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" damage. Congrats bud.");
    }
}
