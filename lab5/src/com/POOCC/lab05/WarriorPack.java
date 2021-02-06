package com.POOCC.lab05;

/**
 * 
 */
import java.util.*;

public class WarriorPack {
    private Vector warriors;

    public WarriorPack() {
        warriors = new Vector();
    }

    public void addWarrior(com.POOCC.lab05.Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
                damage +=  ( (com.POOCC.lab05.Warrior) warriors.get(i)).getDamage() ;
        }
        return damage;
    }

    public static void main(String[] args) {
        Snake p1 = new Snake(90, "Alexandra");
        Ogre p2 = new Ogre(60, "Razvan");
        MarshmallowMan p3 = new MarshmallowMan( 100, "Andra");
        Snake p4 = new Snake(100, "Borcanel");
        WarriorPack obj = new WarriorPack();
        obj.addWarrior(p1);
        obj.addWarrior(p2);
        obj.addWarrior(p3);
        obj.addWarrior(p4);
        System.out.println(obj.calculateDamage());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
class Snake extends com.POOCC.lab05.Warrior {

    public Snake(int health, String name) {
        super(health, name);
    }
    public int getDamage() {
        return 10;
    }
}

class Ogre extends com.POOCC.lab05.Warrior {

    public Ogre(int health, String name) {
        super(health, name);
    }
    public int getDamage() {
        return 6;
    }
}


class MarshmallowMan extends com.POOCC.lab05.Warrior {

    public MarshmallowMan(int health, String name) {
        super(health, name);
    }
    public int getDamage() {
        return 1;
    }
}



