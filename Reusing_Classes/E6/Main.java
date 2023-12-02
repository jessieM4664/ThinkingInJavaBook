package E6;

public class Main extends B {
    Main() {
        super(11);
        System.out.println("Main constructor");
    }
    public static void main(String args[]) {
        new Main();
    }
}

class A {
    A(int i) {
        System.out.println("A constructor");
    }
}

class B extends A {
    B(int i) {
        super(i);
        System.out.println("B constrctor");
    }
}
