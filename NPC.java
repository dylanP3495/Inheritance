
/**
 * Abstract class NPC - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class NPC
{
    String CharRace;
    String CharClass;
    boolean multiClass;
    public NPC(String CharRace, String CharClass,boolean multiClass){
        this.CharRace = CharRace;
        this.CharClass = CharClass;
        this.multiClass = multiClass;
    }
    public void whine(){
     System.out.println("Why you gotta come in this mfckn town with 800 gold pieces and a severed bugbear heads and cause trouble... SMH...");
    }
}
