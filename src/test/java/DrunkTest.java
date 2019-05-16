import Gauntlet.Character.Character;
import Gauntlet.Interfaces.IUltimate;
import Gauntlet.Klass.Melee;
import Gauntlet.StatusEffects.Buff.Drunk;
import Gauntlet.Util.Purse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DrunkTest {

    Drunk drunk;
    Character character;

    @Before
    public void before(){
        drunk = new Drunk();
        character = new Character(new Melee(), new Purse(0), new IUltimate() {
            @Override
            public void activate(Character character) {

            }
        });

    }

    @Test
    public void hasEffect(){
        character.addStatusEffect(drunk);
        assertNotNull(character.getStatusEffect());
    }
}
