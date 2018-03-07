
/**
 * Write a description of class twoHand here.
 *
 * @author Dylan
 * @version 3.7.18
 */
public abstract class twoHand extends melee
{
    public int attack(){
        int dmg = 0;
        return dmg;
    }

    public boolean parry(){
        boolean parry = true;
        return parry;
    }


    public twoHand(int dmg){
        super(dmg);   
    }
}
