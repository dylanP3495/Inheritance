
/**
 * Its a spear. IDK what else to say...
 *
 * @author Dylan Palafox
 * @version 3.6.18
 */
public class spear extends ranged

{
    String name = "Spear";
    public spear(int dmg)
    {
        super(dmg);
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
