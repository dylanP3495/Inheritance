
/**
 * Write a description of class rock here.
 *
 * @author Dylan
 * @version 2.27.18
 */
public class rock extends impWeapon
{
    String name = "rock";
    public rock(int dmg){
        super (dmg);
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