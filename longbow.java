
/**
 * Write a description of class longBow here.
 *
 * @author Dylan
 * @version 3.7.18
 */
public class longbow extends ranged
{
    String name = "Longbow";

    public longbow(int dmg){
        super (dmg);
    }

    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d8() + Dice.d8();
        }else{
            dmg = Dice.d8();
        }
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
