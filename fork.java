
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
    
    public void forkAttack(){
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}
