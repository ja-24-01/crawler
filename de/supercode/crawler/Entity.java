package de.supercode.crawler;

public abstract class Entity {
    private String name;
    private int init; // Initiative
    private int str; // Stärke
    private int healthPoints; // Leben

    public Entity(String name, int init, int str, int healthPoints) {
        this.name = name;
        this.init = init;
        this.str = str;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public abstract void attack(Entity target);

}
