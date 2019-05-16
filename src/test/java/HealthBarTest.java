import Gauntlet.Util.HealthBar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthBarTest {

    HealthBar healthbar;

    @Before
    public void before(){
        healthbar = new HealthBar(15, 10, 1);
    }

    @Test
    public void doesNotGoPastMax(){
        healthbar.increaseHealth(7);
        assertEquals(15, healthbar.getCurrentHealth());
    }

    @Test
    public void doesNotGoBelowMin(){
        healthbar.decreaseHealth(5);
        assertEquals(5, healthbar.getCurrentHealth());
    }

    @Test
    public void canBeSetToMax(){
        healthbar.increaseHealth(5);
        assertEquals(15, healthbar.getCurrentHealth());
    }

    @Test
    public void canBeSetToMin(){
        healthbar.decreaseHealth(10);
        assertEquals(1, healthbar.getCurrentHealth());
    }
}
