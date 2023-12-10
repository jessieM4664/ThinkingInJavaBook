package E9;

public class Rodent {
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
    void move() {
        System.out.println("Mouse scurrying");
    }
}
class Gerbil extends Rodent {
    void move() {
        System.out.println("Gerbil scurrying");
    }
}
class Hampster extends Rodent {
    void move() {
        System.out.println("Hampster scurrying");
    }
}