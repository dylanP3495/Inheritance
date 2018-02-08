
/**
 * Write a description of interface CharacterInterface here.
 *
 * @author Dylan
 * @version 2.7.18
 */
public interface CharacterInterface
{
    /**
     *
     * @return   the race of your character
     */

    String getCharRace();

    /**
     *
     * @return   the class of your character
     */
    String getCharClass();

    /**
     *
     * @return   whether or not your character is multiclassing
     */
    boolean multiClass();
}
