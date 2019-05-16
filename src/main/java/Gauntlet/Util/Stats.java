package Gauntlet.Util;

public class Stats {

    private Stat strength;
    private Stat dexterity;
    private Stat intelligence;

    public Stats(int strength, int dexterity, int intelligence) {
        this.strength = new Stat(strength);
        this.dexterity = new Stat(dexterity);
        this.intelligence = new Stat(intelligence);
    }

    public Stat getStrength() {
        return strength;
    }

    public Stat getDexterity() {
        return dexterity;
    }

    public Stat getIntelligence() {
        return intelligence;
    }

    public class Stat {

        private int defaultStat;
        private int current;

        public Stat(int value) {
            this.defaultStat = value;
            this.current = value;
        }

        public int getDefaultStat() {
            return defaultStat;
        }

        public void setDefaultStat(int defaultStat) {
            this.defaultStat = defaultStat;
        }

        public void setToDefault(){
            this.current = defaultStat;
        }

        public int getCurrent() {
            return current;
        }

        public void set(int current) {
            this.current = current;
        }

        public void decrease(int amount) {
            this.current -= amount;
        }
        public void increase(int amount) {
            this.current += amount;
        }
    }
}
