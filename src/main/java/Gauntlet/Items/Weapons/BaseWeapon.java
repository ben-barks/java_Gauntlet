package Gauntlet.Items.Weapons;

import Gauntlet.Character.Character;
import Gauntlet.Items.Item;
import Gauntlet.Items.Rarity;

public class BaseWeapon extends Item {

    private int damage;

    public BaseWeapon(String name, Rarity rarity, int damage) {
        super(name, rarity);
        this.damage = damage + rarity.getModifier();
    }

    @Override
    public void onPickup(Character character) {
        this.setOwner(character);
        character.setWeapon(this);
    }
}
