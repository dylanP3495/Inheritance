
/**
 * Write a description of class RustyPipe here.
 *
 * @author Dylan Palafox
 * @version 2.14.18
 */
public class RustyPipe extends impWeapon{

    String name = "Rusty Pipe";
    public RustyPipe(int dmg){
        super(dmg);
    }
    
    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "bludgeoning";
        if(roll >= 19){
            dmg = Dice.d4() + Dice.d4();
        }else{
            dmg = Dice.d4();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" "+dmgType+" damage. Congrats bud.");
    }
}