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

    public int getCurrentAC() {
        return currentAC;
    }

    public boolean didItHit(int damage){
        return damage > currentAC;
    }
}
