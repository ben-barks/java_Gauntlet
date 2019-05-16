package Gauntlet.Klass;

import Gauntlet.Util.ArmourClass;
import Gauntlet.Util.HealthBar;
import Gauntlet.Util.Stats;

public class Magic extends Klass{
    public Magic() {
        super(new HealthBar(15, 15, 1), new ArmourClass(5), new Stats(1,1,2));
    }


}
