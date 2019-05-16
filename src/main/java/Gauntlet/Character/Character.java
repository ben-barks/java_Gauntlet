package Gauntlet.Character;

import Gauntlet.Interfaces.IPickup;
import Gauntlet.Interfaces.IStatusEffect;
import Gauntlet.Interfaces.IUltimate;
import Gauntlet.Items.Armour.BaseArmour;
import Gauntlet.Items.Weapons.BaseWeapon;
import Gauntlet.Klass.Klass;
import Gauntlet.StatusEffects.Buff.Drunk;
import Gauntlet.Util.Purse;

public class Character {
    private Klass klass;
    private Purse purse;
    private IUltimate ultimate;
    private IStatusEffect statusEffect;
    private BaseWeapon baseWeapon;
    private BaseArmour baseArmour;

    public Character(Klass klass, Purse purse, IUltimate ultimate) {
        this.klass = klass;
        this.purse = purse;
        this.ultimate = ultimate;
    }

    public Klass getKlass() {
        return klass;
    }

    public Purse getPurse() {
        return purse;
    }

    public IUltimate getUltimate() {
        return ultimate;
    }

    public void dropWeapon(){
        this.baseWeapon = null;
    }

    public void doffArmour(){
        this.klass.getArmourClass().decrease(baseArmour.getModifier());
        this.baseArmour = null;
    }

    public void pickUp(IPickup pickup){
        pickup.onPickup(this);
    }

    public void setWeapon(BaseWeapon baseWeapon) {
        this.baseWeapon = baseWeapon;
    }

    public void setBaseArmour(BaseArmour baseArmour) {
        this.baseArmour = baseArmour;
    }

    public BaseWeapon getWeapon() {
        return baseWeapon;
    }

    public BaseArmour getArmour() {
        return baseArmour;
    }

    public void addStatusEffect(IStatusEffect statusEffect){
        statusEffect.apply(this);
    }

    public void removeStatusEffect(){
        if(statusEffect == null) return;
        this.statusEffect.remove(this);
        this.statusEffect = null;
    }

    public IStatusEffect getStatusEffect() {
        return statusEffect;
    }

    public void setStatusEffect(IStatusEffect statusEffect) {
        this.statusEffect = statusEffect;
     }
}
