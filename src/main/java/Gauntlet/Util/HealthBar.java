package Gauntlet.Util;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class HealthBar {
    private int maxHealth;
    private int currentHealth;
    private int minHealth;

    public HealthBar(int maxHealth, int currentHealth, int minHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.minHealth = minHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMinHealth() {
        return minHealth;
    }

    public int increaseHealth(int amount){
        this.currentHealth = Math.min(currentHealth + amount, maxHealth);
        return currentHealth;
    }

    public int decreaseHealth(int amount){
        this.currentHealth = Math.max(currentHealth - amount, minHealth);
        return currentHealth;
    }


}
