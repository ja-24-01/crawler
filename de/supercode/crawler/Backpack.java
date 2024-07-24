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
        if (size > items.size()) {
            items.add(item);
            System.out.println("Du hast jetzt: " + items.size() + " Ding(e) in deinen Rucksack");
        } else {
            System.out.println("Dein Rucksack ist voll!!!!");
        }
    }

    public List<Item> getItems() {
        return items;
    }

}
