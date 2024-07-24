package de.supercode.crawler;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int size;
    private List<Item> items;

    public Backpack() {
        this.size = 5;
        items = new ArrayList<>();
    }

    public void putInBackpack(Item item) {
        if (size < items.size()) {
            items.add(item);
        } else {
            System.out.println("Dein Rucksack ist voll!!!!");
        }
    }

    public List<Item> getItems() {
        return items;
    }

}
