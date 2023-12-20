package E14;

interface A {
    void up();
    void down();
}

interface B {
    void down();
}

interface C {
    void up();
}

interface D extends A, B, C {
    void left();
}

class Frog implements D {
    public void up() {
        System.out.println("Frog.up()");
    }
    public void down() {
        System.out.println("Frog.down()");
    }
    public void left() {
        System.out.println("Frog.left()");
    }
}

public class Main {
    public static void main(String args[]) {
        D d = new Frog();
        d.down();
    }
}
