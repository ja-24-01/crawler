package de.supercode.crawler;

public class Shop {
    public int ankaufen(Backpack backpack) {
        int gold = 0;
        for (Item item : backpack.getItems()) {
            if (item instanceof Treasure) {
                gold += ((Treasure) item).getValue();
            }
        }
        backpack.getItems().clear();

        return gold;
    }
}
