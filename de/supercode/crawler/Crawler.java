package de.supercode.crawler;

public class Crawler {
    public static void main(String[] args) {
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("********* SUPER CRAWLER ADVENTURE CAPITALIST *********");
        System.out.println("******************************************************");
        System.out.println("******************************** v1.21324345234");
        Shop edeka = new Shop();
        Hero held = new Hero("Haralas", new Weapon("Schwert", 3));
        Monster monster = new Monster("Mordrak", new Treasure(10, "SteuerRückErstattung"), 2, 4, 10);
        Monster sauron = new Monster("Sauron", new Treasure(34, "Ein Berg"), 2, 4, 12);
        held.attack(monster);
        held.attack(monster); // monster tot
        held.looten(monster);
        held.looten(sauron);
        held.attack(sauron);
        held.attack(sauron);
        held.looten(sauron);
        held.setGold(held.getGold() + edeka.ankaufen(held.getBackPack()));
        held.flex();
        // Brauchen wir reine Items oder Entities? Nein
        // Um diese gar nicht erst initialisieren zu können, machen wir die Klassen
        // abstract
        // Item it = new Item(null);
        // Entity et = new Entity(null, 0, 0, 0);

    }
}
