package Gauntlet.Util;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        usingRandomClass();
    }
    public static int usingRandomClass() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(20) + 1;
    }
}
