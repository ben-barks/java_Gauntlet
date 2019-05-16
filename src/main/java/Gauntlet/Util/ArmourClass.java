package Gauntlet.Util;

public class ArmourClass {
    private int defaultAC;
    private int currentAC;

    public ArmourClass(int defaultAC) {
        this.defaultAC = defaultAC;
        this.currentAC = defaultAC;
    }

    public int getDefaultAC() {
        return defaultAC;
    }

    public int getCurrent() {
        return currentAC;
    }

    public boolean didItHit(int damage){
        return damage > currentAC;
    }

    public void increase(int amount){
        this.currentAC += amount;
    }

    public void decrease(int amount) {
        this.currentAC -= amount;
    }

    }
