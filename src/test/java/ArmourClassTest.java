import Gauntlet.Util.ArmourClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArmourClassTest {

    ArmourClass armourclass;

    @Before
    public void before(){
        armourclass = new ArmourClass(5);
    }

    @Test
    public void hitsIfMoreThan(){
        assertTrue(armourclass.didItHit(7));
    }

    @Test
    public void doesNotHitIfLessThan(){
        assertFalse(armourclass.didItHit(3));
    }

    @Test
    public void doesNotHitIfEqual(){
        assertFalse(armourclass.didItHit(5));
    }
}
