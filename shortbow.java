
/**
 * Write a description of class shortBow here.
 *
 * @author Dylan Palafox
 * @version 2.28.18
 */

public class shortbow extends ranged
{
    String name = "Shortbow";

    public shortbow(int dmg){
        super (dmg);
    }
    
        public void Attack(){
        int roll = Dice.d20();
        int dmg;
        if(roll >= 19){
            dmg = Dice.d6() + Dice.d6();
        }else{
            dmg = Dice.d6();
        }
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}