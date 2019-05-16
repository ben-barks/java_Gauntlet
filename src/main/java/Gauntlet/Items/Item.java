package Gauntlet.Items;

import Gauntlet.Character.Character;
import Gauntlet.Interfaces.IPickup;

public abstract class Item implements IPickup {
    private String name;
    private Rarity rarity;
    private Character owner;

    public Item( String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    public Character getOwner() {
        return owner;
    }

    public void setOwner(Character owner) {
        this.owner = owner;
    }
}
