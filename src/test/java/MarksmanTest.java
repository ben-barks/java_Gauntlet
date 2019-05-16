import Gauntlet.Character.Character;
import Gauntlet.Klass.Melee;
import Gauntlet.Ultimates.Marksman;
import Gauntlet.Util.Purse;
import org.junit.Before;
import org.junit.Test;

public class MarksmanTest {

    Marksman marksman;
    Character character;

    @Before
    public void before(){
        marksman = new Marksman();
        character = new Character(new Melee(), new Purse(0), marksman);
    }

 }
