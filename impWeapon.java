
/**
 * Abstract class improvisedWeapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class impWeapon implements WeaponInterface
{
    public int attack(){
        int dmg = 0;
        return dmg;
    }
    
    public boolean parry(){
        boolean parry = false;
        return parry;
    }
    
    int dmg;
    public impWeapon(int dmg){
     this.dmg = dmg;   
    }
}
