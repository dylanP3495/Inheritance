
/**
 * Abstract class improvisedWeapon - write a description of the class here
 *
 * @author Dylan
 * @version 3.7.18
 */
public abstract class impWeapon implements WeaponInterface
{
    public int attack(){
        int dmg = 0;
        return dmg;
    }
    
    public boolean parry(){
        boolean parry = true;
        return parry;
    }
    
    int dmg;
    public impWeapon(int dmg){
     this.dmg = dmg;   
    }
}
