package Gauntlet.Items;

public enum Rarity {
    COMMON(0),
    UNCOMMON(1),
    RARE(2),
    EPIC(3),
    LEGENDARY(5);

    private final int modifier;

    Rarity(int modifier) {
        this.modifier = modifier;
    }

    public int getModifier() {
        return modifier;
    }
}
