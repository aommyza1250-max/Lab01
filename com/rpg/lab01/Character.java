package com.rpg.lab01;

public class Character {
    private String name;
    private int level;
    private int healPoints;
    private int maxHealPoints;
    private Weapon weapon;
    private String characterClass;

    public Character (String name, int level, int maxHealPoints, Weapon weapon, String characterClass) {
        this.name = name;
        this.level = level;
        this.healPoints = maxHealPoints;
        this.maxHealPoints = maxHealPoints;
        this.weapon = weapon;
        this.characterClass = characterClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getMaxHealPoints() {
        return maxHealPoints;
    }

    public void setMaxHealPoints(int maxHealPoints) {
        this.maxHealPoints = maxHealPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void displayCharacterDetails() {
        System.out.println("--- " + this.name + " ---");
        System.out.println("  Class: " + this.characterClass);
        System.out.println("  Level: " + this.level);
        System.out.println("  Heal Points: " + this.healPoints + " / " + this.maxHealPoints);
        System.out.println("      Weapon: " + weapon);
        System.out.println();
    }

    public int attack() {
        int damage = weapon.getBaseDamage() + (level * 2);
        System.out.println(name + " (" + characterClass + ") attacks with " + weapon.getName() + "!");
        System.out.println("Attack Damage: " + damage + " (Weapon base: " + weapon.getBaseDamage() + " + " + "Level Bonus: " + (level*2) + ")");
        return damage;
    }

    public void takeDamage(int damage) {
        healPoints -= damage;
        if (healPoints < 0) {
            healPoints = 0;
        }
        System.out.println(this.name + " take " + damage + " damage! Current HP: " + healPoints + "/" + maxHealPoints);

    }

    public void levelUp() {
        level += 1;
        maxHealPoints += 10;
        System.out.println(this.name + " leveled up to Level " + this.level + "!");
        System.out.println("    Max Health increased to " + this.maxHealPoints + " (full heal applied)");
//        Max Health increased to 1510 (full heal applied)
    }
}
