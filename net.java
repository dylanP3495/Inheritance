
/**
 * For catching fish. And dirty scum.
 *
 * @author Dylan
 * @version 3.6.18
 */
public class net extends ranged
{
    String name = "Net (of doom)";
    public net(int dmg)
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
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
