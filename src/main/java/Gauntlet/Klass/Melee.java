package Gauntlet.Klass;

import Gauntlet.Util.ArmourClass;
import Gauntlet.Util.HealthBar;
import Gauntlet.Util.Stats;

public class Melee extends Klass {
    public Melee() {
        super(new HealthBar(15, 15, 1), new ArmourClass(5), new Stats(2, 1, 1));
    }
}
