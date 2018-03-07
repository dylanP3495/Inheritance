
/**
 * Abstract class melee - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class melee extends Weapon
{
    public melee(int dmg){
     super(dmg);   
    }
    
    public boolean parry(){
        boolean parry  =  false;
        return parry;
    }
}
