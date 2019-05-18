package Gauntlet.StatusEffects.Debuff;

import Gauntlet.Character.Character;
import Gauntlet.Interfaces.IStatusEffect;
import Gauntlet.Util.Stats;

public class Confusion implements IStatusEffect {
    @Override
    public void apply(Character character) {
        Stats stats = character.getKlass().getStats();
        stats.getDexterity().decrease(1);
        stats.getStrength().decrease(1);
        stats.getIntelligence().decrease(1);
    }

    @Override
    public void remove(Character character) {
        Stats stats = character.getKlass().getStats();
        stats.getDexterity().increase(1);
        stats.getStrength().increase(1);
        stats.getIntelligence().increase(1);
    }
}
