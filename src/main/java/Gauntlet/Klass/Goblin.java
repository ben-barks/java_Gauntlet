package Gauntlet.Klass;

import Gauntlet.Util.ArmourClass;
import Gauntlet.Util.HealthBar;
import Gauntlet.Util.Stats;

public class Goblin extends Klass{
    public Goblin(HealthBar hp, ArmourClass ac, Stats stats) {
            super(new HealthBar(8, 8, 1), new ArmourClass(5), new Stats(2, 1, 1));
    }
}
