
/**
 * Write a description of class crossbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class crossbow extends ranged
{
    public int attack(){
        int attack = 0;
        return attack;
    }
    
    public boolean parry(){
        boolean parry = false;
        return parry;
    }
    
    int dmg;
    public crossbow(int dmg){
     this.dmg = dmg;
    }
}