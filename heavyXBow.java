
/**
 * Write a description of class heavyXBow here.
 *
 * @author Dylan
 * @version 2.28.18
 */
public class heavyXBow extends crossbow
{
    String name = "Heavy Crossbow";
    public heavyXBow(){
        super (Dice.d10());
    }

    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "piercing";
        if(roll >= 19){
            dmg = Dice.d10() + Dice.d10();
        }else{
            dmg = Dice.d10();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" "+dmgType+"damage. Congrats bud.");
    }
}
