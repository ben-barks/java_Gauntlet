package Gauntlet.Items.Armour;

import Gauntlet.Character.Character;
import Gauntlet.Items.Item;
import Gauntlet.Items.Rarity;

public class BaseArmour extends Item {

    private int modifier;

    public BaseArmour(String name, Rarity rarity, int modifier) {
        super(name, rarity);
        this.modifier = modifier + rarity.getModifier();
    }

    public int getModifier() {
        return modifier;
    }

    @Override
    public void onPickup(Character character) {
        this.setOwner(character);
        character.setBaseArmour(this);
        character.getKlass().getArmourClass().increase(modifier);
    }
}
