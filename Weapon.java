
/**
 * Write a description of class Weapon here.
 *
 * @author Dylan
 * @version 2.7.18
 */
public abstract class Weapon implements WeaponInterface
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
    public Weapon(int dmg){
     this.dmg = dmg;   
    }
}
