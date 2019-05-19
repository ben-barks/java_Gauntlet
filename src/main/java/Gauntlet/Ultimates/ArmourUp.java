package Gauntlet.Ultimates;

import Gauntlet.Character.Character;
import Gauntlet.Interfaces.IUltimate;
import Gauntlet.Util.ArmourClass;

public class ArmourUp implements IUltimate {
    @Override
    public void activate(Character character) {
        character.defendScore += 5;
    }
}
