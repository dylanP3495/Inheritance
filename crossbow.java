
/**
 * Write a description of class crossbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class crossbow extends ranged
{
    public int attack(){
        int dmg = 0;
        return dmg;
    }
    
    public boolean parry(){
        boolean parry = false;
        return parry;
    }
    
    public crossbow(int dmg){
     super(dmg);
    }
}