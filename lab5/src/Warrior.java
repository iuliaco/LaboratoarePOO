package com.POOCC.lab05;

/**
 * 
 */
public class Warrior {
//    public static final int SNAKE_Warrior = 0;
//    public static final int OGRE_Warrior = 1;
//    public static final int MARSHMALLOW_MAN_Warrior = 2;

    //Stores one of the three above types
    //0 = dead, 100 = full strength
    private int health;
    private String name;
    private int damage;
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }
}
