package de.supercode.crawler;

public class Weapon extends Item {
    private int damage;

    public Weapon(String bezeichner) {
        this(bezeichner, 5);
    }

    public Weapon(String bezeichner, int damage) {
        super(bezeichner);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
