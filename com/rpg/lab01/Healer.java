package com.rpg.lab01;

public class Healer {
    private String name;
    private int level;
    private int healPoints;
    private int maxHealPoints;
    private Weapon weapon;
    private String healerClass;
    private int healingPower;

    public Healer (String name, int level, int maxHealPoints, Weapon weapon, int healingPower) {
        this.name = name;
        this.level = level;
        this.healPoints = maxHealPoints;
        this.maxHealPoints = maxHealPoints;
        this.weapon = weapon;
        this.healerClass = "Healer";
        this.healingPower = healingPower;
    }

    public String getHealerClass() {
        return healerClass;
    }

    public void setHealerClass(String healerClass) {
        this.healerClass = healerClass;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public int Power() {
        return healingPower + (level * 3);
    }

    public void displayCharacterDetails() {
        System.out.println("--- " + this.name + " ---");
        System.out.println("  Class: " + this.healerClass);
        System.out.println("  Level: " + this.level);
        System.out.println("  Heal Points: " + this.healPoints + " / " + this.maxHealPoints);
        System.out.println("      Weapon: " + weapon);
        System.out.println("  Healing Power: " + Power());
    }

    public void heal() {
        System.out.println(this.name + " (" + this.healerClass + ") " + "casts a healing spell!");
        System.out.println("Healing Amount: " + Power() + " (Base: " + healingPower + " + Level Bonus: " + level*3 + ")");
        this.healPoints = this.healPoints + Power();
        if (this.healPoints > this.maxHealPoints) {
            this.healPoints = this.maxHealPoints;
        }
        System.out.println("Restored " + Power() + " HP! Current HP: " + this.healPoints + "/" + this.maxHealPoints);
    }

    public void healAlly(Character ally) {
        System.out.println(this.name + " (" + this.healerClass + ") " + "casts healing spell on " + ally.getName());
        System.out.println("Healing Amount: " + Power());
        int updateHP = ally.getHealPoints() + Power();
        ally.setHealPoints(updateHP);

        if (ally.getHealPoints() > ally.getMaxHealPoints()) {
            ally.setHealPoints(ally.getMaxHealPoints());
        }
        System.out.println("Restored " + Power() + " HP to "+ ally.getName() + "! Their HP: " + ally.getHealPoints() + "/" + ally.getMaxHealPoints());
    }
}
