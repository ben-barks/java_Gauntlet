package Gauntlet.Util;

import Gauntlet.Interfaces.ITreasure;

public class Purse {
    private int ca$$monaay;

    public Purse(int ca$$monaay) {
        this.ca$$monaay = ca$$monaay;
    }

    public int getCa$$monaay() {
        return ca$$monaay;
    }

    public void addMoney(ITreasure treasure){
        this.ca$$monaay += treasure.getValue() * 0.1;
    }

    public void removeMoney(ITreasure treasure){
        this.ca$$monaay = Math.min(Math.abs(ca$$monaay - treasure.getValue()), ca$$monaay);


    }


}
