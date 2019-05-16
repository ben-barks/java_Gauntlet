package Gauntlet.Klass;

import Gauntlet.Util.ArmourClass;
import Gauntlet.Util.HealthBar;

public abstract class Klass {
    private HealthBar hp;
    private ArmourClass ac;
    private Stats stats;

    public Klass(HealthBar hp, ArmourClass ac, Stats stats) {
        this.hp = hp;
        this.ac = ac;
    }

    public HealthBar getHp() {
        return hp;
    }

    public void setHp(HealthBar hp) {
        this.hp = hp;
    }

    public ArmourClass getAc() {
        return ac;
    }

    public void setAc(ArmourClass ac) {
        this.ac = ac;
    }
}
