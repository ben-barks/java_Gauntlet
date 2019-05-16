import Gauntlet.Interfaces.ITreasure;
import Gauntlet.Util.Purse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PurseTest {

    Purse purse;
    ITreasure treasure;


        @Before
    public void before(){
        purse = new Purse(20);
        treasure = new ITreasure() {
            @Override
            public int getValue() {
                return 10;
            }
        };
    }

    @Test
    public void canAddMoney(){
        purse.addMoney(treasure);
        assertEquals(21, purse.getCa$$monaay());
    }

    @Test
    public void canRemoveMoney(){
            purse.removeMoney(treasure);
            assertEquals(10, purse.getCa$$monaay());
    }

    @Test
    public void cannotGoBelowZero(){
            purse.removeMoney(new ITreasure() {
                @Override
                public int getValue() {
                    return 50;
                }
            });
            assertEquals(20, purse.getCa$$monaay());
    }
}
