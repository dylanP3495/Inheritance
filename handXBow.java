
/**
 * Write a description of class handXBow here.
 *
 * @author Dylan
 * @version 2.27.18
 */
public class handXBow extends crossbow
{
    String name = "Hand Crossbow";
    public handXBow(){
        super (Dice.d6());
    }
    
    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d6() + Dice.d6();
        }else{
            dmg = Dice.d6();
        }
        System.out.println("You hit them with your"+ name +". You did "+ dmg +" damage. Congrats bud.");
    }
}
