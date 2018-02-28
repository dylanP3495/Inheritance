
/**
 * Write a description of class RustyPipe here.
 *
 * @author Dylan Palafox
 * @version 2.14.18
 */
public class RustyPipe extends impWeapon{
    int dmg = 4;
    String name = "Rusty Pipe";
    public RustyPipe(int dmg){
        super(dmg);
    }
    
    public void pipeAttack(){
        System.out.println("You hit them with your"+ name +". You did 4 damage. Congrats bud.");
    }
}