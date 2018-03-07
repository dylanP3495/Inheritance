
/**
 * Write a description of class glaive here.
 *
 * @author Dylan Palafox
 * @version 2.22.18
 */
public class glaive extends twoHand
{
    String name = "Glaive";

    public glaive(){
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
