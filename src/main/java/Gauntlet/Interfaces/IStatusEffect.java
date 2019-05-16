package Gauntlet.Interfaces;

import Gauntlet.Character.Character;

public interface IStatusEffect {
    void apply(Character character);
    void remove(Character character);
}
