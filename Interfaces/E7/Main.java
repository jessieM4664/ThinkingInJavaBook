package E7;

interface Rodent {
    void move();
}

public class Main {
    public static void main(String args[]) {//
        Rodent rodents[] = {
            new Mouse(), new Gerbil(), new Hampster() };

        for (int i = 0; i < rodents.length; i++) {
            rodents[i].move();
        }
    }
}
class Mouse implements Rodent {
    public void move() {
        System.out.println("Mouse scurrying");
    }
}
class Gerbil implements Rodent {
    public void move() {
        System.out.println("Gerbil scurrying");
    }
}
class Hampster implements Rodent {
    public void move() {
        System.out.println("Hampster scurrying");
    }
}