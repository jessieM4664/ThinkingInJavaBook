package E12;

public class Rodent {
    Rodent() {System.out.println("Rodent()");}
    void move() {
        System.out.println("Rodent scurrying");
    }
    public static void main(String args[]) {
        Rodent rodents[] = {
            new Mouse(), new Gerbil(), new Hampster() };

        for (int i = 0; i < rodents.length; i++) {
            rodents[i].move();
        }
    }
}
class Mouse extends Rodent {
    Mouse() {System.out.println("Mouse()");}
    void move() {
        System.out.println("Mouse scurrying");
    }
}
class Gerbil extends Rodent {
    Gerbil() {System.out.println("Gerbil()");}
    void move() {
        System.out.println("Gerbil scurrying");
    }
}
class Hampster extends Rodent {
    Hampster() {System.out.println("Hampster()");}
    void move() {
        System.out.println("Hampster scurrying");
    }
}