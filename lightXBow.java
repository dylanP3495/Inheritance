
/**
 * Write a description of class lightXBow here.
 *
 * @author Dylan
 * @version 2.27.18
 */
public class lightXBow extends crossbow
{
    String name = "Light Crossbow";
    public lightXBow(){
     super(Dice.d8());
    }
 
    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d8() + Dice.d8();
        }else{
            dmg = Dice.d8();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" damage. Congrats bud.");
    }
}