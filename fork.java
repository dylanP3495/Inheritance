
/**
 * Abstract class fork - write a description of the class here
 *
 * @author Dylan Palafox
 * @version 2.14.18
 */
public class fork extends impWeapon
{
    String name = "Fork (of dooom)(not for pie)(For stabbing)";
    public fork(int dmg){
        super (dmg);
    }
    
    public void Attack(){
        int roll = Dice.d20();
        int dmg;
        String dmgType = "piercing";
        if(roll >= 19){
            dmg = Dice.d4() + Dice.d4();
        }else{
            dmg = Dice.d4();
        }
        System.out.println("You hit them with your"+ name +". You did "+dmg+" "+dmgType+" damage. Congrats bud.");
    }
}
