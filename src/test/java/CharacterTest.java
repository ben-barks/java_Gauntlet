import Gauntlet.Character.Character;
import Gauntlet.Interfaces.IUltimate;
import Gauntlet.Items.Armour.BaseArmour;
import Gauntlet.Items.Armour.LeatherArmour;
import Gauntlet.Items.Rarity;
import Gauntlet.Items.Weapons.BaseWeapon;
import Gauntlet.Items.Weapons.Dagger;
import Gauntlet.Klass.Melee;
import Gauntlet.Util.Purse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    Character character;
    BaseArmour baseArmour;

    @Before
    public void before(){
        baseArmour = new LeatherArmour("Daisy the cow's forehead", Rarity.EPIC);
        character = new Character(new Melee(), new Purse(0), new IUltimate() {
            @Override
            public void activate(Character character) {

            }
        });
    }
    @Test
    public void hasKlass(){
        assertNotNull(character.getKlass());
    }

    @Test
    public void hasPurse(){
        assertNotNull(character.getPurse());
    }

    @Test
    public void hasUltimate(){
        assertNotNull(character.getUltimate());
    }

    @Test
    public void canPickUpWeapon(){
        BaseWeapon weapon = new Dagger("Stabby Joe", Rarity.LEGENDARY);
        character.pickUp(weapon);
        assertEquals(weapon, character.getWeapon());
    }

    @Test
    public void canPickUpArmour(){
        character.pickUp(baseArmour);
        assertEquals(baseArmour, character.getArmour());
    }

    @Test
    public void acChangesWhenArmourPickedUp(){
        character.pickUp(baseArmour);
        assertEquals(9, character.getKlass().getArmourClass().getCurrent());
    }

}
