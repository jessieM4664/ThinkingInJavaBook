
public class Main {
    public static void main(String args[]) {
        Rodent arr[] = {new Mouse(), new Gerbil(), new Hampster() };

        for (int i = 0; i < 3; i++) {
            arr[i].move();
        }
    }
}

abstract class Rodent {
    abstract void move();
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