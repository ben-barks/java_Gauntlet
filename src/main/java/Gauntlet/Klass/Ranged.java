package Gauntlet.Klass;

import Gauntlet.Util.ArmourClass;
import Gauntlet.Util.HealthBar;
import Gauntlet.Util.Stats;

public class Ranged extends Klass {
    public Ranged() {
        super(new HealthBar(15, 15, 1), new ArmourClass(5), new Stats(1, 2, 1));
    }
}
