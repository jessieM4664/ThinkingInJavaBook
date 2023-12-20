package E12;

interface CanClimb {
    void climb();
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {System.out.println("fight()");}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    public void swim() {System.out.println("swim()");}
    public void fly() {System.out.println("fly()");}
    public void climb() {System.out.println("climb()");}
}

public class Main {
    public static void main(String args[]) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        c(h);
    }
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void c(CanClimb x) { x.climb(); }
    public static void w(ActionCharacter x) { x.fight(); }
}
