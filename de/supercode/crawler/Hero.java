package de.supercode.crawler;

public class Hero extends Entity {
    private Weapon weapon;
    private int exp;
    private int level;
    private int gold;
    private Backpack backPack;

    public Hero(String name, Weapon weapon) {
        super(name, 3, 4, 20);
        this.backPack = new Backpack();
        this.weapon = weapon;
        this.exp = 0;
        this.level = 0;
        this.gold = 0;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Backpack getBackPack() {
        return backPack;
    }

    public void setBackPack(Backpack backPack) {
        this.backPack = backPack;
    }

    @Override
    public void attack(Entity target) {
        int damage = this.getStr() + weapon.getDamage();
        System.out
                .println("Unser Held " + this.getName() + " haut " + target.getName() + " " + damage
                        + " Schaden auf die Rübe");
        target.setHealthPoints(target.getHealthPoints() - damage);
        if (target.getHealthPoints() <= 0) {
            System.out.println(target.getName() + " ist gestorben, kannst jetzt plündern");

        } else {

            System.out.println(target.getName() + " hat noch " + target.getHealthPoints() + " Lebenspunkte");
        }

    }

    public void looten(Monster monster) {
        // erstmal testen ob der bursche wirklich tot ist
        if (monster.getHealthPoints() > 0) {
            System.out.println("Du musst das Monster erst besiegen. Nix mit Loot.");
            return;
        }
        backPack.putInBackpack(monster.getTreasure());
    }

    public void flex() {
        System.out.println(this.getName() + " hat " + this.gold + " Gold auf Täsch");
    }
}
