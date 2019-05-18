package Gauntlet.Character;

import Gauntlet.Interfaces.*;
import Gauntlet.Items.Armour.BaseArmour;
import Gauntlet.Items.Weapons.BaseWeapon;
import Gauntlet.Klass.Klass;
import Gauntlet.StatusEffects.Buff.Drunk;
import Gauntlet.Util.DiceRoll;
import Gauntlet.Util.Purse;

public class Character implements IAttack, IDefend {
    private Klass klass;
    private Purse purse;
    private IUltimate ultimate;
    private IStatusEffect statusEffect;
    private BaseWeapon baseWeapon;
    private BaseArmour baseArmour;
    private int attackScore;
    private int defendScore;

    public Character(Klass klass, Purse purse, IUltimate ultimate) {
        this.klass = klass;
        this.purse = purse;
        this.ultimate = ultimate;
        this.attackScore = new DiceRoll().usingRandomClass() + 1;
        this.defendScore = new DiceRoll().usingRandomClass();
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

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }
}
