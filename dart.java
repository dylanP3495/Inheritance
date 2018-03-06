
/**
 * To show off your extreme pub game skills.
 *
 * @author Dylan 
 * @version 3.6.18
 */
public class dart extends ranged
{
    String name = "Dart";
    public dart(int dmg)
    {
        super(dmg);
    }

            public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d4() + Dice.d4();
        }else{
            dmg = Dice.d4();
        }
        System.out.println("You hit them with your"+ name +". You did "+ dmg +" damage. Congrats bud.");
    }
}
