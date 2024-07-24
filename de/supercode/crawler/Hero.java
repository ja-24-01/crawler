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

    @Override
    public void attack(Entity target) {
        int damage = this.getStr() + weapon.getDamage();
        System.out
                .println("Unser Held " + this.getName() + " haut " + target.getName() + " " + damage
                        + " Schaden auf die Rübe");
        if (damage >= target.getHealthPoints()) {
            System.out.println(target.getName() + " ist gestorben, kannst jetzt plündern");
        } else {
            target.setHealthPoints(target.getHealthPoints() - damage);
            System.out.println(target.getName() + " hat noch " + target.getHealthPoints() + " Lebenspunkte");
        }
    }

}
