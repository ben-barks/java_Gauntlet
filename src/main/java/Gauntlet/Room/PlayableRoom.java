package Gauntlet.Room;

import Gauntlet.Interfaces.ITreasure;
import Gauntlet.Klass.Goblin;

public class PlayableRoom extends Room {
    private Character character;
    private Goblin goblin;
    private ITreasure treasure;
    private int difficulty;

    public PlayableRoom(Character character, Goblin goblin, ITreasure treasure, int difficulty) {
        this.character = character;
        this.goblin = goblin;
        this.treasure = treasure;
        this.difficulty = difficulty;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Goblin getGoblin() {
        return goblin;
    }

    public void setGoblin(Goblin goblin) {
        this.goblin = goblin;
    }

    public ITreasure getTreasure() {
        return treasure;
    }

    public void setTreasure(ITreasure treasure) {
        this.treasure = treasure;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void resolve(Character character, Goblin goblin){

    }

}
