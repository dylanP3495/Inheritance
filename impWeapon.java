
/**
 * Abstract class improvisedWeapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class impWeapon implements WeaponInterface
{
    int dmg;
    
    public impWeapon(int dmg,int attack, boolean parry){
        this.dmg = dmg;
    }
}
