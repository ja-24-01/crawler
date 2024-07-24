package de.supercode.crawler;

public class Treasure extends Item {
    private int value;

    public Treasure(int value, String bezeichner) {
        super(bezeichner);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
