abstract class Hero{
    abstract void execute();
}

class Warrior extends Hero {

    @Override
    void execute() {
        System.out.println("Warrior");
    }
}

class Ninja extends Hero {

    @Override
    void execute() {
        System.out.println("Ninja");
    }
}

class Rogue extends Hero {

    @Override
    void execute() {
        System.out.println("Rogue");
    }
}

class StormFire extends BadLuck {

    @Override
    void execute(Hero h) {
        h.execute();
    }

    @Override
    void execute(Warrior w) {
        w.execute();
    }

    @Override
    void execute(Ninja n) {
        n.execute();
    }

    @Override
    void execute(Rogue r) {
        r.execute();
    }
}

public class Binding{
    public static void main(String args[]) {
        Hero h1 = new Warrior(), h2 = new Ninja();
        Hero h3 = new Rogue();
        BadLuck bl = new StormFire();
        bl.execute(h1);
        bl.execute(h2);
        bl.execute(h3);
    }
}

abstract class BadLuck {
    abstract void execute(Hero h);
    abstract void execute(Warrior w);
    abstract void execute(Ninja n);
    abstract void execute(Rogue r);
}