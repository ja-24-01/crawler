package de.supercode.crawler;

public class Monster extends Entity {
    private Treasure treasure;

    public Monster(String name, Treasure treasure, int init, int str, int hp) {
        super(name, init, str, hp);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    @Override
    public void attack(Entity target) {

    }

}
