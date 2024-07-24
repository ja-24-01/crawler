package de.supercode.crawler;

public class Crawler {
    public static void main(String[] args) {
        Hero held = new Hero("Haralas", new Weapon("Schwert", 3));
        Monster monster = new Monster("Mordrak", new Treasure(10, "SteuerRückErstattung"), 2, 4, 10);
        held.attack(monster);
        held.attack(monster);
        // Brauchen wir reine Items oder Entities? Nein
        // Um diese gar nicht erst initialisieren zu können, machen wir die Klassen
        // abstract
        // Item it = new Item(null);
        // Entity et = new Entity(null, 0, 0, 0);

    }
}
